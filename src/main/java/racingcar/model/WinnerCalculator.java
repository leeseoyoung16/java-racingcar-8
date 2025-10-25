package racingcar.model;

import racingcar.domain.RaceCar;

import java.util.HashSet;
import java.util.Set;

public class WinnerCalculator {
    public Set<String> calculateWinner(Set<RaceCar> raceCars) {
        Set<String> winners = new HashSet<String>();
        int maxLocation = calculateMaxLocation(raceCars);

        for(RaceCar raceCar : raceCars) {
            if(raceCar.getLocation() == maxLocation) {
                winners.add(raceCar.getName());
            }
        }
        return winners;
    }

    private int calculateMaxLocation(Set<RaceCar> raceCars) {
        return raceCars.stream().mapToInt(RaceCar::getLocation)
                .max().orElse(0);
    }
}
