package oopsdsay6;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("program task begins");
		try {
			Scanner scanner=new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		//try {
		 int c=a/b;
		 System.out.println(c);
		 
		

	}
		catch (ArithmeticException e) {
			System.out.println("cannot / by zero");
			e.printStackTrace();
			
		}catch(InputMismatchException e) {
			System.out.println("input valid info");
		
		}
		System.out.println("program completed task");
			// TODO: handle exception
		}

}
