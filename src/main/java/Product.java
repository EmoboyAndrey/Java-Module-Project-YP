

import java.util.Scanner;

import java.util.Scanner;

public class Product {
    private Scanner scanner = new Scanner(System.in);
    private String name = "";
    private double summ = 0.0;

    public void namesOfGoods() {
        while (true) {
            System.out.println("Введите товар:");
            System.out.println("Для завершения введите 'Завершить'");
            String newName = scanner.next();

            if ("Завершить".equalsIgnoreCase(newName)) {
                break;
            }

            System.out.println("Введите стоимость товара в формате 'рубли, копейки'");
            double newSumm = scanner.nextDouble();

            System.out.println(name + "\n" + newName + "\nНовый товар добавлен");

            name = name.isEmpty() ? newName : name + "\n" + newName;
            summ += newSumm;

            System.out.println("Сумма всех товаров:\n" + summ);
        }
    }

    // Геттер для получения имени товара
    public String getName() {
        return name;
    }

    // Геттер для получения суммы товаров
    public double getSumm() {
        return summ;
    }

}







