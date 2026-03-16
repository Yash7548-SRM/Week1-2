import java.util.Scanner;

public class TravelDistanceTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();
        double fromToVia = input.nextDouble();
        double viaToFinal = input.nextDouble();
        double timeFromToVia = input.nextDouble();
        double timeViaToFinal = input.nextDouble();
        double totalDistance = fromToVia + viaToFinal;
        double totalTime = timeFromToVia + timeViaToFinal;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}