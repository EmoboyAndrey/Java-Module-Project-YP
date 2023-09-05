import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Calculator calculator = new Calculator();
        System.out.println("Введите количество людей: ");
        calculator.setHowManyPeople();
        calculator.getHowManyPeople();

        Product product = new Product();
        product.namesOfGoods();

        System.out.println("Добавленные товары: \n" + product.getName());
        System.out.println("Общая сумма товаров: ");

        Formatter formatter = new Formatter();
        formatter.calculateAndDisplayPayment(product.getName(), product.getSumm());

        double everyoneWillPayTheAmount = calculator.getHowManyPeople()/ product.getSumm();
        System.out.println("C каждого: \n"  );
        formatter.formatCurrency(everyoneWillPayTheAmount);


    }
}