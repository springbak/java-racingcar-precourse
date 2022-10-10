package racingcar.utils;

import racingcar.entities.GameScenario;
import racingcar.entities.GameTimeInput;
import racingcar.entities.NamesInput;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class ConsoleView {

    public NamesInput getNamesInput() {
        System.out.println(GameScenario.ASK_RACING_CARS_NAME.getGamePhrases());
        return new NamesInput(readLine());
    }

    public GameTimeInput getGameTimeInput() {
        System.out.println(GameScenario.ASK_GAME_TIMES.getGamePhrases());
        return new GameTimeInput(readLine());
    }
}
