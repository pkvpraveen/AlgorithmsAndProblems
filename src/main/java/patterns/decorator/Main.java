package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        StuntMaster master = new Sasi();
        System.out.println("master.name() = " + master.name());
        master = new MafiaDecoration(master);
        System.out.println("master.name() = " + master.name());

    }
}
