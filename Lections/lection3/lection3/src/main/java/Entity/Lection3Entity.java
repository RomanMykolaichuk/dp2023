package Entity;

import java.util.Comparator;
import java.util.Objects;

public class Lection3Entity implements Comparable<Lection3Entity> {

    private int id;
    private String name;
    private int age;

    private final Comparator<Lection3Entity> nameComparator = (o1,o2)-> o1.getName().compareTo(o2.getName());
    private final Comparator<Lection3Entity> ageComparator = (o1,o2)-> o1.getAge()-o2.getAge();

    public Lection3Entity() {
    }

    public Lection3Entity(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Comparator<Lection3Entity> getNameComparator() {
        return nameComparator;
    }

    public Comparator<Lection3Entity> getAgeComparator() {
        return ageComparator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lection3Entity that = (Lection3Entity) o;
        return id == that.id && age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Lection3Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Lection3Entity o) {
        return this.getId()-o.getId();
    }
}
