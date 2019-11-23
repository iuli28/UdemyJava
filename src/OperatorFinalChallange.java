
public class OperatorFinalChallange {

	public static void main(String[] args) {

		double firstVariable = 20d;
		double secondVariable = 80d;

		double sum = (firstVariable + secondVariable) * 10d;

		double reminder = sum % 40d;

		boolean b = reminder == 0 ? true : false;
		System.out.println(b);

		if (!b) {
			System.out.println("Got some reminder");
		}
	}
}
