package Lesson6;

public class Dog extends Animal {

    private String name;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        this.name = name;
        count += 1;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) System.out.println(name + " пробежал(а) " + distance + " м");
        if (distance < 0) System.out.println("Расстояние не может быть отрицательным!");
        if (distance > 500) System.out.println(name + " не может пробежать такое большое расстояние!");
    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) System.out.println(name + " пробежал(а) " + distance + " м");
        if (distance < 0) System.out.println("Расстояние не может быть отрицательным!");
        if (distance > 10) System.out.println(name + " не может проплыть такое большое расстояние!");
    }
}
