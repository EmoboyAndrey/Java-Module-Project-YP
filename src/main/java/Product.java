

import java.util.Scanner;

import java.util.Scanner;

public class Product {
    private Scanner scanner = new Scanner(System.in);
    private String name = "";
    private double summ = 0.0;

    public void namesOfGoods() {
        while (true) {
            try {
                System.out.println("Введите товар:");
                System.out.println("Для завершения введите 'Завершить'");
                String newName = scanner.next();


                if ("Завершить".equalsIgnoreCase(newName)) {

                    break;
                }

                System.out.println("Введите стоимость товара в формате 'рубли, копейки'");
                double newSumm = scanner.nextDouble();


                if (newSumm < 0) {
                    System.out.println("Отрицательная стоимость товара не допускается.");
                    continue;
                }

                System.out.println(name + "\n" + newName + "\nНовый товар добавлен");

                name = name.isEmpty() ? newName : name + "\n" + newName;
                summ += newSumm;

                System.out.println("Сумма всех товаров:\n" + summ);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Некорректный ввод. \nПожалуйста, заново введите наименование товара и его стоимость в виде числового значения.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }


    public String getName() {
        return name;
    }


    public double getSumm() {
        return summ;
    }

}







