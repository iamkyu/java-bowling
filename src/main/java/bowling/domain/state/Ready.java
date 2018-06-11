package bowling.domain.state;

public class Ready implements State {

    private int pins = 0;

    @Override
    public State roll(int pins) {
        this.pins = pins;

        if (isKnockDownAll()) {
            return new Strike();
        }

        return new FirstBall(pins);
    }

    @Override
    public boolean isKnockDownAll() {
        return pins == 10; // fixme pins 상태를 가지고 있을 필요가 있나?
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
