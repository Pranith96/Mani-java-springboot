
public class MethodExamples {

	public void print() {
		System.out.println("Print");
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public String displayString() {
		String str = "Hello";
		return str;
	}

	public int displayInt() {
		int i = 10;
		return i;
	}

	public String displayMessage(String message) {
		String str = "Hello " + message;
		return str;
	}
}
