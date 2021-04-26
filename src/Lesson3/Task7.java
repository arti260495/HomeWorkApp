package Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(task7(arr));
    }

    public static boolean task7(int[] arr) {
        boolean check = false;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                check = true;
                break;
            }
            sumRight = 0;
            }
        return check;
    }
}
