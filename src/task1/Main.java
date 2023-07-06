package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getOutput(getData());
    }

    private static int getData() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = 0;
            System.out.println("Enter the number:");
            num = Integer.parseInt(scanner.nextLine());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Wrong value! Please enter the number:");
            return getData();
        }
    }

    private static void getOutput(int num) {
        System.out.println("The number is " + num);
    }
}
