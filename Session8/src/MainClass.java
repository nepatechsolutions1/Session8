
public class MainClass {
	public static void main(String[] args) {
		Camry camry = new Camry();
		Car civic = new Civic();
		Car sienna = new Sienna();
		
		System.out.println(camry.color);
		System.out.println(civic.color);
		System.out.println(sienna.color);
		
		System.out.println(camry.passengerCount);
		System.out.println(civic.passengerCount);
		System.out.println(sienna.passengerCount);
		
		camry.describe();
		//civic.describe();
		//sienna.describe("Tiger");
		
		Ram ram = new Ram();
		Shyam shyam = new Shyam();
		
		System.out.println(ram.computePay());
		System.out.println(shyam.computePay());
		
	}
}
