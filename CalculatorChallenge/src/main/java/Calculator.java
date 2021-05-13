import java.lang.reflect.Array;

public class Calculator {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		String str = "10 % 3";
		int result = 0;

		for (int i = 0; i < str.length(); i++) {

			char j = str.charAt(i);

			if (j == '+') {

				String firstNum = "";
				String secondNum = "";

				firstNum = str.substring(0, i);

				secondNum = str.substring(i, str.length());

				int firstInt = Integer.parseInt(firstNum.replaceAll("\\s+",""));
				int secondInt = Integer.parseInt(secondNum.replaceAll("\\s+",""));

				result = firstInt + secondInt;
				i = str.length();
				
			} else if (j == '-') {

				String firstNum = "";
				String secondNum = "";

				firstNum = str.substring(0, i);
				secondNum = str.substring(i+1, str.length());
				
				int firstInt = Integer.parseInt(firstNum.replaceAll("\\s+",""));
				int secondInt = Integer.parseInt(secondNum.replaceAll("\\s+",""));

				result = firstInt - secondInt;
				i = str.length();

			}else if (j == '*') {

				String firstNum = "";
				String secondNum = "";

				firstNum = str.substring(0, i);
				secondNum = str.substring(i+1, str.length());
				
				int firstInt = Integer.parseInt(firstNum.replaceAll("\\s+",""));
				int secondInt = Integer.parseInt(secondNum.replaceAll("\\s+",""));

				result = firstInt * secondInt;
				i = str.length();

			}else if (j == '/') {

				String firstNum = "";
				String secondNum = "";

				firstNum = str.substring(0, i);
				secondNum = str.substring(i+1, str.length());
				
				int firstInt = Integer.parseInt(firstNum.replaceAll("\\s+",""));
				int secondInt = Integer.parseInt(secondNum.replaceAll("\\s+",""));

				result = firstInt / secondInt;
				i = str.length();

			}else if (j == '%') {

				String firstNum = "";
				String secondNum = "";

				firstNum = str.substring(0, i);
				secondNum = str.substring(i+1, str.length());
				
				int firstInt = Integer.parseInt(firstNum.replaceAll("\\s+",""));
				int secondInt = Integer.parseInt(secondNum.replaceAll("\\s+",""));

				result = firstInt % secondInt;
				i = str.length();

			}

		}
		System.out.println(result);
	}
}
