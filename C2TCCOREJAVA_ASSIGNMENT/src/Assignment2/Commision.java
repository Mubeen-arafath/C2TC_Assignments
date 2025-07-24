package Assignment2;

public class Commision {
	private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Constructor
    public Commision(String name, String address, String phone, double salesAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salesAmount = salesAmount;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getsalesAmount() {
		return salesAmount;
	}

	public void setsalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
}
}
