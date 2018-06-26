package bowling.domain;

public class Frame {

    private Pins pins = new Pins();

    public void roll(int knockDownPins) {
        this.pins.knockDown(knockDownPins);
    }
}
