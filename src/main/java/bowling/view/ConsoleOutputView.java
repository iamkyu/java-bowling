package bowling.view;

public class ConsoleOutputView {

//    private static final String FIRST_COLUMN_NAME = "NAME";
//    private static final String DELIMITER = "|";
//
//    public static void print(String playerName, List<Frame> results) {
//        List<List<String>> rows = new ArrayList<>();
//
//        List<String> headers = new ArrayList<>();
//        headers.add(FIRST_COLUMN_NAME);
//        rows.add(headers);
//
//        List<String> body = new ArrayList<>();
//        body.add(playerName);
//        rows.add(body);
//
//        for (Frame frame : results) {
//            headers.add(String.format("%02d", frame.getFrameId()));
//            body.add(frame.getScoreBySymbol());
//        }
//
//        System.out.println(formatAsTable(rows));
//    }
//
//    private static String formatAsTable(List<List<String>> rows) {
//        int[] maxLengths = new int[rows.get(0).size()];
//
//        for (List<String> row : rows) {
//            for (int i = 0; i < row.size(); i++) {
//                maxLengths[i] = Math.max(maxLengths[i], row.get(i).length());
//            }
//        }
//
//        StringBuilder formatBuilder = new StringBuilder();
//        for (int maxLength : maxLengths) {
//            formatBuilder
//                    .append("%-")
//                    .append(maxLength + 2)
//                    .append("s")
//                    .append(DELIMITER);
//        }
//        String format = formatBuilder.toString();
//
//        StringBuilder result = new StringBuilder();
//        for (List<String> row : rows) {
//            result.append(String.format(format, row.toArray(new String[0]))).append("\n");
//        }
//        return result.toString();
//    }
//
//    public static void print2(String player, List<Frame> results) {
//
//        //        // FIXME will be removed
//        //        List<Frame> results = new ArrayList<>();
//        //        Frame strikeFrame = new Frame(1);
//        //        strikeFrame.roll(10);
//        //        results.add(strikeFrame);
//        //
//        //        for (int i = 1; i < 10; i++) {
//        //            Frame frame = new Frame(i + 1);
//        //            frame.roll(1);
//        //            frame.roll(1);
//        //            results.add(frame);
//        //        }
//
//        StringBuilder header = new StringBuilder();
//        header.append(DELIMITER);
//        header.append(FIRST_COLUMN_NAME);
//        header.append(DELIMITER);
//
//        for (int i = 0; i < results.size(); i++) {
//            header.append(String.format(" %02d ", results.get(i).getFrameId()));
//            header.append(DELIMITER);
//        }
//
//        header.append("\n");
//
//        header.append(DELIMITER);
//        header.append(" " + player);
//        header.append(DELIMITER);
//
//        for (int i = 0; i < results.size(); i++) {
//            header.append(String.format(" %s ", results.get(i).getScoreBySymbol()));
//            header.append(DELIMITER);
//        }
//
//        System.out.println(header.toString());
//    }
}
