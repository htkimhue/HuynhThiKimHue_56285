package Assignment6;

import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(1.0);
        prices.add(2.0);
        prices.add(3.0);
        prices.add(4.0);
        prices.add(5.0);
        System.out.println("Values representing the prices of products: ");
        for (double price : prices) {
            System.out.println(price);
        }
    }

}
