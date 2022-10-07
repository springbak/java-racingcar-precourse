package racingcar.utils;

import racingcar.entities.Car;

import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Move {

    public static final int BASE_NUM = 4;

    public boolean isCarMove(int number) {
        if (number < BASE_NUM)
            return false;
        return true;
    }
    public int getRandomNumber(int start, int end) {
        int randomNumber = pickNumberInRange(start,end);
        return randomNumber;
    }

    public ArrayList<Car> getJustMovedCars(ArrayList<Car> cars) {
        ArrayList<Car> movedCars = new ArrayList<>();
        for(Car car : cars)
            if(car.isThisCarJustMoved()) {

                movedCars.add(car);
            }
        return movedCars;
    }
}
