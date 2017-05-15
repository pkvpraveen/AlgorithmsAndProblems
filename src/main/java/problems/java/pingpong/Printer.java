package problems.java.pingpong;

class Printer {

    private boolean isPing = false;

    synchronized void printPing(int i) {
        while (isPing) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping" + i);
        isPing = true;
        notify();
    }

    synchronized void printPong(int i) {
        while (!isPing) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pong" + i);
        isPing = false;
        notify();
    }
}
