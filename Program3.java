package ua.univer.task.swithcase;

public class Program3 {
	
	public static String numbOfMonth (int x) {
		String season;
		switch (x) {
		case 1: season = "Winter";
		break;
		case 2: season = "Winter";
		break;
		case 3: season = "Spring";
		break;
		case 4: season = "Spring";
		break;
		case 5: season = "Spring";
		break;
		case 6: season = "Summer";
		break;
		case 7: season = "Summer";
		break;
		case 8: season = "Summer";
		break;
		case 9: season = "Autumn";
		break;
		case 10: season = "Autumn";
		break;
		case 11: season = "Autumn";
		break;
		case 12: season = "Winter";
		break;
		default: season = "Error";
		break;
		}
		return season;
		
			
	}
	public static void main(String[] args) {
		int month = 11;
		String monthToday = numbOfMonth(month);

		System.out.println(monthToday);
	}

}