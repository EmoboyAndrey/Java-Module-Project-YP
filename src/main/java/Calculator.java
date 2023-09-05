import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private int howManyPeople; // Объявление переменной как поле класса

    public void setHowManyPeople() {
        while (true) {
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Меня всё время спрашивают: знаю ли я Тайлера Дёрдена?\n Некорректный ввод данных");
            } else if (input < 1) {
                System.out.println("Людей не может быть меньше одного");
            } else if (input > 1) {
                howManyPeople = input; // Устанавливаем значение поля класса
                break;
            }
        }
    }

    public int getHowManyPeople() {
        return howManyPeople; // Возвращает значение поля класса
    }
}