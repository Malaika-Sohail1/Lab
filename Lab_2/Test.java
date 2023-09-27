package Lab_2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Product p1=new Product("Pencil",120,2,new Date(12,4 , 2023));
        Product p2=new Product("Bag",500,5,new Date(15,9,2023));
//        Product p3=new Product("Toy",600,3,new Date(18,2,2023));
        p1.setMfcdate(new Date(12,3,2007));

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
        System.out.println(p1.isLatest(p1,p2));
    }
}
