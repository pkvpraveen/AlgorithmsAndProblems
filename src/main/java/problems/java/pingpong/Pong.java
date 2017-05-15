package problems.java.pingpong;

public class Pong implements Runnable {
    private Printer printer;

    Pong(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printPong(i);
        }
    }
}
