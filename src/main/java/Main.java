public class Main {
    public static void main(String[] args) {
        Employee vasya = new Employee("Вася", 2222);
        Employee masha = new Employee("Маша", "test@ya.ru");
        Employee dima = new Employee("Дима", 1234, "qaz@ya.ru");

        vasya.printInfo();
        masha.printInfo();
        dima.printInfo();

    }
}
