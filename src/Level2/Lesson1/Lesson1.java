package Level2.Lesson1;

import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        /*
        1.	Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        2.	Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
        соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        3.	Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет
        Так же из-за первого условия я не могу написать проверку прохождения препятствия в классах (Human, Robot, Cat). Т.к. по условию
        они просто выводят информацию.
        */

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Boris", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("00110010111", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Nya", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Road " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                /*
                Принципиально считаю, что если бы не условие на run и jump, то можно былобы определить действие в этих методах,
                тогда код упростился бы до:
                result = action[i].run(barriers[j]);
                 */

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("unsuccessfully!!");
            }
        }
    }
}
