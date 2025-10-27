package racingcar.domain;

public class RaceCar {
    private final String name;
    private int location;
    private static final int MIN_MOVABLE_NUMBER = 4;

    public String getName() {
        return name;
    }

    public Integer getLocation() {
        return location;
    }

    public RaceCar(String name) {
        this.name = name;
        this.location = 0;
    }

    private void moveForward() {
        this.location++;
    }

    public void moveIfMovable(int randomNum) {
        if(randomNum >= MIN_MOVABLE_NUMBER) {
            moveForward();
        }
    }
}
