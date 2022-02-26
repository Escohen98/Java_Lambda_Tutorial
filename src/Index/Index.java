package Index;
import java.util.ArrayList;
import java.util.Scanner;

//Interface for the String reverse lambda
interface StringFunc {
	String reverse(String inputString);
}

public class Index {
	public static void main(String[] argv) {
		//For reverseString
		Scanner text = new Scanner(System.in);
		System.out.print("Enter string: ");
		String string = text.nextLine();
		System.out.println("Non-Functional: " + reverseString(string));
		System.out.println("Lambda: " + reverseStringLambda(string));
	}
	
	//Inputs a string variable and outputs the reversed string
	private static String reverseString(String inputString) {
		String reverse = "";
		
		for (int i = inputString.length()-1; i >= 0; i--) {
			reverse += inputString.charAt(i);
		}
		
		return reverse;
	}
	
	//Same method as reverseString except with lambda ... this is nonsense
	private static String reverseStringLambda(String input) {
		StringFunc reverseString = (inputString) -> {String reverse = ""; for(int i = inputString.length()-1; i>=0; i--){reverse += inputString.charAt(i);}
		return reverse;};
		String result = reverseString.reverse(input);
		return result;
	}
}
