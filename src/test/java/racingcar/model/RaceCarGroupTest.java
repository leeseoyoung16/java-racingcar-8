package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.RaceCar;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RaceCarGroupTest {
    private RaceCarGroup raceCarGroup;

    @Test
    void 정상_경주_그룹_테스트() {
        //given
        String input = "pobi,woni,xeo";
        //when
        raceCarGroup = new RaceCarGroup(input);
        //then
        List<RaceCar> cars = raceCarGroup.getCars();
        assertEquals(cars.size(), 3);

        assertTrue(cars.stream().anyMatch(car -> car.getName().equals("pobi")));
        assertTrue(cars.stream().anyMatch(car -> car.getName().equals("woni")));
        assertTrue(cars.stream().anyMatch(car -> car.getName().equals("xeo")));
    }

    @Test
    void 자동차가_한대이면_예외발생() {
        //given
        String input = "pobi";

        //when + then
        assertThrows(IllegalArgumentException.class, () -> new RaceCarGroup(input));
    }

}