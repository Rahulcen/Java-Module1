package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math=new Math();
		int result=math.add(5, 7);
		System.out.println(result);
		
		double result2=math.add(10.25,25.11);
		System.out.println("result2");
		
		result2=math.add(6.6,7.6,9.7);
   //we can use int add and int add in parallel lines .type should bcoz we using one method for all change is called
	}

}
// overloading meand we use one method in whole class but dill signature.
//no 2 methods should have same method signature.
//the overloaded methods selection happens in compile time 