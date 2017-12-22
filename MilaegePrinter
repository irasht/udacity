import java.util.Scanner;

public class MilaegePrinter {


    public static void main(String[] args) {
        final double COST_PER_GALLON = 3.95;
        Scanner sc = new Scanner(System.in);
        // File file = new File(System.out);

        System.out.print("Enter the number of gallons of gas in the tank ");
        double gas = sc.nextDouble();

        System.out.print("Enter the fuel efficiency ");
        double efficiency = sc.nextDouble();

        if (efficiency <= 0) {
            System.out.print("No can go");

        } else {
            double distance = efficiency * gas;

            System.out.print("Distance: ");
            System.out.printf("%7.1f\n", distance);

            double cost = COST_PER_GALLON * 100 / efficiency;

            System.out.print("Cost: ");
            System.out.printf("%7.2f\n", cost);
        }


    }
}
