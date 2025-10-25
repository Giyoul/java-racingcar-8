package racingcar.service;

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

    }
}
