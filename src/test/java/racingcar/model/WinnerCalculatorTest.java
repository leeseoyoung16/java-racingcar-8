package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.RaceCar;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WinnerCalculatorTest {
    private WinnerCalculator winnerCalculator;

    @BeforeEach
    void setUp() {
        winnerCalculator = new WinnerCalculator();
    }

    @Test
    void 단독_우승자_테스트() {
        //given
        Set<RaceCar> raceCars = new HashSet<>();
        RaceCar pobi = new RaceCar("pobi");
        pobi.moveForward();
        pobi.moveForward();

        RaceCar woni = new RaceCar("woni");
        woni.moveForward();

        RaceCar xeo = new RaceCar("xeo");
        xeo.moveForward();

        raceCars.add(pobi);
        raceCars.add(woni);
        raceCars.add(xeo);
        //when
        Set<String> result = winnerCalculator.calculateWinner(raceCars);
        //then
        Set<String> expected = new HashSet<>();
        expected.add("pobi");

        assertEquals(expected, result);
    }

    @Test
    void 공동_우승자_테스트() {
        //given
        Set<RaceCar> raceCars = new HashSet<>();
        RaceCar pobi = new RaceCar("pobi");
        pobi.moveForward();
        pobi.moveForward();

        RaceCar woni = new RaceCar("woni");
        woni.moveForward();

        RaceCar xeo = new RaceCar("xeo");
        xeo.moveForward();
        xeo.moveForward();

        raceCars.add(pobi);
        raceCars.add(woni);
        raceCars.add(xeo);

        //when
        Set<String> result = winnerCalculator.calculateWinner(raceCars);
        //then
        Set<String> expected = new HashSet<>();
        expected.add("pobi");
        expected.add("xeo");

        assertEquals(expected, result);
    }

}