package oopsday4.staticdemo;

public class TestStaticDemo {

	public static void main(String[] args) {
		System.out.println(StaticDemo.a);
		StaticDemo d= new StaticDemo();//object1
		System.out.println(d.a);
		StaticDemo d1= new StaticDemo();//object2
		System.out.println(d1.a);
		StaticDemo d2=new StaticDemo();
		System.out.println(d2.a);
		System.out.println(StaticDemo.a);
	//	d.a=20;
	//	System.out.println(d1.a);
	//	d1.a++;
	//	System.out.println(d.a);
		// TODO Auto-generated method stub

	}

}
