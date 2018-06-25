package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;

public class Miss implements State {
    private final int firstShotPins;
    private final int secondShotPins;

    public Miss(int firstShotPins, int secondShotPins) {
        this.firstShotPins = firstShotPins;
        this.secondShotPins = secondShotPins;
    }

    @Override
    public State roll(int pins) {
        throw new MaximumRollExceededException();
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

    @Override
    public String getScoreBySymbol() {
        String first = firstShotPins == 0 ? "-" : String.valueOf(firstShotPins);
        String second = firstShotPins == 0 ? "-" : String.valueOf(secondShotPins);

        return String.format("%s|%s", first, second);
    }
}
