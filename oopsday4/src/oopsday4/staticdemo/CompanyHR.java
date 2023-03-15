package oopsday4.staticdemo;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,"
		Employee emp1=new Employee("John","male",24,101,"Research",40000);
		System.out.println(emp1);
		Employee emp2=new Employee("cen","male",22,102,"Research",50000);
		System.out.println(emp2);
		Employee emp3=new Employee("lingesh","male",24,131,"Research",40000);
		System.out.println(emp3);
		Employee emp4=new Employee("sajith","male",26,101,"Research",60000);
		System.out.println(emp4);
		Employee emp5=new Employee("rabi","male",25,101,"Research",70000);
		System.out.println(emp5);

		
		if(emp1.equals(emp5)) {
			System.out.println("same");
		
		}
		else 
			System.out.println("not same");
	}
@Override
public int hashCode() {
	final int prime= 31;
	
	int result=1;
	
	// TODO Auto-generated method stub
	return super.hashCode();
}
	}
	
	
	
	
	


