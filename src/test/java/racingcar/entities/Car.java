package racingcar.entities;

public class Car {

    private final int distance;
    private final String name;



    public Car(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }


    public int getDistance() {
        return distance;
    }
    public String getName() {
        return name;
    }
}
