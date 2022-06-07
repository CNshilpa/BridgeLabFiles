import java.util.Random;

public class FlipCoin {

	public static void main(String[] args) {

		Random random = new Random();
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < 100; i++) {
			int side = random.nextInt(2);
			if (side == 1) {
				tails = (100 - heads);
			} else {
				heads++;
			}
		}
		System.out.println("Times head was flipped:" + heads);
		System.out.println("Times tail was flipped:" + tails);
	}
}
