package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.IntStream;
import racingcar.domain.RacingCar;
import racingcar.service.RacingCarService;
import racingcar.validator.InputValidator;
import racingcar.view.ConsoleOutput;

public class RacingCarController {
    private final ConsoleOutput consoleOutput;
    private final InputValidator inputValidator;
    private final RacingCarService racingCarService;

    public RacingCarController() {
        this.consoleOutput = new ConsoleOutput();
        this.inputValidator = new InputValidator();
        this.racingCarService = new RacingCarService();
    }

    public void run(){
        consoleOutput.carNamePrompt();
        String carName = Console.readLine();
        inputValidator.checkEmptyInput(carName);

        consoleOutput.attemptCountPrompt();
        String attemptCount = Console.readLine();
        inputValidator.checkEmptyInput(attemptCount);

        List<RacingCar> racingCarList = racingCarService.parseCarNames(carName);
        IntStream.range(0, Integer.parseInt(attemptCount))
                .forEach(it -> racingCarService.moveCars(racingCarList));
    }
}
