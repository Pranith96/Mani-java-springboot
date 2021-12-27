
public class MainMethod {

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(5, 5);
		addition.add(5, 5, 5);
		addition.add(5, 7000000l, 5);
	}
}
