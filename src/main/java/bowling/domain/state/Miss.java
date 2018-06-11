package bowling.domain.state;

import bowling.domain.ExceedException;

public class Miss implements State {

    private final int firstShotPins;
    private final int secondShotPins;

    public Miss(int firstShotPins, int secondShotPins) {
        this.firstShotPins = firstShotPins;
        this.secondShotPins = secondShotPins;
    }

    @Override
    public State roll(int pins) {
        throw new ExceedException();
    }

    @Override
    public boolean isKnockDownAll() {
        return false;
    }

    @Override
    public int getPins() {
        return firstShotPins + secondShotPins;
    }

    @Override
    public boolean canRoll() {
        return true;
    }
}
