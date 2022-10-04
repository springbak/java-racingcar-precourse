package racingcar.utils;

public class Move {

    public static final int BASE_NUM = 4;

    public boolean isCarMove(int number) {
        if (number < BASE_NUM)
            return false;
        return true;
    }
}
