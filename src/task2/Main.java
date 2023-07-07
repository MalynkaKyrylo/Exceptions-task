package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getOutput(findPrice(getData(),getIndex()));
    }

    private static int getIndex() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of day (from 1 to 5):");
            int index = Integer.parseInt(scanner.nextLine());
            //Пользователь не должен понимать что 1 значение массива имеет индекс 0
            if (index >= 1 && index <= getData().length) {
                return index-1;
            } else {
                System.out.println("Wrong number!");
                return getIndex();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid value!");
            return getIndex();
        }
    }

    private static double findPrice(double array[], int index) {
        return array[index];
    }

    private static double[] getData() {
        return new double[]{43.9, 43.5, 42.0, 45.90, 47.90};
    }

    private static void getOutput(double price) {
        System.out.println("The price that day was: " + price);
    }
}
