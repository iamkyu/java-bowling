package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {

    private static final int MAX_FRAMES = 10;
    private List<Frame> frames;

    public Frames() {
        frames = new ArrayList<>(MAX_FRAMES);
    }

    public void roll(int knockDownPins) {

    }

    public int getFramesScore() {
        return 0;
    }
}
