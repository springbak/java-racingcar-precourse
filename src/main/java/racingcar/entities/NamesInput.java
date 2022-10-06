package racingcar.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class NamesInput {

    public static final String SPLIT_EXPRESSION = ",";
    private final String[] names;

    public NamesInput(String input) {
        try {
            this.names = input.split(SPLIT_EXPRESSION);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR]입력값이 잘못 되었습니다. 이름 구분을 쉼표(,)로 입력해주세요");
        }
        System.out.println(Arrays.toString(this.names));
        System.out.println("length : "+ this.names.length);
        if(Arrays.equals(this.names,new String[]{}))
            throw new IllegalArgumentException("[ERROR]입력값이 없습니다. 다시 입력해주세요");
        if(this.names.length ==1)
            throw new IllegalArgumentException("[ERROR]이름 구분을 쉼표(,)로 입력해주세요");


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
