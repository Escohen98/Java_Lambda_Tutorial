package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting) { 
		greeting.perform();
	}
	
	/*
	 * greetingFunction = () -> System.out.println("Hello world!");
	 * doubleNumberFunction = public double(int a) -> { return a*2 } (bad)
	//doubleNumberFunction = (int a) -> a* 2;
	//addFuncton = (int a, int b) -> a + b;
	 * safeDivideFunction = (int a, int b) -> {
		if (b == 0) return 0;
		return a / b;
	};
	 * stringLenghtCountFunction = (Stirng s) -> s.length();
	 *
	 */
	public static void main(String[] argv) {
		Greeter greeter = new Greeter();
		tutorial(argv);
		//HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		
		greeter.greet(helloWorldGreeting);
		greeter.greet(() -> System.out.println("Hello Lorld!"));
		
		//Greeting myLambdaFunction = () -> System.out.printlnln("Hello World!");
		//MyAdd addFunction = (int a, int b) -> a + b;
		
		
		greeter.greet(helloWorldGreeting);
	}
	
	private static void tutorial(String[] argv) {
		Greeter greeter = new Greeter();
		
		//Implementing an interface by just implementing the function and not a class
		Greeting hellowWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello Korld");
		
		//Anonymous Inner Class - Class inside a class
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello Vorld!");
			}
		};
		
		//lambdaGreeting.perform();
		//innerClassGreeting.perform();
		
		greeter.greet(() -> System.out.print("Hello world!")); 
		greeter.greet(innerClassGreeting);
	}
	
}

interface myLambda {
	void foo();
}

interface MyAdd {
	int add(int x, int y);
}
