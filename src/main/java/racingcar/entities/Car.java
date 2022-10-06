package racingcar.entities;

public class Car {

    public static final int INIT_DISTANCE = 0;
    private final int distance;
    private final String name;


    public Car(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
        this.distance = INIT_DISTANCE;
    }


    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }


    public int getFurtherDistance(int maxDistance) {
        return Math.max(maxDistance,this.getDistance());
    }

    public boolean isCarWinner(int maxDistance) {
        return maxDistance==this.getDistance();
    }
}
