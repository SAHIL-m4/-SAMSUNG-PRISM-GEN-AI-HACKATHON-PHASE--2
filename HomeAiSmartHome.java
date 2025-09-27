import java.util.Scanner;
public class HomeAiSmartHome { 
    public static void main(String[] args) {
        String lights = "off";
        int temp = 70;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Home AI---------\n"); 
        System.out.println("-> LIGHT : ON/OFF | TEMPERATURE : TEMP X'F | STATUS OF HOME ");
        System.out.println(""); 
        System.out.println("=> Commands: 'on', 'off', 'temp X', 'status', 'quit'\n");
        System.out.println("----------------------");
        while (true) {
            System.out.print("\nCommand: ");
            String input = scanner.nextLine().toLowerCase().trim();
            if (input.equals("quit")) {
                System.out.println("Bye!");
                break;
            } else if (input.equals("on")) {
                lights = "on";
                System.out.println("Lights on!");
            } else if (input.equals("off")) {
                lights = "off";
                System.out.println("Lights off!");
            } else if (input.startsWith("temp ")) {   
                String[] parts = input.split(" ");
                if (parts.length > 1) {
                    try {
                        temp = Integer.parseInt(parts[1]);
                        System.out.println("Temp set to " + temp + "°F!");
                    } catch (NumberFormatException e) {
                        System.out.println("Bad number. Try 'temp 72'.");
                    }
                } else {
                    System.out.println("Say 'temp X' (X is number).");
                }
            } else if (input.equals("status")) {
                System.out.println("Lights: " + lights + " | Temp: " + temp + "°F");
            } else {
                System.out.println("Unknown. Try: on, off, temp 72, status.");
            }
        }
        scanner.close();
    }
}
