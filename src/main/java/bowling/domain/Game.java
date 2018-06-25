package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int GAME_END_FRAME = 10;

    private List<Frame> frames;
    private int currentFrame;
    private Frame frame;

    public Game() {
        currentFrame = 1;
        frame = new Frame(currentFrame);

        frames = new ArrayList<>();
        frames.add(frame);
    }

    public void roll(int pins) {
        frame.roll(pins);

        if (frame.isEndFrame()) {
            setNextFrame();
        }
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

    public int getCurrentFrame() {
        return currentFrame;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public boolean isGameEnd() {
        return GAME_END_FRAME == currentFrame;
    }
}
