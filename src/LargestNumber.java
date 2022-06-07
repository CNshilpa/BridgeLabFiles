import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int fNum, sNum, tNum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First Number");
		fNum = scanner.nextInt();
		System.out.println("Enter your Second Number");
		sNum = scanner.nextInt();
		System.out.println("Enter your Third Number");
		tNum = scanner.nextInt();
		if (fNum > sNum)
			System.out.println(fNum + " is the Largest");
		else if (sNum > tNum)
			System.out.println(sNum + " is the Largest");
		else
			System.out.println(tNum + " is the Largest");

	}

}
