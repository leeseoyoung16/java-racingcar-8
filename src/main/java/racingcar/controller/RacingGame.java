package racingcar.controller;

import racingcar.model.RaceCarGroup;
import racingcar.model.RacingRound;
import racingcar.model.RandomNumberGenerator;
import racingcar.model.WinnerCalculator;
import racingcar.view.InputHandler;
import racingcar.view.OutputView;

import java.util.List;

public class RacingGame {
    private final InputHandler inputHandler;
    private final OutputView outputView;
    private final RacingRound racingRound;
    private final WinnerCalculator winnerCalculator;
    private final RandomNumberGenerator generator;

    public RacingGame() {
        this.inputHandler = new InputHandler();
        this.outputView = new OutputView();
        this.generator = new RandomNumberGenerator();
        this.racingRound = new RacingRound(generator);
        this.winnerCalculator = new WinnerCalculator();
    }

    public void run() {
        String input = inputHandler.readCarNames();
        int raceCount = inputHandler.readRaceCount();

        RaceCarGroup raceCarGroup = new RaceCarGroup(input);

        outputView.displayResultHeader();

        List<String> winners = winnerCalculator.calculateWinner(raceCarGroup.getCars());
        outputView.displayWinner(winners);
    }
}
