
public class FloatAndDouble {

	public static void main(String[] args) {
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;

		System.out.println("Float minim value: " + myMinFloatValue);
		System.out.println("Float max value: " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;

		System.out.println("Double minim value: " + myMinDoubleValue);
		System.out.println("Double max value: " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;

		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);

		double myPounds = 3d;
		double myKilograms = myPounds * 0.45359237d;
		System.out.println(myKilograms);

		double myDouble = 3_000_000.5_244_430;
		System.out.println(myDouble);
	}
}
