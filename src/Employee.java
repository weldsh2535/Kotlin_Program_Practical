
public class Employee {
	private String name;
	private String address;
	private int number;
	

	public Employee(String name ,String address , int number) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.number = number;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void mailCheck1() {
	      System.out.println("Mailing a check to " + this.name + "  AND " + this.address);
	}

    public String toString() {
	      return name + " " + address + " " + number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
