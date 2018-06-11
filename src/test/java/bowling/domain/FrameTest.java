package bowling.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

    private Frame frame;

    @Before
    public void setUp() {
        frame = new Frame(1);
    }

    @Test
    public void roll_many() {
        frame.roll(10);
        frame.roll(1);
        rollMany(19);

        assertThat(frame.getScore()).isEqualTo(20);
    }

    private void rollMany(int count) {
        for (int i = 0; i < count; i++) {
            frame.roll(1);
        }
    }
}