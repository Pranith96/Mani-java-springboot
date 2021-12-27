
public class MainMethod {

	public static void main(String[] args) {
		MethodExamples methodexample = new MethodExamples();
		methodexample.print();
		methodexample.add(5, 5);
		String stringResult = methodexample.displayString();
		System.out.println(stringResult);
		int intResult = methodexample.displayInt();
		System.out.println(intResult);
		String displayResult = methodexample.displayMessage("ABC");
		System.out.println(displayResult);
	}
}
