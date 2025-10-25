package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import racingcar.domain.RacingCar;

public class RacingCarService {
    public List<RacingCar> parseCarNames(String input){
        return Arrays.stream(input.split(","))
            .map(RacingCar::new)
            .toList();
    }

    public void moveCars(List<RacingCar> inputList){
        inputList.stream()
                .filter(car -> determineMove())
                .forEach(RacingCar::move);
    }

    public boolean determineMove(){
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

    public List<RacingCar> findWinners(List<RacingCar> racingCarList) {
        int winnerPosition = findWinnerPosition(racingCarList);
        return racingCarList.stream().filter(car -> car.getPosition() == winnerPosition).toList();
    }

    public int findWinnerPosition(List<RacingCar> racingCarList){
        int winnerPosition = 0;
        for (var car : racingCarList) {
            winnerPosition = Math.max(winnerPosition, car.getPosition());
        }
        return winnerPosition;
    }

    public void validateCarNames(List<RacingCar> racingCarList) {
        racingCarList.forEach(car -> {
            if (car.getNameLength() > 5) {
                throw new IllegalArgumentException("이름의 길이는 5를 넘어갈 수 없습니다.");
            }
        });
    }
}
