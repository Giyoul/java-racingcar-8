package racingcar.controller;

import racingcar.view.ConsoleInput;
import racingcar.view.ConsoleOutput;

public class RacingCarController {
    private final ConsoleOutput consoleOutput;
    private final ConsoleInput consoleInput;

    public RacingCarController() {
        this.consoleOutput = new ConsoleOutput();
        this.consoleInput = new ConsoleInput();
    }

    public void run(){
        consoleOutput.printCarNamePrompt();
        String carNameInput = consoleInput.getCarName();
    }
}
