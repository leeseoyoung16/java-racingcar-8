package racingcar.model;

import racingcar.ErrorMessage;

import java.util.HashSet;
import java.util.Set;

public class CarNamesParser {
    public Set<String> parseNames(String names) {
        Set<String> carNames = new HashSet<>();

        for (String carName : names.split(",")) {
            carName = carName.trim();

            if (carNames.contains(carName)) {
                throw new IllegalArgumentException(ErrorMessage.DUPLICATE_INPUT.getMessage());
            }

            validateName(carName);
            carNames.add(carName);
        }
        return carNames;
    }

    private void validateName(String carName) {
        if(carName.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
        else if(carName.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.MORE_THAN_5_NAME_LENGTH.getMessage());
        }
    }
}
