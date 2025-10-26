package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;

public class RacingCarServiceTest {
    private RacingCarService racingCarService;

    @BeforeEach
    void setUp() {
        racingCarService = new RacingCarService();
    }

    @Test
    void 자동차_이름_파싱_테스트() {
        List<RacingCar> cars = racingCarService.parseCarNames("pobi,woni");
        assertThat(cars).hasSize(2);
    }

    @Test
    void 공동_우승자_찾기_테스트() {
        List<RacingCar> cars = List.of(
                new RacingCar("pobi"),
                new RacingCar("woni")
        );
        List<RacingCar> winners = racingCarService.findWinners(cars);
        assertThat(winners).hasSize(2);
    }

    @Test
    void 자동차_이름_길이_검증_테스트() {
        List<RacingCar> cars = List.of(new RacingCar("pobipobi"));
        assertThatThrownBy(() -> racingCarService.validateCarNames(cars))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
