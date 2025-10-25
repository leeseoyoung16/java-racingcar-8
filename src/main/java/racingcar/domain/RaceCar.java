package racingcar.domain;

public class RaceCar {
    private String name;
    private Integer location;

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

    public void moveForward() {
        this.location++;
    }
}
