package bowling.domain;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FramesTest {

    @Test
    public void name() {
        //given
        Frames frames = new Frames();

        //when
        frames.roll(5);

        //then
        Assertions.assertThat(frames.getFramesScore()).isEqualTo(5);
    }
}