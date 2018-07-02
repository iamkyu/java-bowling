package bowling.domain;

import java.util.List;


/**
 * 스코어룰은 변경 가능성이 있음.<br>
 * 예를 들어,
 * <br>
 * 1. 전통적인 점수 계산법과<br>
 * 2. 2016 월드볼링에서 새로 도입 된 커런트 프레임 스코어링 (Current Frame Scoring)
 */
public interface ScoreRule {

    List<Integer> calculateScore(List<Frame> frames);

}

