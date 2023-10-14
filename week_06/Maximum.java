package week_06;

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter 3 integer values: ");

        int no1=input.nextInt();
        int no2= input.nextInt();
        int no3=input.nextInt();
        int result=findMax(no1,no2,no3);
        System.out.println("Maximum number is: "+result);

    }
    public static int findMax(int number1,int number2,int number3){
        int max=number1;
        if(number2>number1){
            max=number2;
        }
        if(number3>number1){
            max=number3;
        }
        return max;
    }


}
