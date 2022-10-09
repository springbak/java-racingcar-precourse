package racingcar.entities;

import java.util.ArrayList;
import java.util.Arrays;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class NamesInput {

    public static final String SPLIT_EXPRESSION = ",";
    public static final int NAME_MAX_LENGTH= 5;
    private String[] names;

    public NamesInput(String input) {
        try {
            try {
                this.names = input.split(SPLIT_EXPRESSION);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("[ERROR]입력값이 잘못 되었습니다. 이름 구분을 쉼표(,)로 입력해주세요");
            }
//        System.out.println(Arrays.toString(this.names));
//        System.out.println("length : "+ this.names.length);
            if (Arrays.equals(this.names, new String[]{}))
                throw new IllegalArgumentException("[ERROR]입력값이 없습니다. 다시 입력해주세요");
            if (this.names.length == 1)
                throw new IllegalArgumentException("[ERROR]이름 구분을 쉼표(,)로 입력해주세요");
            for (String name : this.names)
                validateNameLength(name);
        }catch (IllegalArgumentException e){
            NamesInput namesInput = new NamesInput(readLine());
        }
    }

    private void validateNameLength(String name) {
        if(name.length()>NAME_MAX_LENGTH) {
            System.out.println("[ERROR]이름 '" + name + "'은 길이가 5가 넘습니다. 다른 이름을 입력해주세요 ");
            throw new IllegalArgumentException("[ERROR]이름 '" + name + "'은 길이가 5가 넘습니다. 다른 이름을 입력해주세요 ");
        }
    }

    public String[] getNames() {
        return names;
    }

    public ArrayList<Car> constructCars(){
        ArrayList<Car> cars = new ArrayList<>();
        for(String name : names){
            cars.add(new Car(name));
        }
        return cars;
    }
}
