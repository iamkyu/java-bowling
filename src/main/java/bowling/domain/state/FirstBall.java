package bowling.domain.state;

public class FirstBall implements State {

    private int pins;
    private int firstShotPins;

    public FirstBall(int firstShotPins) {
        this.firstShotPins = firstShotPins;
        this.pins = firstShotPins;
    }

    @Override
    public State roll(int pins) {
        int tmp = pins; //FIXME

        this.pins += pins;

        if (isKnockDownAll()) {
            return new Spare(firstShotPins, tmp);
        }

        return new Miss(firstShotPins, tmp);
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
}
