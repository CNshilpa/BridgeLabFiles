import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your base number");
		int base = scanner.nextInt();
		System.out.println("Enter your exponent number");
		int exponent = scanner.nextInt();

		long result = 1;

		while (exponent != 0) {
			result = result * base;
			exponent--;
		}

		System.out.println("Answer = " + result);

	}

}
