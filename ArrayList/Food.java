package ArrayList;

import java.util.ArrayList;

public class Food {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<>();
        food.add("Hamburger");
        food.add("Hot dog");
        food.add("Pizza");
        food.add(1,"Food");
        food.set(0,"Burger");
        food.remove(1);
//        food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println("Size of ArrayList food is: "+food.size());
    }
}
