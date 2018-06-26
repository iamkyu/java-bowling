package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Pins {

    private static final int MAX_PINS = 10;

    private List<Integer> knockDowns = new ArrayList<>(2);

    public static int getMaxPins() {
        return MAX_PINS;
    }

    public void knockDown(int knockDownPins) {
        if (MAX_PINS <= knockDownPins) {
            knockDowns.add(MAX_PINS);
            return;
        }

        knockDowns.add(knockDownPins);
    }

    public int getKnockDowns() {
        return knockDowns.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private int getRemain() {
        return MAX_PINS - knockDowns.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
