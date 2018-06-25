package bowling.domain.state;

public class Ready implements State {

    @Override
    public State roll(int knockDownPins) {
        this.pins.knockDown(knockDownPins);

        if (isKnockDownAll()) {
            return new Strike();
        }

        return new FirstBall(knockDownPins);
    }

    @Override
    public boolean isKnockDownAll() {
        return pins.isKnockDownAll();
    }

    @Override
    public int getPins() {
        return pins.getKnockDownPins();
    }

    @Override
    public boolean canRoll() {
        return false;
    }

    @Override
    public String getScoreBySymbol() {
        return "";
    }
}
