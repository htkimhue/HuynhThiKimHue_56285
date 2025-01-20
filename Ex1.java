package Assignment6;

import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            number.add(i);
        }
        System.out.println("Display the elements: ");
        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i) + " ");

        }
    }

}
