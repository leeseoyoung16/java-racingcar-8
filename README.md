# java-racingcar-precourse

### 기능 요구 사항
1. [x] 주어진 횟수 동안 n대의 자동차는 전진 or 정지
2. [x] 각 자동차에 이름 부여 (전진하는 자동차 출력시 이름 출력)
3. [x] 자동차 이름은 쉼표(,)를 기준으로 구분, 이름은 5자 이하
4. [x] 사용자는 몇 번의 이동을 할 것인지 입력
5. [x] 전진하는 조건 : 랜덤값(0~9)이 4이상일 경우
6. [x] 게임 완료 후 우승자 도출 (우승자는 여러 명 가능)
7. [x] 우승자가 여러명일 경우 쉼표(,)를 이용해 구분
8. [x] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException` 발생시킨 후 종료

### 구현 기능 목록
1. 사용자 입력 (자동차 및 시도 횟수) `InputHandler`
2. RaceCar 생성 `RaceCar`
3. 자동차 이름 파싱 및 검증`CarNamesParser`
4. 자동차 그룹 관리 `RaceCarGroup`
5. 랜덤값 생성 `RandomNumberGenerator`
6. 라운드별 이동 로직 처리 `RacingRound`
7. 경기 결과 출력 `OutputView`
8. 우승자 계산 `WinnerCalculator`
9. 예외 메세지 관리 `ErrorMessage`
10. 전체 게임 진행 `RacingGame`

### FLOW
1. 경주할 자동차 이름 입력 
2. 시도할 횟수 입력
3. 경기 시작 (횟수만큼 반복)
   1. 참가하는 자동차 각각 랜덤 값 도출
   2. 전진 조건 만족시 해당 자동차 이동
   3. 회차당 자동차 이동상태 출력
4. 경기 종료시 가장 많이 이동한 우승자 도출
5. 우승자 출력

### 예외 처리
- 입력이 공백으로 들어왔을 때 `EMPTY_INPUT`
- 잘못된 입력이 들어왔을 때 `INVALID_INPUT`
- 자동차 이름이 5자를 초과했을 때 `MORE_THAN_5_NAME_LENGTH`
- 자동차 이름이 중복되었을 때 `DUPLICATE_INPUT`
- 자동차가 한대만 들어왔을 때 `ONE_CAR_INPUT`
- 시도 횟수가 0이나 음수일 때 `NEGATIVE_TRY_INPUT`
- 시도 횟수가 int 범위를 벗어날 때 `TOO_MANY_TRY_INPUT`