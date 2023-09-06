public class Formatter {
    public void formatCurrency(double amount) {

        double roundedAmount = Math.floor(amount * 100) / 100;

        int integerPart = (int) roundedAmount;


        String currencyWord;
        if (integerPart % 10 == 1 && integerPart % 100 != 11) {
            currencyWord = "рубль";
        } else if (integerPart % 10 >= 2 && integerPart % 10 <= 4 && (integerPart % 100 < 10 || integerPart % 100 >= 20)) {
            currencyWord = "рубля";
        } else {
            currencyWord = "рублей";
        }

        String formattedAmount = String.format("%.2f", roundedAmount);
        System.out.println(formattedAmount + " " + currencyWord);
    }
    public void calculateAndDisplayPayment(String productName, double totalAmount) {

        formatCurrency(totalAmount);
    }


    }

