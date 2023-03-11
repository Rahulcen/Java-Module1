package userdefinedobject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TestEmpTreeSet {
//                                     TREESET is ascending oder
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TreeSet<Employee> empSet=new TreeSet <Employee>();
		Employee emp1 = new Employee("john doe", "male",22,101,"research",30000);
		System.out.println(emp1);
		Employee emp2 = new Employee("johny doe", "male",32,102,"hr",25555);
		System.out.println(emp2);
		Employee emp3 = new Employee("johns doe", "male",52,103,"recruiting",50000);
		System.out.println(emp3);
		Employee emp4 = new Employee("jo doe", "female",62,104,"research",100000);
		System.out.println(emp4);
		Employee emp5 = new Employee("jon doe", "female",32,105,"finance",49999);


		
		
	    empSet.add(emp1);
	    empSet.add(emp2);
	    empSet.add(emp3);
	    empSet.add(emp4);
	    empSet.add(emp5);
	    
	    
	    
	    System.out.println(empSet);
	}

}
