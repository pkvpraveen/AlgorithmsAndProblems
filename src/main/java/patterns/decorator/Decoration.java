package patterns.decorator;

public abstract class Decoration implements StuntMaster {
    protected StuntMaster stuntMaster;

    public Decoration(StuntMaster stuntMaster) {
        this.stuntMaster = stuntMaster;
    }

    public abstract String name();
}
