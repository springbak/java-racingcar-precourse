package racingcar.entities;

import racingcar.utils.Move;

public class Car {

    public static final int INIT_DISTANCE = 0;
    public static final int RANDOM_NUMBER_START = 0;
    public static final int RANDOM_NUMBER_END = 9;
    private int distance;
    private final String name;
    private int randomNumber;
    private boolean isThisCarJustMoved;


    public Car(int distance, String name) {
        this.distance = distance;
        this.name = name;

    }

    public Car(String name) {
        this.name = name;
        this.distance = INIT_DISTANCE;
        this.isThisCarJustMoved = false;
    }


    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }


    public int getFurtherDistance(int maxDistance) {
        return Math.max(maxDistance, this.getDistance());
    }

    public boolean isCarWinner(int maxDistance) {
        return maxDistance == this.getDistance();
    }

    public void proceedGameOnce() {
        Move move = new Move();
        initIsThisCarJustMoved();
        this.randomNumber = move.getRandomNumber(RANDOM_NUMBER_START, RANDOM_NUMBER_END);
        if (move.isCarMove(this.randomNumber)) {
            this.distance++;
            this.isThisCarJustMoved = true;
//            System.out.println(this.getName()+"차는 "+this.randomNumber+"값이 나와서 움직였어요. 현재 위치는 "+this.distance);
        }else{
//            System.out.println(this.getName()+"차는 "+this.randomNumber+"값이 나와서 움직이지 않았어요. 현재 위치는 "+this.distance);
        }
    }

    public boolean isThisCarJustMoved() {
        return isThisCarJustMoved;
    }

    private void initIsThisCarJustMoved() {
        this.isThisCarJustMoved = false;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
