package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Pins implements Presentable {
    private static final int MAX_PINS = 10;
    private List<Integer> knockDowns = new ArrayList<>(2);

    public void knockDown(int pins) {
        if (pins >= MAX_PINS) {
            knockDowns.add(MAX_PINS);
            return;
        }

        int totalKnockDowns = getKnockDownPins() + pins;
        if (totalKnockDowns >= MAX_PINS) {
            knockDowns.add(MAX_PINS - getKnockDownPins());
            return;
        }

        knockDowns.add(pins);
    }

    public boolean isKnockDownAll() {
        return MAX_PINS == getKnockDownPins();
    }

    public int getKnockDownPins() {
        return knockDowns.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Override
    public String getSymbol() {
        if (knockDowns.get(0) == MAX_PINS) {
            return "X";
        }

        if (knockDowns.get(0) + knockDowns.get(1) == MAX_PINS) {
            return knockDowns.get(0) + "|/";
        }

        String first = knockDowns.get(0) == 0 ? "-" : String.valueOf(knockDowns.get(0));
        String second = knockDowns.get(1) == 0 ? "-" : String.valueOf(knockDowns.get(1));
        return first + "|" + second;
    }
}
