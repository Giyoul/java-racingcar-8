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
}
