package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;

public class Strike implements State {

    @Override
    public State roll(int knockDownPins) {
        throw new MaximumRollExceededException();
    }

    @Override
    public boolean canRoll() {
        return false;
    }
}
