package racingcar.model;

import racingcar.domain.RaceCar;

import java.util.LinkedList;
import java.util.List;

public class WinnerCalculator {
    public List<String> calculateWinner(List<RaceCar> raceCars) {
        List<String> winners = new LinkedList<>();
        int maxLocation = calculateMaxLocation(raceCars);

        for(RaceCar raceCar : raceCars) {
            if(raceCar.getLocation() == maxLocation) {
                winners.add(raceCar.getName());
            }
        }
        return winners;
    }

    private int calculateMaxLocation(List<RaceCar> raceCars) {
        return raceCars.stream().mapToInt(RaceCar::getLocation)
                .max().orElse(0);
    }
}
