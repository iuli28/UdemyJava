
public class StringEx {

	public static void main(String[] args) {
		String myString = "This is String";
		System.out.println("myString is equal to" + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to" + myString);

		myString = myString + " \u00A9 + 2019";
		System.out.println("myString is equal to" + myString);

		String numberString = "250.55";
		numberString = numberString + "49.55";
		System.out.println(numberString);

		String lasString = "10";
		int myInt = 50;
		lasString = lasString + myInt;
		System.out.println(lasString);

		double doubleNumber = 120.44d;
		lasString = lasString + doubleNumber;
		System.out.println(lasString);
	}

}
