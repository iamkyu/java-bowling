package bowling.domain.state;

public class FirstBall implements State {
    private int firstRoll;

    public FirstBall(int firstRoll) {
        this.firstRoll = firstRoll;
        this.pins = firstRoll;
    }

    @Override
    public State roll(int pins) {
        this.pins += pins;

        if (isKnockDownAll()) {
            return new Spare(firstRoll, 10 - firstRoll);
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
