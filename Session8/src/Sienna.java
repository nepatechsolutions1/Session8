
public class Sienna extends Car {
	public Sienna() {
		passengerCount = 7;
		color = "green";
		model = "Toyota";
	}
	
	@Override
	public void describe() {
		System.out.println("Mini van");
	}
	
	// overloading
	public void describe(String name) {
		System.out.println(name +  " is Mini van");
	}
}
