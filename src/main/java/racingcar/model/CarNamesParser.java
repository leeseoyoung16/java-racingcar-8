package racingcar.model;

import racingcar.ErrorMessage;

import java.util.LinkedList;
import java.util.List;

public class CarNamesParser {
    public List<String> parseNames(String names) {
        List<String> carNames = new LinkedList<>();

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
