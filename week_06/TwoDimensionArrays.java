package week_06;

public class TwoDimensionArrays {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{1,2},{3},{4,5,6}};
        System.out.println("Elements of array a are:");
        displayArray(a);
        System.out.println("Elements of array b are:");
        displayArray(b);

    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.printf("%d ", array[i][j]);
            System.out.println();
        }
    }
}
