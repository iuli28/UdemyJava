
public class Operators {

	public static void main(String[] args) {

		int result = 1 + 2; // 1 +2 = 3
		System.out.println(" 1 + 2  = " + result);

		result = result % 2;
		System.out.println(result);

		// result = resutlt + 1
		result++;

		// result = result - 1;
		result--;

		// result = result + 2
		result += 2;

		System.out.println(result); // 3

		// result = result * 10
		result *= 10;
		System.out.println(result); // 30

		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien");
			System.out.println("And I am scared of alien");
		}

		int topScore = 80;
		if (topScore < 100) {
			System.out.println("you got the high score!!");
		}

		int secondTopScore = 60;

		if (topScore > secondTopScore && topScore < 100) {
			System.out.println("second if");
		}

		if (topScore > 90 || secondTopScore <= 100) {
			System.out.println("third if");
		}

		int newValue = 50;
		if (newValue == 50) {
			System.out.println("this is not an error");
		}

		boolean isCar = false;
		if (!isCar) {
			System.out.println("this is not supposed to happen");
		}

		// Ternary Operator

		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("WasCar is true");
		}

		int ageOfClient = 20;
		boolean isEighteenOrOver = ageOfClient >= 20 ? true : false;
		System.out.println(isEighteenOrOver);

	}

}
