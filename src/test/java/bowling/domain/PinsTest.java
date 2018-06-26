package bowling.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PinsTest {

    private Pins pins;

    @Before
    public void setUp() {
        pins = new Pins();
    }

    @Test
    public void 핀을_쓰러뜨린다() {
        //given when
        pins.knockDown(6);

        //then
        assertThat(pins.getKnockDowns()).isEqualTo(6);
    }

    @Test
    public void 최대_핀보다_많이_쓰러뜨려도_최대_핀만큼만_쓰러진다() {
        //given
        int maxPins = Pins.getMaxPins();

        // when
        pins.knockDown(maxPins * 2);

        //then
        assertThat(pins.getKnockDowns()).isEqualTo(maxPins);
    }

    @Test
    public void 두번에_거쳐_쓰러뜨릴_수_있다() {
        //given
        int firstBowl = 1;
        int secondBowl = 2;

        //when
        pins.knockDown(firstBowl);
        pins.knockDown(secondBowl);

        //then
        assertThat(pins.getKnockDowns()).isEqualTo(firstBowl + secondBowl);
    }
}