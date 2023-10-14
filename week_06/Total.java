package week_06;

public class Total {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int total=0;
//        for(int i=0;i<array.length;i++){
//
//            total+=array[i];
        for(int length:array){      //using enhanced for loop
            total+=length;
        }
        System.out.println(total);
    }
}
