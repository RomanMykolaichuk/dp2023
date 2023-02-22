import entities.MyEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Main {



    public static void main(String[] args) {

        List<MyEntity> entities;

        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(MyEntity.class)
                .buildMetadata()
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.save(new MyEntity(3, "name3"));
            session.save(new MyEntity(2, "name2"));

//            MyEntity updateEntity1 = new MyEntity(1, "updated_name_1");
//            session.update(updateEntity1);
//            session.delete(new MyEntity(2, "name2"));

            entities = (List<MyEntity>) session.createQuery("from MyEntity").list();

            session.getTransaction().commit();

        }

        for (MyEntity entity: entities){
            System.out.println(entity);
        }
        System.out.println("Success!");
    }
}
