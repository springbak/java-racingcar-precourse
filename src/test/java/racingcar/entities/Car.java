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


    public int getFurtherDistance(int maxDistance) {
        return Math.max(maxDistance,this.getDistance());
    }

    public boolean isCarWinner(int maxDistance) {
        return maxDistance==this.getDistance();
    }
}
