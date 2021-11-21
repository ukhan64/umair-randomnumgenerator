package randomandnsmallest;

import java.util.Arrays;
import java.util.Random;

public class Generaterandomnums {

	public static void rangenerator() {
		int start = 1;
		int end = 1001;
		int counter = 500;

		int smallest;
		int greatest;
		int randomInt;

		int numbers[] = new int[counter];
		Random random = new Random();

		randomInt = random.nextInt(end - start) + start;
		numbers[0] = randomInt;

		smallest = randomInt;
		greatest = randomInt;

		for (int i = 1; i < counter; i++) {

			numbers[i] = random.nextInt(end - start) + start;

			smallest = Math.min(smallest, numbers[i]);
			greatest = Math.max(greatest, numbers[i]);

		}
		System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n\n");
		System.out.println("Greatest : " + greatest + "\n");
		System.out.println("Smallest : " + smallest + "\n");
	}

	public static void main(String[] args) {
		rangenerator();
	}

}
