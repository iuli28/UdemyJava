
public class PrimitiveVariables {

	public static void main(String[] args) {
		int myValue = 1000;

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;

		System.out.println("Integer minim value: " + myMinIntValue);
		System.out.println("Integer max value: " + myMaxIntValue);

		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN value = " + (myMinIntValue - 1));

		int myMaxIntTest = 2_147_483_647;

		byte myMaxByteValue = Byte.MAX_VALUE;
		byte myMinByteValue = Byte.MIN_VALUE;

		System.out.println("Byte minim value: " + myMinByteValue);
		System.out.println("Byte max value: " + myMaxByteValue);

		short myMaxShortValue = Short.MAX_VALUE;
		short myMinShortValue = Short.MIN_VALUE;
		System.out.println("Short minim value: " + myMinShortValue);
		System.out.println("Short max value: " + myMaxShortValue);

		long myLongValue = 100L;

		long myMaxLongValue = Long.MAX_VALUE;
		long myMinLongValue = Long.MIN_VALUE;
		System.out.println("Long minim value: " + myMinLongValue);
		System.out.println("Long max value: " + myMaxLongValue);

		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);

		int myTotal = myMinIntValue / 2;
		byte myNewByteValue = (byte) (myMinByteValue / 2);

		// challange
		byte myByte = 123;
		short myShort = 8765;
		int myInt = 3_900_555;

		long myLong = 50000L + 10L * (myByte + myShort + myInt);
		System.out.println(myLong);

	}

}