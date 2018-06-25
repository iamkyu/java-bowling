package bowling.domain.state;

public class FirstBall implements State {

    public FirstBall(int firstRoll) {
        pins.knockDown(firstRoll);
    }

    @Override
    public State roll(int knockDownPins) {
        pins.knockDown(knockDownPins);

        if (pins.isKnockDownAll()) {
            return new Spare(pins);
        }

        return new Miss(pins);
    }

    @Override
    public boolean canRoll() {
        return true;
    }
}
