package racingcar.controller;

import racingcar.view.ConsoleOutput;

public class RacingCarController {
    private final ConsoleOutput consoleOutput;

    public RacingCarController() {
        this.consoleOutput = new ConsoleOutput();
    }

    public void run(){
        consoleOutput.printCarNamePrompt();

    }
}
