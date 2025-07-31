package Assignmentfour;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    public TicketBooking() {}

    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Payment by Cash
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // Payment by Wallet
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // Payment by Credit Card
    public void makePayment(String cardHolderName, double amount, String cardType, String ccv) {
        System.out.println("Holder name:" + cardHolderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, cardType);
        System.out.println("CCV:" + ccv);
    }

    public void printDetails() {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
    }
}


