package mission.utils;

public enum MessageConstants {
    INPUT_LEVEL_GUIDE("별찍기 단계(1~9)를 입력해주세요."),
    INPUT_SIZE_GUIDE("별찍기 크기를 입력해주세요.");

    private final String message;
    MessageConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
