package userdefinedobject;

import java.util.ArrayList;

public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee emp1 = new Employee("john doe", "male",22,101,"research",30000);
		System.out.println(emp1);
		Employee emp2 = new Employee("johny doe", "male",32,101,"hr",25555);
		System.out.println(emp2);
		Employee emp3 = new Employee("johns doe", "male",52,101,"recruiting",50000);
		System.out.println(emp3);
		Employee emp4 = new Employee("jo doe", "female",62,101,"research",100000);
		System.out.println(emp4);
		Employee emp5 = new Employee("jon doe", "female",32,101,"finance",49999);


		
		
	    empList.add(emp1);
	    empList.add(emp2);
	    empList.add(emp3);
	    empList.add(emp4);
	    empList.add(emp5);
	    
	    
	    
	    System.out.println(empList);
	}

}
