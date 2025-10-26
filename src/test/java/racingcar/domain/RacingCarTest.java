package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RacingCarTest {
    @Test
    void 자동차_객체_생성_및_움직임_테스트() {
        RacingCar car = new RacingCar("pobi");
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    void 자동차_위치_표시_테스트() {
        RacingCar car = new RacingCar("pobi");
        car.move();
        assertThat(car.displayPosition()).isEqualTo("pobi : -");
    }
}
