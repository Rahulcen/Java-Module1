package oopsday3;

public class Calc2 implements mathIface { 
	private Calculation num = new Calculation(55);

	@Override
	public int factorial(int n) {
		int temp=1;
		for(int i=0;i<=n;i++)
		{temp=temp*i;
		
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int prime(int n) {
		int count=0;
		for(int i=0;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int amstrong(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int evenorodd(int n) { 
		// TODO Auto-generated method stub
		return 0;
	}

}
