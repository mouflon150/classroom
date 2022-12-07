package enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Enums[] enums = Enums.values();

        while (true) {

            for (Enums currency : enums) {
                System.out.println(currency.ordinal() + " " + currency);
            }
            System.out.println("===========");
            try {
                System.out.println("Введите валюту... ");
                int num = scanner.nextInt();
                System.out.println("Сумму... ");
                double input = scanner.nextDouble();
                if (num == Enums.DOLLAR.ordinal()) {
                    input *= Enums.DOLLAR.currency;
                    System.out.println("Результат: " + input + "\n");
                    break;
                }
                if (num == Enums.RUB.ordinal()) {
                    input *= Enums.RUB.currency;
                    System.out.println("Результат: " + input + "\n");
                    break;
                }
                if (num == Enums.EURO.ordinal()) {
                    input *= Enums.EURO.currency;
                    System.out.println("Результат: " + input + "\n");
                    break;
                }
                if (num == Enums.POUND.ordinal()) {
                    input *= Enums.POUND.currency;
                    System.out.println("Результат: " + input + "\n");
                    break;
                }
            } catch (Exception exception) {
                System.out.println("Ошибка. Повторите еще раз.");
                break;
            }
        }
    }
}

