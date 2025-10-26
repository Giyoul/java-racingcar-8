package racingcar.validator;

import racingcar.helper.RacingCarExceptionHelper;

public class InputValidator {

    /**
     * Validates if input is empty or contains only whitespace.
     * @param input string to validate.
     * @throws IllegalArgumentException if input is empty or whitespace only
     */
    public void checkEmptyInput(String input) {
        if (input.trim().isEmpty()) {
            RacingCarExceptionHelper.throwEmptyInputException();
        }
    }

    /**
     * Validates if input is a valid number.
     * @param input string to validate
     * @throws IllegalArgumentException if input is not a number
     */
    public void isNumber(String input) {
        if(!input.matches("\\d+")){
            RacingCarExceptionHelper.throwInvalidAttemptCountException();
        }
    }
}
