
public abstract class MotorBike extends Bike {

	public void engine() {
		System.out.println("engine");
	}

	public void tire() {
		System.out.println("tire");
	}

	public abstract void breaks();

	public abstract void handle();

	public void wiring() {
		System.out.println("wire");
	}
}
