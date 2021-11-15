package Level2.Lesson2;

public class Main {
    public static void main(String[] args) {
        int size = 4;
        String[][] arr = new String[size][size];
        toFillArray(arr, size); //заполнение массива
        printAndSumArray(arr); //печать элементов массива, суммирование элементов
    }

    public static void printAndSumArray(String[][] a) {
        int sum = 0;
        try {
            if (a.length != 4) throw new MyArraySizeException("Неверный размер массива!!!");

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println("");
            }
            System.out.println("---------------------");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (!isNumeric(a[i][j])) throw new  MyArrayDataException("Неверный формат данных в ячейке: " + "[" + i + "]" + "[" + j + "]");
                    sum += Integer.parseInt(a[i][j]);
                }
            }
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void toFillArray(String[][] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = Integer.toString(i);
            }
        }
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
