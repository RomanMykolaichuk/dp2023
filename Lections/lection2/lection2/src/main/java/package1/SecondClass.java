package package1;

public class SecondClass extends FirstClass {
    int someNumber;

    public SecondClass() {
    }

    public SecondClass(int number, int someNumber) {
        super(number);
        this.someNumber = someNumber;
    }

    public int getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }

    public int multiply(int number, int someNumber){
        return number*someNumber;
    }

    @Override
    public int multiply(){
        return this.getNumber()*this.getSomeNumber();
    }


}
