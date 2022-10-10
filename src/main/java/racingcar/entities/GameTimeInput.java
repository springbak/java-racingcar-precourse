package racingcar.entities;

public class GameTimeInput {


    private final int gameTime;

    public GameTimeInput(String stringInput) {
        try {
            this.gameTime = Integer.parseInt(stringInput);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR]입력값이 잘못 되었습니다. 숫자만 입력해주세요");
        }
    }
    public int getGameTime() {
        return gameTime;
    }
}
