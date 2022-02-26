package io.javabrains;

public class TypeInferenceExample {
	
	public static void main(String[] args) {
		//Don't need type information given that it's here
		//Don't need parenthesis with 1 variable 
		//StringLengthLambda myLambda = public static void getLength(String s)
		StringLengthLambda myLambda = s -> s.length();
		//System.out.println(myLambda.getLength("Hello Lambda"));
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda"));
	}
	
	//Compiler has more information about function 
	interface StringLengthLambda {
		//Don't need type information given that it's here 
		int getLength(String s);
		
	}
}
