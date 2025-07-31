package Assignmentfour;

 import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.nextLine();
            String[] details = input.split(",");

            String stageEvent = details[0];
            String customer = details[1];
            int noOfSeats = Integer.parseInt(details[2]);

            TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

            int mode = Integer.parseInt(sc.nextLine());

            booking.printDetails();

            switch (mode) {
                case 1: // Cash
                    double amount1 = Double.parseDouble(sc.nextLine());
                    booking.makePayment(amount1);
                    break;

                case 2: // Wallet
                    double amount2 = Double.parseDouble(sc.nextLine());
                    String wallet = sc.nextLine();
                    booking.makePayment(amount2, wallet);
                    break;

                case 3: // Credit Card
                    String name = sc.nextLine();
                    double amount3 = Double.parseDouble(sc.nextLine());
                    String cardType = sc.nextLine();
                    String ccv = sc.nextLine();
                    booking.makePayment(name, amount3, cardType, ccv);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } catch (Exception e) {
            System.out.println("An error occurred. Please check your input format.");
        } finally {
        
        	sc.close();
        }
    }
}
