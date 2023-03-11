package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {
 public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<>();
	
	list.add("sun");
	list.add("moon");
	list.add("jupiter");
	list.add("uranus");
	list.add("pluto");
	list.add("mars");
	list.add("venus");
	
	Predicate<String>p=(String str)->{
		return (str.length()>3 || str.length() <10);
	
	};
	
	long count = list.stream().filter(p).count();
	System.out.println(count);		
	
	List<String>outlet=list.stream().map(f)->str);
 };
 }

}
