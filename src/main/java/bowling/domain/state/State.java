package bowling.domain.state;

import bowling.domain.ExceedException;

public interface State {

    State roll(int pins) throws ExceedException;

    boolean isKnockDownAll();

    int getPins();

    boolean canRoll();
}
