package ua.univer.task.swithcase;

public class Program4 {
	
	public static boolean leapYear (int w) {
	boolean isLeapYear = w%4 == 0 && (w%100 != 0 || w%400 == 0);
	return isLeapYear;
	}
	

	public static String numbOfMonth (int x) {
		String season;
		switch (x) {
		case 1: season = "January";
		break;
		case 2: season = "February";
		break;
		case 3: season = "March";
		break;
		case 4: season = "April";
		break;
		case 5: season = "May";
		break;
		case 6: season = "June";
		break;
		case 7: season = "July";
		break;
		case 8: season = "August";
		break;
		case 9: season = "September";
		break;
		case 10: season = "October";
		break;
		case 11: season = "November";
		break;
		case 12: season = "December";
		break;
		default: season = "Error";
		break;
		}
		return season;
		
			
	}
	public static int quantityOfDays (int y) {
		int days;
		if (y == 1) days = 31;
		else if (y == 2) days =28;
		else if (y == 3) days = 31;
		else if (y == 4) days =30;
		else if (y == 5) days = 31;
		else if (y == 6) days =30;
		else if (y == 7) days = 31;
		else if (y == 8) days =31;
		else if (y == 9) days = 30;
		else if (y == 10) days =31;
		else if (y == 11) days = 30;
		else if (y == 12) days =31;
		else days = 0;
		return days;
	}
	public static void main(String[] args) {
		int year = 2019;
		boolean isLeapYear = leapYear (year);
		System.out.println("This year is leap year = " + isLeapYear);
		int month =11;
		String monthToday = numbOfMonth(month);
        int monthDays = quantityOfDays(month);
		System.out.println(monthToday+ " = " + monthDays);
	}

}