package methodrefs;

import javax.print.attribute.standard.MediaSize.Other;

interface Formula{
	public void m1();
}
class Some{
	public static void main(String[] args) {
		System.out.println("from m2....");
	}
}
class other{
	other()
	{
		System.out.println("from other constructor");
	}
}
public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Formula f =Some::m2;
    f.m1();
    
    
    f=Other::new;
    some s
	}

}
 