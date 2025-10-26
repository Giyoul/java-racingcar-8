package racingcar.helper;

public class RacingCarExceptionHelper {
    private RacingCarExceptionHelper() {
    }

    public static IllegalArgumentException racingCarNameLengthException() {
        throw new IllegalArgumentException("이름의 길이는 5를 넘어갈 수 없습니다.");
    }
}
