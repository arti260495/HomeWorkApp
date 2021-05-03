package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = task5(100, 9);
    }

    public static int[] task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
