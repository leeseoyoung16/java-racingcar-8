package racingcar.model;

import racingcar.ErrorMessage;
import racingcar.domain.RaceCar;

import java.util.HashSet;
import java.util.Set;

public class RaceCarGroup {
    private final Set<RaceCar> racingCarGroup = new HashSet<>();

    public Set<RaceCar> getCars() {
        return racingCarGroup;
    }

    public RaceCarGroup(String input) {
        CarNamesParser carNamesParser = new CarNamesParser();
        Set<String> carNames = carNamesParser.parseNames(input);

        validateCarNumber(carNames.size());

        for(String carName : carNames) {
            RaceCar raceCar = new RaceCar(carName);
            racingCarGroup.add(raceCar);
        }
    }

    private static void validateCarNumber(int carNumber) {
        if(carNumber < 2) {
            throw new IllegalArgumentException(ErrorMessage.ONE_CAR_INPUT.getMessage());
        }
    }
}
