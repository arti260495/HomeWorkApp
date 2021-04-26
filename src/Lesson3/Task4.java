package Lesson3;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][(arr.length - 1) - i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
