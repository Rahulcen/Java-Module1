package firsttest;

public class Calculate {
	public int power (int b,int     e) {
	 int p =1;
	 int i=1;
	 
	 if (b==0 || e==0)
		 return 0;
	 else {
		 while (i<=e) {
			 p*=b;
		 }
	 }
		return p;
		
	}
public int add(int x,int y) {
	int sum=0;
	
 if(x==0 ||  y==0)
	 return 0;
 else {
	 sum= x+y;
	 return sum;
 }
}
public int diff(int x,int y) {
	int diff=0;
	
 if(x==0 ||  y==0)
	 return 0;
 else {
	 diff= x-y;
	 return diff;
 }
}
public int Sub(int inputBase, int exp) {
	// TODO Auto-generated method stub
	return 0;
}
}