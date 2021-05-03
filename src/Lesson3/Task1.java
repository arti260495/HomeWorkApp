package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
             else if (arr[i] == 1) arr[i] = 0;
        }
    }
}
