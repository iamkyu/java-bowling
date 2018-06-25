package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;

public class Miss implements State {

    public Miss(int firstShotPins, int secondShotPins) {
        pins.knockDown(firstShotPins);
        pins.knockDown(secondShotPins);
    }

    @Override
    public State roll(int knockDownPins) {
        throw new MaximumRollExceededException();
    }

    @Override
    public boolean canRoll() {
        return false;
    }
}
