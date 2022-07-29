
public class VirtualDemo {

	public static void main(String[] args) {
		Salary s = new Salary("Aweke","Adama",3,36000.00);
		Employee e = new Salary("Debebe","Assosa",2,25000.00);
       System.out.println("Call mailCheck using Salary reference ----");
       s.mailCheck();
       System.out.println("\n call mailCheck using Employee reference ---");
       e.mailCheck1();
	}

}
