package bowling.domain.state;

import bowling.domain.MaximumRollExceededException;
import bowling.domain.Pins;

public interface State {
    Pins pins = new Pins();

    State roll(int knockDownPins) throws MaximumRollExceededException;

    boolean canRoll();

    default boolean isKnockDownAll() {
        return pins.isKnockDownAll();
    }

    default int getPins() {
        return pins.getKnockDownPins();
    }

    default String getScoreBySymbol() {
        return pins.getSymbol();
    }
}
