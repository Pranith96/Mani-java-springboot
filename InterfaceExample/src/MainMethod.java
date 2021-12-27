
public class MainMethod {

	public static void main(String[] args) {
		BikeImpl bike = new BikeImpl();
		bike.breaks();
		bike.engine();
		bike.handle();
		bike.wiring();
		bike.tire();

		Bike bike1 = new BikeImpl2(); //runtime polymorphism ==> child class object assigning to parent class reference
		bike1.breaks();
		bike1.engine();
		bike1.handle();
		bike1.tire();
		bike1.wiring();
	}
}
