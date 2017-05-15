package problems.java.pingpong;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Ping implements Runnable {
    private Printer printer;

    Ping(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printPing(i);
        }
    }
}
