package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.RacingCar;

public class ConsoleOutput {
    public void carNamePrompt(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void attemptCountPrompt() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void resultStart(){
        System.out.println("실행 결과");
    }

    public void turnResult(List<RacingCar> racingCarList) {
        String formattedResult = formatTurnResult(racingCarList);
        printTurnResult(formattedResult);
    }

    private String formatTurnResult(List<RacingCar> racingCarList) {
        return racingCarList.stream()
                .map(RacingCar::displayPosition)
                .collect(Collectors.joining("\n"));
    }

    private void printTurnResult(String result) {
        System.out.println(result);
        System.out.println();
    }

    public void finalResult(List<RacingCar> winners) {
        String result = "최종 우승자 : " +
                winners.stream()
                    .map(RacingCar::getName)
                    .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
