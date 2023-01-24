import java.util.Objects;

public class SecondClass {
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public SecondClass() {

    }

    public SecondClass(int id, String name) {
        this.id = id;
        this.name = name;
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

    public void printName(){
        System.out.println(this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondClass that = (SecondClass) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "SecondClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
