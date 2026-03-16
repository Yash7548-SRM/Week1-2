import java.util.Scanner;
public class TemperatureConversion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        double celsius = Double.parseDouble(line);
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
    }
}