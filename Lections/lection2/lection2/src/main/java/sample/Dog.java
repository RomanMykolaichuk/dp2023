package sample;

public class Dog {
   BarkInterface bark;

    public Dog(BarkInterface bark) {
        this.bark = bark;
    }

    public BarkInterface getBark() {
        return bark;
    }

    public void setBark(BarkInterface bark) {
        this.bark = bark;
    }
}
