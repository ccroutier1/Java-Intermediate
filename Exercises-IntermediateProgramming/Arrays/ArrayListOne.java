import java.util.ArrayList;

public class ArrayListOne {

public static void main(String[] args) {


    ArrayList<String> food = new ArrayList<String>();

    food.add("Curry");
    food.add("Tonkatsu");
    food.add("Soup");
    food.add("Porridge");

    for( int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

}
