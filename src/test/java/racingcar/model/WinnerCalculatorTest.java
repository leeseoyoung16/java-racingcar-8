package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.RaceCar;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
        List<RaceCar> raceCars = new LinkedList<>();
        RaceCar pobi = new RaceCar("pobi");
        pobi.moveIfMovable(5);
        pobi.moveIfMovable(5);

        RaceCar woni = new RaceCar("woni");
        woni.moveIfMovable(5);

        RaceCar xeo = new RaceCar("xeo");
        xeo.moveIfMovable(5);

        raceCars.add(pobi);
        raceCars.add(woni);
        raceCars.add(xeo);
        //when
        List<String> result = winnerCalculator.calculateWinner(raceCars);
        //then
        List<String> expected = new LinkedList<>();
        expected.add("pobi");

        assertEquals(expected, result);
    }

    @Test
    void 공동_우승자_테스트() {
        //given
        List<RaceCar> raceCars = new LinkedList<>();
        RaceCar pobi = new RaceCar("pobi");
        pobi.moveIfMovable(5);
        pobi.moveIfMovable(5);

        RaceCar woni = new RaceCar("woni");
        woni.moveIfMovable(5);

        RaceCar xeo = new RaceCar("xeo");
        xeo.moveIfMovable(5);
        xeo.moveIfMovable(5);

        raceCars.add(pobi);
        raceCars.add(woni);
        raceCars.add(xeo);

        //when
        List<String> result = winnerCalculator.calculateWinner(raceCars);
        //then
        List<String> expected = new LinkedList<>();
        expected.add("pobi");
        expected.add("xeo");

        assertEquals(expected, result);
    }

}