import Entity.Lection3Entity;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,45,4,23,6,88,88,2,3);

        System.out.println("List size "+intList.size());

        Set<Integer> intSet = new HashSet<>();

        intSet.addAll(intList);

        System.out.println("Set size " + intSet.size());


        List<Lection3Entity> entityList = new ArrayList<>();

        entityList.add(new Lection3Entity(1, "Roman", 50));
        entityList.add(new Lection3Entity(3, "Alice", 20));
        entityList.add(new Lection3Entity(2, "Vasyl", 30));

//        System.out.println();
//        System.out.println("Iterating collections");
//        System.out.println("For loop");
//        for (int i=0; i<entityList.size();i++){
//            System.out.println(entityList.get(i));
//        }
//
//        System.out.println("Foreach loop");
//        for (Lection3Entity l3e: entityList) {
//            System.out.println(l3e);
//        }
//
//        System.out.println("Iterator");
//
//        Iterator<Lection3Entity> iterator = entityList.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("Foreach loop with filter");
//        for (Lection3Entity l3e: entityList) {
//           if(l3e.getAge()>20) { System.out.println(l3e);}
//        }
//
//
//        Lection3Entity lection3Entity = new Lection3Entity(1, "Roman", 51);
//
//        System.out.println(entityList.contains(lection3Entity));
//
//
        // collections sorting

        System.out.println();

        System.out.println("Unsorted list");
        System.out.println(entityList);

        System.out.println("Sorted list");

        Collections.sort(entityList);
        System.out.println(entityList);

        System.out.println("Name comparator list");

        Collections.sort(entityList, entityList.get(0).getNameComparator());

        System.out.println(entityList);

        System.out.println("Age comparator list");

        entityList.sort(entityList.get(0).getAgeComparator());

        System.out.println(entityList);


        System.out.println("Age comparator list reversed");

        entityList.sort(entityList.get(0).getAgeComparator().reversed());

        System.out.println(entityList);


        System.out.println();

        List<Lection3Entity> newList = entityList.stream().filter((entity)->entity.getAge()>20).toList();

        System.out.println("New List "+newList);

        System.out.println();

        List<String> stringList = entityList.stream().filter((entity)->entity.getAge()>20).map(Lection3Entity::getName).toList();



        System.out.println("String List "+stringList);

    }
}
