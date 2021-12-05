package thread;

class RunnableImpl implements Runnable {

    @Override
    public void run() {

        int a = 50;

        while (a-- > 0)
            System.out.println("run - " + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadImpl extends Thread {

    @Override
    public void run() {

        int a = 50;

        while (a-- > 0)
            System.out.println("run - " + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableImpl());
        thread.start();

        ThreadImpl thread1 = new ThreadImpl();
        thread1.start();

        //getName
        //getPriority
        //isAlive
        //join
        //run
        //sleep
        //start
    }
}
