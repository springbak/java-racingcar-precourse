package racingcar.utils;

import racingcar.entities.Car;

import java.util.List;

public class Game {
    public int pickWinner(List<Integer> distances) {
        int max = 0;
        int answer = 0;
        for (int i = 0; i < distances.size(); i++) {
            if (distances.get(i) > max) {
                max = distances.get(i);
                answer = i;

            }
        }
        return answer;
    }

    public Car pickWinnerCar(List<Car> cars) {
        int max = 0;
        Car answer = null;
        for (Car car : cars) {
            if (car.getDistance() > max) {
                max = car.getDistance();
                answer = car;
            }
        }
        return answer;
    }
}
