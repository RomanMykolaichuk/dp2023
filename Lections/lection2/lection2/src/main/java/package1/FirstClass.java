package package1;

public class FirstClass {

    private int number;

    public FirstClass() {
    }

    public FirstClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int multiply(){
        return this.number*this.number;
    }

    public int multiply(int number){
        return this.number*number;
    }



}
