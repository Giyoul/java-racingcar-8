package racingcar.validator;

import racingcar.helper.RacingCarExceptionHelper;

public class InputValidator {
    public void checkEmptyInput(String input) {
        if (input.trim().isEmpty()) {
            RacingCarExceptionHelper.throwEmptyInputException();
        }
    }

    public void isNumber(String input) {
        if(!input.matches("\\d+")){
            RacingCarExceptionHelper.throwInvalidAttemptCountException();
        }
    }
}
