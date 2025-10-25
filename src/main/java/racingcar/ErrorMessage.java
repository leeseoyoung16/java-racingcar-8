package racingcar;

public enum ErrorMessage {
    INVALID_INPUT("잘못된 입력입니다."),
    EMPTY_INPUT("입력값이 들어오지 않았습니다."),
    MORE_THAN_5_NAME_LENGTH("이름은 5자 이내여야 합니다"),
    ONE_CAR_INPUT("자동차가 2대 이상이여야 경주가 시작됩니다"),
    DUPLICATE_INPUT("중복된 이름을 사용할 수 없습니다."),
    TOO_MANY_TRY_INPUT("시도 횟수가 너무 많습니다"),
    NEGATIVE_TRY_INPUT("시도 횟수는 1번 이상이여야 합니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
