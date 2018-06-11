package bowling.domain.state;

import bowling.domain.ExceedException;

public class Spare implements State {

    private final int firstShotPins;
    private final int pins;

    public Spare(int firstShotPins, int pins) {
        this.firstShotPins = firstShotPins;
        this.pins = pins;
    }

    @Override
    public State roll(int pins) {
        throw new ExceedException();
    }

    @Override
    public boolean isKnockDownAll() {
        return true;
    }

    @Override
    public int getPins() {
        return pins;
    }

    @Override
    public boolean canRoll() {
        return true;
    }
}
