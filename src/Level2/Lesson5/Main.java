package Level2.Lesson5;

public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long singleTime = singleThread(arr);
        long multiTime = multiThread(arr);

    }

    private static long singleThread(float[] arr) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long singleTime = System.currentTimeMillis() - start;

        System.out.printf("Время на один поток: %d%n", singleTime);
        return singleTime;
    }

    private static long multiThread(float[] arr) {
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread t1 = new MyThread("первый массив", a1);
        MyThread t2 = new MyThread("второй массив", a2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a1 = t1.getArr();
        a2 = t2.getArr();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);

        long multiTime = System.currentTimeMillis() - a;

        System.out.printf("Время на двойной поток: %d%n", multiTime);

        return multiTime;
    }
}

