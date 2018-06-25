package bowling;

import bowling.domain.Game;
import bowling.view.ConsoleInputView;
import bowling.view.ConsoleOutputView;

public class ConsoleMain {
    public static void main(String[] args) {
        String player = ConsoleInputView.getPlayerName();

        Game game = new Game();

        do {
            int knockDownPins = ConsoleInputView.getKnockDownPins(game.getCurrentFrame());
            game.roll(knockDownPins);
            ConsoleOutputView.print(player, game.getFrames());
        } while (!game.isGameEnd());
    }
}
