package bowling.domain.state;

public class FirstBall implements State {

    public FirstBall(int firstRoll) {
        pins.knockDown(firstRoll);
    }

    @Override
    public State roll(int knockDownPins) {
        pins.knockDown(knockDownPins);

        if (pins.isKnockDownAll()) {
            return new Spare(pins.get(0), pins.get(1));
        }

        return new Miss(firstRoll, 10 - firstRoll);
    }

    @Override
    public boolean isKnockDownAll() {
        return pins == 10;
    }

    @Override
    public int getPins() {
        return pins;
    }

    @Override
    public boolean canRoll() {
        return false;
    }

    @Override
    public String getScoreBySymbol() {
        String first = firstRoll == 0 ? "-" : String.valueOf(firstRoll);
        return String.format("%s", first);
    }
}
