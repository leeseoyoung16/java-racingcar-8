package racingcar.model;

import racingcar.domain.RaceCar;

public class RacingRound {
    private final RandomNumberGenerator generator;

    public RacingRound(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    public void playRound(RaceCarGroup raceCarGroup) {
        for(RaceCar car : raceCarGroup.getCars()) {
            raceOneCar(car);
        }
    }

    private void raceOneCar(RaceCar raceCar) {
        int randomNumber = generator.generateRandomNumber();

        if(isMovable(randomNumber)) {
            raceCar.moveForward();
        }
    }

    private boolean isMovable(int randomNum) {
        return randomNum >= 4;
    }
}
