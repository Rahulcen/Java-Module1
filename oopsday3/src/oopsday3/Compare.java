package oopsday3;

public class Compare {
 
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle();
		//comp obj r1 and r2 is not same because of 1 and 2 .
		
		Triangle t1= new Triangle();
		Triangle t2= new Triangle();
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 35;
		 boolean result = a==b;
		//comparing reference and 2) comparing members.
		 //2
		 result= r1==r2;
		 System.out.println(result);//false
		 
		 result=t1==t2;
		 
		// result=r1==t1; incomparable because of diff types.or diff class.
		 Rectangle r3=r1;
		 result = r3==r1;
		 System.out.println(result);//true because r3=r1 is initialized. so r3 is the reference for r1.
		 System.out.println(r1.hashCode());
		 System.out.println(r2.hashCode());
		 
		 System.out.println(r3.hashCode());
		 
		 result= r1.equals(r2);// use the operator or this to compare.(this method apply for only object not primitives).
		 System.out.println(result);
		
		 
		 result= r1.equals(r3);
		 System.out.println(result);
		 
		 
		 r1.setLength(35.5);
		 r1.setBreath(75.45);
		 
		 r2.setLength(35.5);
		 r2.getBreadth();
		 
		 
		 if (r1.getBreadth()==r2.getLength() && r1.getLength()== r2.getBreadth()) {
			 System.out.println("same length and breadth");

		 }
		 else
			 System.out.println("not same");
		 
		 
		 t1.setS1(35.5);
		 t1.setS2(45.75);
		 t1.setS3(65.5);
		 //we are not comparing objects r1 and t1.
		 //we are comparing 
		 
		 if(r1.getLength() == t1.getS1())
			 System.out.println("the lenght and s1 are same");
		 else
			 System.out.println("they are not same");
			 
		 
		 
		}
	}


