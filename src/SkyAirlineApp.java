import java.util.Scanner;

class SkyAirlines {
    private String name;
    private String source;
    private String destination;

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String generateMessage() {
        return "Dear " + name + ", welcome onboard with service from " + source + " to " + destination +
               ". Thank you for choosing Sky Airlines. Enjoy your flight.";
    }
}

public class SkyAirlineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        // Create SkyAirlines object
        SkyAirlines skyAirlines = new SkyAirlines();

        // Set user input
        skyAirlines.setName(name);
        skyAirlines.setSource(source);
        skyAirlines.setDestination(destination);

        // Generate and print the message
        String message = skyAirlines.generateMessage();
        System.out.println(message);

        // Close the scanner
        scanner.close();
    }
}
