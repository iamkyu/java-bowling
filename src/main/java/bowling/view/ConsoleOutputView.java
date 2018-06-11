package bowling.view;

import bowling.domain.Frame;

import java.util.ArrayList;
import java.util.List;

public class ConsoleOutputView {

    private static final String FIRST_COLUMN_NAME = "NAME";
    private static final String DELIMITER = "|";

    public static void print(String player) {

        // FIXME will be removed
        List<Frame> results = new ArrayList<>();
        Frame strikeFrame = new Frame(1);
        strikeFrame.roll(10);
        results.add(strikeFrame);

        for (int i = 1; i < 10; i++) {
            results.add(new Frame(i + 1));
        }

        StringBuilder header = new StringBuilder();
        header.append(DELIMITER);
        header.append(FIRST_COLUMN_NAME);
        header.append(DELIMITER);

        for (int i = 0; i < results.size(); i++) {
            header.append(String.format(" %02d ", results.get(i).getFrameid()));
            header.append(DELIMITER);
        }

        header.append("\n");

        header.append(DELIMITER);
        header.append(" " + player);
        header.append(DELIMITER);

        for (int i = 0; i < results.size(); i++) {
            header.append(String.format(" %s ", results.get(i).getFrameScoreByString()));
            header.append(DELIMITER);
        }

        System.out.println(header.toString());
    }
}
