package bowling;

import bowling.view.ConsoleInputView;
import bowling.view.ConsoleOutputView;

public class ConsoleMain {
    public static void main(String[] args) {
        String player = ConsoleInputView.getPlayerName();
        ConsoleOutputView.print(player);
    }
}
