
public class ForLoopExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even");
			} else if (i % 2 != 0) {
				System.out.println("odd");
			} else {
				System.out.println("ABC");
			}
		}

		int i = 0;

		while (i < 10) {
			System.out.println(i);
			if (i % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			i++;
		}
	}
}
