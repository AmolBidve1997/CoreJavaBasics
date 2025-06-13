package day18Exceptions;

public class CheckedException {

	public static void main(String[] args) {


		System.out.println("Program is Started");
		System.out.println("Program in Progress");
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Program is Finished");
		System.out.println("Program is exited");

	}

}
