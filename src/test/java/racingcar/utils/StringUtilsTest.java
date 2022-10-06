package racingcar.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.entities.Car;
import racingcar.entities.NamesInput;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {


    private static NamesInput INPUT_STRING_TRUE_CASE  = null;

    @BeforeEach
    void setUp() {
         INPUT_STRING_TRUE_CASE = new NamesInput("pobi,crong,honux");
    }

    @DisplayName("입력된 String값으로 이름들을 받는 기능 테스트")
    @Test
    void getNamesFromUserInputTest() {
        assertThat(Arrays.equals(INPUT_STRING_TRUE_CASE.getNames(), new String[]{"pobi", "crong", "honux"})).isTrue();
//        assertThatThrownBy(() -> inputStringFalseCase.getNames())
//                .isInstanceOf(IllegalArgumentException.class);
//        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> { throw new IOException("이름 구분을 쉼표(,)로 입력해주세요"); })
//                .withMessage("이름 구분을 쉼표(,)로 입력해주세요"); ;
    }

    @DisplayName("입력된 String값으로 이름들을 받는 기능 Exception 테스트")
    @Test
    void getNamesFromUserInputExceptionTest() {
       assertThrows(IllegalArgumentException.class, () -> new NamesInput(""));
    }

    @DisplayName("입력된 String 값으로 자동차 객체를 생성하는 테스트")
    @Test
    void createCarsByUserInputTest() {
        ArrayList<Car> cars = INPUT_STRING_TRUE_CASE.constructCars();

        assertThat(Arrays.equals(new String[]{cars.get(0).getName(),cars.get(1).getName(),cars.get(2).getName()} , new String[]{"pobi", "crong", "honux"})).isTrue();

    }
}