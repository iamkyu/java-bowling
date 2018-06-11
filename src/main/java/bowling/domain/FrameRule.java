package bowling.domain;

public interface FrameRule {

    // 여기서 마지막 프레임의 스트라이크 여부에 따라 추가 진행 여부도 판단할 수 있을 듯
    boolean isEnd();
}
