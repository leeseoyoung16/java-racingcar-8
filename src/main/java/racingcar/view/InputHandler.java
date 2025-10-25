package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.ErrorMessage;

import java.math.BigInteger;

public class InputHandler {
    public String readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();
        if(carNames.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_INPUT.getMessage());
        }
        return carNames;
    }

    public int readRaceCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();

        if(input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_INPUT.getMessage());
        }
        try {
            BigInteger bigInt = new BigInteger(input);
            if(bigInt.compareTo(BigInteger.ZERO) <= 0) {
                throw new IllegalArgumentException(ErrorMessage.NEGATIVE_TRY_INPUT.getMessage());
            }
            if (bigInt.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
                throw new IllegalArgumentException(ErrorMessage.TOO_MANY_TRY_INPUT.getMessage());
            }
            return bigInt.intValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
