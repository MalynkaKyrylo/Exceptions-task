package task4;

import java.util.Scanner;

public class Main {
    private final static int MIN_TEMPERATURE = -10;
    private final static int MAX_TEMPERATURE = 35;
    public static void main(String[] args) {
        try {
            getOutput(getTemperature());
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double getTemperature() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter temperature environment:");
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong value!");
            return getTemperature();
        }
    }

    private static boolean validateTemp(double temperature) {
        return temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE;
    }

    private static void getOutput(double temperature) throws InvalidTemperatureException {
        if (validateTemp(temperature)) {
            System.out.println("Device can work!");
        } else {
            throw new InvalidTemperatureException("The device can work only in the temperature spectrum from "+MIN_TEMPERATURE+" to "+MAX_TEMPERATURE+" degrees");
        }
    }
}




