package day18Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {


		System.out.println("Program is Started");
		System.out.println("Program in Progress");
		
		FileInputStream fis = new FileInputStream("C:\\TEXT.txt");
		
		
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		
		Thread.sleep(2000);
		
		System.out.println("Program is Finished");
		System.out.println("Program is exited");

	}

}
