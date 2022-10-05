package racingcar.utils;

import java.util.Arrays;

public class StringUtils {
    public static final String SPLIT_EXPRESSION = ",";

    public String[] getNamesFromUserInput(String inputString) {
        String[] s = inputString.split(SPLIT_EXPRESSION);
        System.out.println(Arrays.toString(s));
        return inputString.split(SPLIT_EXPRESSION);
    }
}
