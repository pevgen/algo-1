package ml.pevgen.algo.others;


/**
 * Wait/notify example
 */
public class TwoThreadsPingPong {

    private final int counter;

    public TwoThreadsPingPong(int counter) {
        this.counter = counter;
    }

    public synchronized void ping() {

        int i = 0;
        while (true) {
            i++;
            System.out.println("ping");
            try {
                Thread.sleep(1000);
                notifyAll();
                if (i > counter) {
                    System.out.println("end ping");
                    return;
                }
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }


    public synchronized void pong() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("pong");
            try {
                Thread.sleep(1000);
                notifyAll();
                if (i > counter) {
                    System.out.println("end pong");
                    return;
                }
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

    }


    public static void main(String[] args) {
        TwoThreadsPingPong pp = new TwoThreadsPingPong(1);
        new Thread(pp::ping).start();
        new Thread(pp::pong).start();
    }

}
