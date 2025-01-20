package Assignment6;

import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) {
        ArrayList<String> citis = new ArrayList<>();
        citis.add("London");
        citis.add("Paris");
        citis.add("New York");
        citis.add("Ha Noi");
        citis.add("Tokyo");
        if (citis.contains("London")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
