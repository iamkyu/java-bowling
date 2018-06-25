package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;

public class Spare implements State {

    public Spare(int firstShotPins, int secondShotPins) {
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
