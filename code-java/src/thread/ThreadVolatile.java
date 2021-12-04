package thread;

public class ThreadVolatile {

    private static volatile int pizzaCount;
    private static int burgerCount;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int temp = 0;
            int temp1 = 0;
            while (true) {
                if (temp != pizzaCount) {
                    temp = pizzaCount;
                    System.out.println("reader: total pizza = " + pizzaCount);
                }

                if (temp1 != burgerCount) {
                    temp1 = burgerCount;
                    System.out.println("reader: total burger = " + burgerCount);
                }

            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                pizzaCount++;
                burgerCount++;

                System.out.println("writer: total pizza change to = " + pizzaCount);
                System.out.println("writer: total burger change to = " + burgerCount);
            }
        });

        thread.start();
        thread1.start();
    }
}
