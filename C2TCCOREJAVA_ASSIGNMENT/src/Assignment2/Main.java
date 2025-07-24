package Assignment2;

public class Main {
	 public static void main(String[] args) {
	        // Create Student object
	        Student s = new Student();

	        // Create Commission object using constructor
	        Commision emp = new Commision("Mubeen", "Pondy", "333-444", 60000);

	        System.out.println("Name: " + emp.getName());
	        System.out.println("Address: " + emp.getAddress());
	        System.out.println("Phone: " + emp.getPhone());
	        System.out.println("Sales Amount: ₹" + emp.getsalesAmount());

	        emp.setsalesAmount(8500.0);
	        System.out.println("Updated Sales Amount: ₹" + emp.getsalesAmount());
	    }
}
