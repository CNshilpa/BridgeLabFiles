import java.util.Scanner;

public class HamonicNumber {

	public static void main(String[] args) {
		// num is the number of values we want in a series
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		double result = 0.0;

		// printing the harmonic series till num value
		// using while loop
		while (num != 0) {

			// calculating harmonic values
			result = result + (double) 1 / num;

			// after calculating harmonic value
			// decrementing num by 1 which means the common
			// difference is 1
			num--;
			System.out.println("The harmonic series are :" + result);

		}

	}
}
