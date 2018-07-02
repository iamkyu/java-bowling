package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class GeneralScoreRule implements ScoreRule {

    @Override
    public List<Integer> calculateScore(List<Frame> frames) {
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < frames.size(); i++) {
            if (frames.get(i).getScore() == 10) {
                scores.add(frames.get(i).getScore() + frames.get(i + 1).getScore());
            } else {
                scores.add(frames.get(i).getScore());
            }
        }

        return scores;
    }
}
