package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringUtilsTest {
    @DisplayName("입력된 String값으로 이름들을 받는 기능 테스트")
    @Test
    void getNamesFromUserInputTest() {
        StringUtils stringUtils = new StringUtils();
        String inputString = "pobi,crong,honux";
        assertThat(Arrays.equals(stringUtils.getNamesFromUserInput(inputString), new String[]{"pobi", "crong", "honux"})).isTrue();
    }
}