import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		if (num % 2 == 1)
			System.out.println(num + " is a Odd number");
		else
			System.out.println(num + " is a Even number");
	}

}
