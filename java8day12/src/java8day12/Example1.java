package java8day12;
interface Shape{
	double area();
	
}
interface Math{
	double power(int b,int e);
}
interface Factorial{
	int fact(int n);
}
public class Example1 {

	public static void main(String[] args) {
		Factorial f=(int n)->{
			int num =1;
			for(int i=1;i<=n;i++) {
				num=num*i;
			}
			return num;
		};
		int num =f.fact(5);
				System.out.println(num);
			}
		
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("from run method"+num);
			}
		};
		Runnable r =()->{
			for(int i=1;i<5;i++) {
				System.out.println("in run method"+i);
			}
		};
		Thread t = new Thread(r);
		St.start();
		
		Math m =(b,e)->{
			int p =0;
			for(int i=1;i<=e;i++) {
				p *=b;
			}
			return p;
		};
		double p=m.power(2, 3);
		System.out.println(p);
		// TODO Auto-generated method stub
	Shape s= ()->{
		return 0.0;
	};
	double result=s.area();
	}

	}


