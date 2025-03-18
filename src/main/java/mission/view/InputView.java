package mission.view;

import java.util.Scanner;
import mission.utils.MessageConstants;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public int getLevel() {
        try {
            System.out.println(MessageConstants.INPUT_LEVEL_GUIDE.getMessage());
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 올바른 숫자가 아닙니다. ");
        }
    }

    public int getSize() {
        try {
            System.out.println(MessageConstants.INPUT_SIZE_GUIDE.getMessage());
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 올바른 숫자가 아닙니다. ");
        }
    }
}
