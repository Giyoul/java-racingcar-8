package racingcar.validator;

public class InputValidator {
    public void checkEmptyInput(String input) {
        if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("입력은 빈 문자열일 수 없습니다.");
        }
    }

    public void isNumber(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}
