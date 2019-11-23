package section_4;

public class SecondsAndMinutesChallenge {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid MESSAGE";
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(61, 0));
		System.out.println(getDurationString(3661));
		
	}
	
	public static String format(int number) {
		if(number < 10) {
			return "0" + number;
		}
		
		return String.valueOf(number);
	}
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes < 0 || seconds < 0 || seconds > 60) {
			return INVALID_VALUE_MESSAGE;
		}
		
		int hours = minutes/60;
		int remainingMinutes = minutes % 60;
		
		String duration = format(hours) + "h " + format(remainingMinutes) + "m " + format(seconds) + "s";
		return duration;
	}
	
	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		
		int minutes = seconds/60;
		int remainingSeconds = seconds % 60;
		
		return getDurationString(minutes, remainingSeconds);
	}

}
