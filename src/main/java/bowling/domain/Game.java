package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>();

    private int currentFrame = 1;
    private Frame frame = new Frame(currentFrame);

    public Game() {
        frames.add(frame);
    }

    public void roll(int pins) {
        if (frame.isEndFrame()) {
            setNextFrame();
        }
        frame.roll(pins);
    }

    private void setNextFrame() {
        frame = new Frame(++currentFrame);
        frames.add(frame);
    }

    public int getScore() {
        int score = 0;

        for (int i = 0; i < frames.size(); i++) {
            if (frames.get(i).getScore() == 10) {
                score += frames.get(i).getScore() + frames.get(i + 1).getScore();
            } else {
                score += frames.get(i).getScore();
            }
        }

        return score;

//        return frames.stream()
//                .mapToInt(Frame::getScore)
//                .sum();
    }
}
