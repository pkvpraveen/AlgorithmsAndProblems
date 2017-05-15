package problems.java.pingpong;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread ping = new Thread(new Ping(printer));
        Thread pong = new Thread(new Pong(printer));

        ping.start();
        pong.start();

    }
}
