package ua.univer.task.swithcase;

public class Program2 {

	public static void main(String[] args) {
		int k = 5;
		String mark;
		switch (k) {
		case 1: mark ="плохо";
		break;
		case 2: mark ="неудовлетворительнo";
		break;
		case 3: mark ="удовлетворительно";
		break;
		case 4: mark ="хорошо";
		break;
		case 5: mark ="отлично";
		break;
		default : mark ="ошибка";
		break;
	}
		System.out.println(mark);
	}
}
