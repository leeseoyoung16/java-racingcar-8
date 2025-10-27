package racingcar.view;

import racingcar.domain.RaceCar;

import java.util.List;

public class OutputView {
    public void displayRoundResult(List<RaceCar> raceCars) {
        for(RaceCar car : raceCars) {
            displayCarRoundResult(car);
        }
        displayEmptyLine();
    }
    private void displayCarRoundResult(RaceCar car) {
        System.out.println(car.getName() + " : " + formatCarLocation(car.getLocation()));
    }

    public void displayResultHeader() {
        System.out.println("실행 결과");
    }

    public void displayWinner(List<String> winners) {
        System.out.print("최종 우승자 : ");
        String result = String.join(", ", winners);
        System.out.println(result);
    }

    private void displayEmptyLine() {
        System.out.println();
    }

    private String formatCarLocation(int location) {
        return "-".repeat(location);
    }
}
