package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

    }

    public static boolean task1(int a, int b) {
        int sum = a + b;
        return sum > 9 && sum < 21;
    }

    public static void task2(int a) {
        if (a >= 0) System.out.println("Введено положительное число");
        else System.out.println("Введено отрицательное число");
    }

    public static boolean task3(int a) {
        return a >= 0;
    }

    public static void task4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean task5(int a) {
        if (a % 4 == 0) {
            if (a % 400 == 0) {
                return true;
            } else if (a % 100 == 0) {
                return false;
            }
            return true;
        }else return false;

    }


}
