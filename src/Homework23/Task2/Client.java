package Homework23.Task2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        for(MilitaryObject military : militaryObjects){
            military.spyBrokeIn(new SecretAgent());
            military.spyBrokeIn(new Saboteur());
        }

        System.out.println("After spies: ");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }
}
