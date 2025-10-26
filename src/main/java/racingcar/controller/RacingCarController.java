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
        String carName = getValidatedCarNames();
        int attemptCount = getValidatedAttemptCount();

        List<RacingCar> cars = setupRacingCars(carName);
        executeRacing(cars, attemptCount);
        displayFinalResults(cars);
        Console.close();
    }

    private String getValidatedCarNames(){
        consoleOutput.carNamePrompt();
        String carName = Console.readLine();
        inputValidator.checkEmptyInput(carName);
        return carName;
    }

    private int getValidatedAttemptCount() {
        consoleOutput.attemptCountPrompt();
        String attemptCount = Console.readLine();
        inputValidator.checkEmptyInput(attemptCount);
        inputValidator.isNumber(attemptCount);
        return Integer.parseInt(attemptCount);
    }

    private List<RacingCar> setupRacingCars(String carName) {
        consoleOutput.resultStart();
        List<RacingCar> racingCarList = racingCarService.parseCarNames(carName);
        racingCarService.validateCarNames(racingCarList);
        return racingCarList;
    }

    private void executeRacing(List<RacingCar> cars, int attemptCount) {
        IntStream.range(0, attemptCount)
            .forEach(turn -> {
                racingCarService.moveCars(cars);
                consoleOutput.turnResult(cars);
            });
    }

    private void displayFinalResults(List<RacingCar> cars) {
        List<RacingCar> winnerRacingCarList = racingCarService.findWinners(cars);
        consoleOutput.finalResult(winnerRacingCarList);
    }
}
