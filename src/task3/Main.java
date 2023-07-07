package task3;

import task4.InvalidTemperatureException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    private final static double CARD_BALANCE = 1000.0;
    public static void main(String[] args) {
        try {
            getOutput(getSumPurchase());
        } catch (CardBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validatePurchase(double sumPurchase) {
        return sumPurchase > 0 && sumPurchase <= CARD_BALANCE;
        }

    private static double getSumPurchase() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the sum to pay: ");
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong value!");
            return getSumPurchase();
        }
    }

    private static void getOutput(double sumPurchase) throws CardBalanceException {
        if (validatePurchase(sumPurchase)) {
            System.out.println("You can pay for this purchase!");
        } else {
            throw new CardBalanceException("Insufficient funds on the card. Purchase will be rejected!");
        }
    }

}
