package Assignment6;
import java.util.ArrayList;
public class Ex2 {
    public static void main(String[] args) {
      ArrayList<String> listColor =new ArrayList<>();
      listColor.add("red");
      listColor.add("blue");
      listColor.add("orange");
      listColor.add("purple");
      listColor.add("gree");
      if(listColor.size()>=2){
          listColor.set(1, "yellow");
      }
        System.out.println("Display the updated list: ");
        System.out.println(listColor);
    }
    
}
