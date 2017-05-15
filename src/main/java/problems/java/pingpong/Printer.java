package problems.java.pingpong;

class Printer {

    private boolean isPing = false;

    synchronized void printPing(int i) {
        if (isPing) {
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
        if (!isPing) {
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
