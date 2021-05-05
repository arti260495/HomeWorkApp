package Lesson6;

public class Cat extends Animal {

    private String name;
    private static int count;

    public Cat(String name) {
        this.name = name;
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) System.out.println(name + " пробежал(а) " + distance + " м");
        if (distance < 0) System.out.println("Расстояние не может быть отрицательным!");
        if (distance > 200) System.out.println(name + " не может пробежать такое большое расстояние!");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}
