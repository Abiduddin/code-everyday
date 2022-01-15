package lambda;

public class Lambda1 {

    interface  MyNumber {
        double getNumber();
    }
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;

        System.out.println("myNumber value: " + myNumber.getNumber());

        myNumber = () -> Math.random() * 100;

        System.out.println("myNumber random value: " + myNumber.getNumber());



    }
}
