package userdefinedobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("john doe", "male",22,101,"research",30000);
		System.out.println(emp1);
		Employee emp2 = new Employee("johny doe", "male",32,101,"hr",25555);
		System.out.println(emp2);
		Employee emp3 = new Employee("johns doe", "male",52,101,"recruiting",50000);
		System.out.println(emp3);
		Employee emp4 = new Employee("jo doe", "female",62,101,"research",100000);
		System.out.println(emp4);
		Employee emp5 = new Employee("jon doe", "female",32,101,"finance",49999);

		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		    empList.add(emp1);
		    empList.add(emp2);
		    empList.add(emp3);
		    empList.add(emp4);
		    empList.add(emp5);
		    
		    
		    HashSet<Employee> empSet=new HashSet<Employee>();
		    empSet.add(emp1);
		    empSet.add(emp2);
		    empSet.add(emp3);
		    empSet.add(emp4);
		    empSet.add(emp5);
		    
		    
		    
		    TreeSet<Employee> empSet1=new TreeSet <Employee>();
		    
		    empSet1.add(emp1);
		    empSet1.add(emp2);
		    empSet1.add(emp3);
		    empSet1.add(emp4);
		    empSet1.add(emp5);
		    
		    
		    HashMap<String,Collection> dataMap=new HashMap<>();
		    
		    dataMap.put("empList",empList);
		    dataMap.put("empSet",empSet1);
		    dataMap.put("empSet1",empSet1);
		    System.out.println(dataMap);
		    
		    Collection<Employee> set=dataMap.get("empSet");
		    Iterator<Employee> iter = set.iterator();
		    while (iter.hasNext()) { 
		    	System.out.println(iter.next());
		    	
		    	 Collection<Employee> set1=dataMap.get("empSet");
				    Iterator<Employee> iter1 = set1.iterator();
				    while (iter1.hasNext()) { 
				    	System.out.println(iter1.next());
				    }
				    Collection<Employee> set11=dataMap.get("empSet");
				    Iterator<Employee> iter11 = set11.iterator();
				    while (iter11.hasNext()) { 
				    	System.out.println(iter11.next());
				    }
		    }
		    }
		       

}
