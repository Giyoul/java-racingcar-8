package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.InputValidator;
import racingcar.view.ConsoleOutput;

public class RacingCarController {
    private final ConsoleOutput consoleOutput;
    private final InputValidator inputValidator;

    public RacingCarController() {
        this.consoleOutput = new ConsoleOutput();
        this.inputValidator = new InputValidator();
    }

    public void run(){
        consoleOutput.carNamePrompt();
        String carName = Console.readLine();
        inputValidator.checkEmptyInput(carName);

        consoleOutput.attemptCountPrompt();
        String attemptCount = Console.readLine();
    }
}
