package io.javabrains;

public class RunnableExample {

	
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() /*Only works with 1 method*/ {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			
			}
			
		});

		myThread.run();
		
		//Implemented way before Java 8 (When lambda came out)
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.run();
	}

}
