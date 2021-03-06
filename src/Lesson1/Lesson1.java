package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int valve = 1;
        if (valve <= 0) {
            System.out.println("Красный");
        } else if (valve > 0 && valve <= 100000) {
            System.out.println("Желтый");
        }
        else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
