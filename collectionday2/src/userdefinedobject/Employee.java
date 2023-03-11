package userdefinedobject;

public class Employee extends Person implements Comparable {
	private long empID;
	private String deptno;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String gender, int age,long empID,String deptno,double salary) {
	super(name, gender, age);
		// TODO Auto-generated constructor stub
	
	
		
		this.empID = empID;
		this.deptno = deptno;
		this.salary = salary;
		
	}
	public long getEmpID() {
		return empID;
	}
	public void setEmpID(long empID) {
		this.empID = empID;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee ref = null;
		if(obj !=null)
			ref =(Employee) obj;
		
		if(ref.getEmpID()==this.empID && ref.getName().equals(this.getName()) && ref.getDeptno()==this.deptno)
			
		//	
		
		// TODO Auto-generated method stub
		return super.equals(obj);
		else
		return false;
	}
	@Override
	public int compareTo(Object o) {
		Employee ref =null;
		if(o !=null) {
			ref=(Employee) o;
			
		}
		// TODO Auto-generated method stub
		if(this.empID < ref.getEmpID())
			return -1;
		else if(this.empID > ref.getEmpID())
			return 1;
		
		return 0;
	}
	
	
	
	

}
