package bowling.view;

import java.util.Scanner;

public class ConsoleInputView {
    private static final String ASK_PLAYER_NAME_MESSAGE = "플레이어 이름은(3 english letters)?: ";

    private static final String ASK_KNOCK_DOWN_PINS_MESSAGE_FORMAT = "%d프레임 투구: ";

    private static final Scanner scanner = new Scanner(System.in, "UTF-8");

    public static String getPlayerName() {
        System.out.print(ASK_PLAYER_NAME_MESSAGE);
        return scanner.nextLine();
    }

    public static int getKnockDownPins(int frame) {
        System.out.print(String.format(ASK_KNOCK_DOWN_PINS_MESSAGE_FORMAT, frame));
        int pins = scanner.nextInt();
        scanner.nextLine();

        return pins;
    }
}
