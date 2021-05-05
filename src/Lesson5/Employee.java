public class Employee {
   private String fio;
   private String position;
   private String email;
   private String phoneNumber;
   private double wage;
   private int age;

    public Employee(String fio, String position, String email, String phoneNumber, double wage, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;

    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    public Employee() {
        fio = "ФИО сотрудника";
        position = "Должность";
        email = "email@gmail.com";
        phoneNumber = "+7(999)-999-99-99";
        wage = 9999;
        age = 27;
    }


    @Override
    public String toString() {
        return "ФИО: " + fio
                + " , Должность: " + position
                + " , Email: " + email
                + " , Номер телефона: " + phoneNumber
                + " , Заработная плата: " + wage
                + " , Возраст: " + age;
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Петров Василий Николаевич", "Слесарь", "petrov@gmail.com", "+7(819)746-433-45-67", 999999999, 55);
        arr[1] = new Employee("Васильева Анастасия Дмитриевна", "Бухгалтер", "petrov@gmail.com", "+7(819)746-433-45-67", 999999999, 30);
        arr[2] = new Employee("Соколов Фёдор Павлович", "Токарь", "petrov@gmail.com", "+7(819)746-433-45-67", 999999999, 34);
        arr[3] = new Employee("Дроздов Анатолий Евгениевич", "Фрезеровщик", "petrov@gmail.com", "+7(819)746-433-45-67", 999999999, 20);
        arr[4] = new Employee("Плотников Михаил Леонидович", "Шлифовщик", "petrov@gmail.com", "+7(819)746-433-45-67", 999999999, 18);

        for (Employee a : arr) {
            if (a.age > 40) {
                System.out.println(a);
                System.out.println("------------");
            }
        }






















    }
}
