package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CarNamesParserTest {
    private CarNamesParser carNamesParser;

    @BeforeEach
    void setUp() {
        carNamesParser = new CarNamesParser();
    }

    @Test
    void 정상_파싱_입력_테스트() {
        //given
        String input = "pobi,woni,xeo";

        //when
        Set<String> result = carNamesParser.parseNames(input);

        //then
        Set<String> carNames = new HashSet<>();
        carNames.add("pobi");
        carNames.add("woni");
        carNames.add("xeo");

        assertEquals(carNames, result);
    }

    @Test
    void 이름이_5자_초과면_예외발생() {
        //given
        String input = "pobi,woni,seoyoung";

        //when + then
        assertThrows(IllegalArgumentException.class, () -> carNamesParser.parseNames(input));
    }

    @Test
    void 이름이_공백이면_예외발생() {
        //given
        String input = "pobi,,seoyoung";

        //when + then
        assertThrows(IllegalArgumentException.class, () -> carNamesParser.parseNames(input));
    }

    @Test
    void 이름이_중복이면_예외발생() {
        //given
        String input = "pobi,pobi,woni";

        //when + then
        assertThrows(IllegalArgumentException.class, () -> carNamesParser.parseNames(input));
    }
}