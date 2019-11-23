package section_4;

public class OverloadMethod {
	
	public static void main(String[] args) {
		int newSore = calculateScore("Iulian", 500);
		
		System.out.println(calculateScore(200));
		
		calculateScore();
		
		System.out.println("centimeters = " + calcFeetAndInchesToCentimeters(157));
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score *  100; 
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player score " + score + " points");
		return score *  100; 
	}
	
	public static int calculateScore() {
		System.out.println("No Player name, no score");
		return 0;
		
	}
	
	
	//challenge
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet < 0 || (inches < 0 || inches > 12))
			return -1d;
		
		double centimeteres = feet * 12 * 2.54;
		centimeteres += inches * 2.54;
		return centimeteres;	
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches < 0)
			return -1d;
		
		double feet = (int) inches / 12;
		double remainingInches = inches % 12;
		
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	
	
	
	

}
