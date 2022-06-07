import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first number");
		int fNum = scanner.nextInt();
		System.out.println("Enter your second number");
		int sNum = scanner.nextInt();
		int temp = fNum;
		fNum = sNum;
		sNum = temp;
		System.out.println("After swapping");
		System.out.println("First number is " + fNum + " and Second number is " + sNum);
	}

}
