public class MyFirstClass {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass(1,"NameOne");
//        secondClass.setId(1);
//        secondClass.setName("NameOne");
        secondClass.printName();
        System.out.println(secondClass);
    }
}
