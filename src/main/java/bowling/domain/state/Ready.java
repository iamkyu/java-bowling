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
    public boolean canRoll() {
        return true;
    }
}
