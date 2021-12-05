package thread;

public class ThreadVolatile {

    private static volatile int pizzaCount;
//    private static int pizzaCount;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int temp = 0;
            while (true) {
                if (temp != pizzaCount) {
                    temp = pizzaCount;
                    System.out.println("reader: total pizza = " + pizzaCount);
                }
            }

        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                pizzaCount++;

                System.out.println("writer: total pizza change to = " + pizzaCount);
            }
        });

        thread.start();
        thread1.start();
    }
}
