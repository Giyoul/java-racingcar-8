package racingcar.validator;

public class InputValidator {
    public void checkEmptyInput(String input) {
        if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("입력은 빈 문자열일 수 없습니다.");
        }
    }
}
