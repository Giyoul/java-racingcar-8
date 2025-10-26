package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import racingcar.helper.RacingCarExceptionHelper;
import racingcar.domain.RacingCar;

public class RacingCarService {
    public List<RacingCar> parseCarNames(String input){
        return Arrays.stream(input.split(","))
            .map(RacingCar::new)
            .toList();
    }

    public void moveCars(List<RacingCar> racingCarList){
        racingCarList.stream()
            .filter(car -> determineMove())
            .forEach(RacingCar::move);
    }

    public boolean determineMove(){
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

    /**
     * Finds and returns the winners of the race
     * @param racingCarList list of cars that participated in the race
     * @return list of winning cars
     */
    public List<RacingCar> findWinners(List<RacingCar> racingCarList) {
        int winnerPosition = findWinnerPosition(racingCarList);
        return getCarsAtWinnerPosition(racingCarList, winnerPosition);
    }

    private List<RacingCar> getCarsAtWinnerPosition(List<RacingCar> racingCarList, int winnerPosition) {
        return racingCarList.stream()
            .filter(car -> car.getPosition() == winnerPosition)
            .toList();
    }

    public int findWinnerPosition(List<RacingCar> racingCarList){
        return racingCarList.stream()
            .mapToInt(RacingCar::getPosition)
            .max()
            .orElse(0);
    }

    /**
     * Validates car names for length constraints.
     * @param racingCarList list of cars to validate.
     * @throws IllegalArgumentException if any car name over 5 characters.
     */
    public void validateCarNames(List<RacingCar> racingCarList) {
        racingCarList.stream()
            .filter(car -> car.getNameLength() > 5)
            .findAny()
            .ifPresent(car -> RacingCarExceptionHelper.racingCarNameLengthException());
    }
}
