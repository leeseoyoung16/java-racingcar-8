package racingcar;

import racingcar.model.RandomNumberGenerator;

public class FixNumberGenerator extends RandomNumberGenerator {
    private final int fixNumber;

    public FixNumberGenerator(int fixNumber) {
        this.fixNumber = fixNumber;
    }

    @Override
    public int generateRandomNumber() {
        return fixNumber;
    }
}
