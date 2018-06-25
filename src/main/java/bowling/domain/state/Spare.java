package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;

public class Spare implements State {
    private final int firstShotPins;
    private final int secondShotPins;

    public Spare(int firstShotPins, int secondShotPins) {
        this.firstShotPins = firstShotPins;
        this.secondShotPins = secondShotPins;
    }

    @Override
    public State roll(int knockDownPins) {
        throw new MaximumRollExceededException();
    }

    @Override
    public boolean isKnockDownAll() {
        return true;
    }

    @Override
    public int getPins() {
        return secondShotPins;
    }

    @Override
    public boolean canRoll() {
        return true;
    }

    @Override
    public String getScoreBySymbol() {
        return String.format("%d|/", firstShotPins);
    }
}
