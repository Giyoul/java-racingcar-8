package racingcar.helper;

public class RacingCarExceptionHelper {
    private RacingCarExceptionHelper() {
    }

    public static void racingCarNameLengthException() {
        throw new IllegalArgumentException("이름의 길이는 5를 넘어갈 수 없습니다.");
    }

    public static void throwEmptyInputException(){
        throw new IllegalArgumentException("입력은 빈 문자열일 수 없습니다");
    }

    public static void throwInvalidAttemptCountException(){
        throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
    }
}
