package section_4;

public class CodeBlock {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 5000;
		int lvlCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
		System.out.println(highScore);
		
		
//		if(score <= 5000 && score > 1000) {
//			System.out.println("You score was 5000");
//		}
//		else if(score < 1000){
//			System.out.println("Your score was less then 4000");
//		}
//		else {
//			System.out.println("Got here");
//		}
		
//		if(gameOver) {
//			int finalScore = score + (lvlCompleted * bonus);
//			finalScore += 1000;
//			System.out.println(finalScore);
//		}
		
		score = 10000;
		lvlCompleted = 8;
		bonus = 200;
		
//		if(gameOver) {
//			int finalScore = score + (lvlCompleted * bonus);
//			System.out.println(finalScore);
//		}
//
		
		
		highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
		System.out.println(highScore);
		
		
		displayHighScorePosition("John", calculateHighScorePosition(1500));
		displayHighScorePosition("Tom", calculateHighScorePosition(900));
		displayHighScorePosition("Iulian", calculateHighScorePosition(400));
		displayHighScorePosition("Cristina", calculateHighScorePosition(50));
		
		
		
	}
	
	public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {

		if(gameOver) {
			int finalScore = score + (lvlCompleted * bonus);
			finalScore += 2000;
//			System.out.println(finalScore);
			return finalScore;
		}
		return -1;
		
	}
	
	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get into position " + position + " on high score table.");
	}
	
	public static int calculateHighScorePosition(int score) {
		
		//method number 1
//		if(score >= 1000) {
//			return 1;
//		}
//		else if(score >= 500){
//			return 2;
//		}
//		else if(score >= 100) {
//			return 3;
//		}
//
//		return 4;
		
		
		//method number 2
		int positon = 4;
		
		if(score >= 1000) {
			positon = 1;
		}
		else if(score >= 500){
			positon = 2;
		}
		else if(score >= 100) {
			positon = 3;
		}
		
		return positon;
		
		
		
	}

}
