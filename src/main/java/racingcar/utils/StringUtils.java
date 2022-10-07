package racingcar.utils;
import racingcar.entities.Car;

import java.util.ArrayList;
public class StringUtils {
    public static final String SPLIT_EXPRESSION = ",";
    public String[] getNamesFromUserInput(String inputString) {
        return inputString.split(SPLIT_EXPRESSION);
    }

    public String insertCommaBetweenWinnersName(ArrayList<Car> winnerCars) {
        StringBuilder winnerCarsNameString = new StringBuilder();
        winnerCarsNameString.append(winnerCars.remove(0).getName());
        for(Car car :winnerCars)
            winnerCarsNameString.append(", ").append(car.getName());

        return winnerCarsNameString.toString();

    }
}
