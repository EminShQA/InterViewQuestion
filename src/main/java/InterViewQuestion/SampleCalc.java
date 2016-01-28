package InterViewQuestion;

import java.io.*;
public class SampleCalc {
	public static void main(String[] args) {
		String a = getInput("Enter  first value: ");
		String b = getInput("Enter second value: ");
		String op = getInput("Enter 2=Divide");
    
		int opInt = Integer.parseInt(op);
		
		double result = 0;
		
		switch (opInt) {
		
		
	//	case 1:
	//		result = addValues(a, b);
	//		break;
			
		case 2:
			result = divideValues(a, b);
			break;
			
		default:
			System.out.println("Wrong Value");
			return;
		}

		System.out.println("The answer is " + result);
	}

	private static double divideValues(String a, String b) {
		double d1 = Double.parseDouble(a);
		double d2 = Double.parseDouble(b);
		double result = d1 / d2;
		return result;
	}

	//private static double addValues(String a, String b) throws NumberFormatException {
	//	double d1 = Double.parseDouble(a);
	//	double d2 = Double.parseDouble(b);
	//	double result = d1 + d2;
	//	return result;
	}

	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();

		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
