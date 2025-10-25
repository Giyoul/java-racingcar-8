package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.RacingCar;

public class ConsoleOutput {
    public void carNamePrompt(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n");
    }

    public void attemptCountPrompt() {
        System.out.println("시도할 횟수는 몇 회인가요?\n");
    }

    public void resultStart(){
        System.out.println("실행 결과");
    }

    public void turnResult(List<RacingCar> carList) {
        String result = carList.stream()
                .map(RacingCar::displayPosition)
                .collect(Collectors.joining("\n"));
        System.out.println(result);
        System.out.println();
    }
}
