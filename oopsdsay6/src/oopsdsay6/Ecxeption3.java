package oopsdsay6;

public class Ecxeption3 {

	public static void main(String[] args) {
		System.out.println("program task begins");
		// TODO Auto-generated method stub
		try {
			System.out.println("from try....");
			int c =10/0;
			System.out.println("from try after exception....");
			
		}catch(Exception e) {
			System.out.println("from catch");
		}
		finally {
			System.out.println("from finally....");
		}
		System.out.println("program completed tasl.");

	}

}
