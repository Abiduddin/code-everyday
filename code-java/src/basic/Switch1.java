package basic;


public class Switch1 {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("elements: 1");
                break;
            case 2:
                System.out.println("elements: 2");
                break;
            case 3:
                System.out.println("elements: 3");
                break;
            case 4:
                System.out.println("elements: 4");
                break;
            default:
                System.out.println("no element");
                break;
        }
        System.out.println(getSomething(number));
    }

    public static int getSomething(int number) {
        switch (number) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }
}