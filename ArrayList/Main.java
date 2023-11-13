package ArrayList;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyGenericClass <Integer,Integer> myInt=new MyGenericClass<>(1,2);
        MyGenericClass <Double,Double> myDouble=new MyGenericClass<>(3.14,4.4);
        MyGenericClass <Integer,Character> myChar=new MyGenericClass<>(2,'@');
        MyGenericClass <Double,String> myString=new MyGenericClass<>(2.2,"Bye");

//        HashMap<String,Integer> users=new HashMap<>();
        System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myString.getValue());
    }
}
