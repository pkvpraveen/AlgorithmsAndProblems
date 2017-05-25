package patterns.decorator;

public class MafiaDecoration extends Decoration {
    public MafiaDecoration(StuntMaster stuntMaster) {
        super(stuntMaster);
    }

    @Override
    public String name() {
        return "Mafia " + stuntMaster.name();
    }
}
