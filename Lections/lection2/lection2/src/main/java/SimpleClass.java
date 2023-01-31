import package1.FirstClass;
import package1.SecondClass;
import sample.BarkInterface;
import sample.Dog;
import sample.FirstBarkImpl;
import sample.SecondBark;

public class SimpleClass {


    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(31);

//        System.out.println(firstClass.getNumber());

//        System.out.println(firstClass.multiply(4));

        SecondClass secondClass = new SecondClass(4,5);

        int multiply = secondClass.multiply(secondClass.getNumber(),secondClass.getSomeNumber());

//        System.out.println(multiply);

        BarkInterface bark1 = new FirstBarkImpl();
        BarkInterface bark2 = new SecondBark();

        Dog dog = new Dog(bark1);
        dog.getBark().bark();

        dog.setBark(bark2);

        dog.getBark().bark();




    }

}
