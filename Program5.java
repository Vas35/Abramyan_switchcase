package ua.univer.task.swithcase;

public class Program5 {
	

	public static double operationOnNumbers (int z, double x, double y) {
		double doing;
		switch (z) {
		case 1: doing = x + y;
		break;
		case 2: doing = x - y;
		break;
		case 3: doing = x * y;
		break;
		case 4: doing = x / y;
		break;
		
		default : doing = 0;
		break;
		}
		return  doing;
	}
		
	
	public static void main(String[] args) {
		int n = 3;
		double a = 27;
		double b = 13;
		double result =  operationOnNumbers(n,a,b);
		
		System.out.println(result);
	}
}
