package Lesson6;

public abstract class Animal {

    private static int count;

    public Animal() {
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м");
    }
}
