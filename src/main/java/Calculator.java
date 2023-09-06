import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private int howManyPeople;

    public void setHowManyPeople() {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input == 1) {
                    System.out.println("Некорректный ввод данных \nНельзя делить счет на одного человека");
                } else if (input < 1) {
                    System.out.println("Людей не может быть меньше одного");
                } else {
                    howManyPeople = input;
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
    }

    public int getHowManyPeople() {
        return howManyPeople;
    }
}