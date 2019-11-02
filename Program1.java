package ua.univer.task.swithcase;

public class Program1 {

	public static void main(String[] args) {
		int days = 6;
		String dayOfWeek;
		switch (days) {
		case 1: dayOfWeek = "Monday";
		break;
		case 2: dayOfWeek = "Tuesday";
		break;
		case 3: dayOfWeek = "Wednesday";
		break;
		case 4: dayOfWeek = "Thursday";
		break;
		case 5: dayOfWeek = "Friday";
		break;
		case 6: dayOfWeek = "Saturday";
		break;
		case 7: dayOfWeek = "Sunday";
		break;
		default: dayOfWeek = "Error";
		break;
		}
		System.out.println(dayOfWeek);
	
	}

}
