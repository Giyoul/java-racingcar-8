package racingcar.controller;

import racingcar.validator.InputValidator;
import racingcar.view.ConsoleInput;
import racingcar.view.ConsoleOutput;

public class RacingCarController {
    private final ConsoleOutput consoleOutput;
    private final ConsoleInput consoleInput;
    private final InputValidator inputValidator;

    public RacingCarController() {
        this.consoleOutput = new ConsoleOutput();
        this.consoleInput = new ConsoleInput();
        this.inputValidator = new InputValidator();
    }

    public void run(){
        consoleOutput.carNamePrompt();
        String carNameInput = consoleInput.getCarName();
        inputValidator.validateCarNameInput(carNameInput);

        consoleOutput.attemptCountPrompt();

    }
}
