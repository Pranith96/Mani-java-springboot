
public class BikeImpl implements Bike {

	@Override
	public void breaks() {
		System.out.println("breaks");
	}

	@Override
	public void tire() {
		System.out.println("tire");
	}

	@Override
	public void handle() {
		System.out.println("handle");
	}

	@Override
	public void engine() {
		System.out.println("engine");
	}

	@Override
	public void wiring() {
		System.out.println("wiring");
	}

}
