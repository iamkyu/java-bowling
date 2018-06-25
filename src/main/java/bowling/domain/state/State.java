package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;
import bowling.domain.Pins;

public interface State {
    Pins pins = new Pins();

    State roll(int pins) throws MaximumRollExceededException;

    boolean isKnockDownAll();

    int getPins();

    boolean canRoll();

    String getScoreBySymbol();
}
