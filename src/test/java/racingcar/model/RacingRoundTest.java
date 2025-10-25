package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.FixNumberGenerator;
import racingcar.domain.RaceCar;

import static org.junit.jupiter.api.Assertions.*;

class RacingRoundTest {
    private RacingRound racingRound;
    private FixNumberGenerator fixNumberGenerator;

    @Test
    void 전진_조건_만족시_자동차_움직임() {
        //given
        fixNumberGenerator = new FixNumberGenerator(4);
        RacingRound racingRound = new RacingRound(fixNumberGenerator);
        RaceCarGroup raceCarGroup = new RaceCarGroup("xeo,pobi");

        //when
        racingRound.playRound(raceCarGroup);

        //then
        RaceCar car = raceCarGroup.getCars().iterator().next();
        assertEquals(1, car.getLocation());
    }

    @Test
    void 전진_조건_불만족시_자동차_멈춤() {
        //given
        fixNumberGenerator = new FixNumberGenerator(0);
        RacingRound racingRound = new RacingRound(fixNumberGenerator);
        RaceCarGroup raceCarGroup = new RaceCarGroup("xeo,pobi");

        //when
        racingRound.playRound(raceCarGroup);

        //then
        RaceCar car = raceCarGroup.getCars().iterator().next();
        assertEquals(0, car.getLocation());
    }
}