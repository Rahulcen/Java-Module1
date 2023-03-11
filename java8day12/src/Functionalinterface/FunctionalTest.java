package Functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalTest {
	public static void main(String[] args) {
		List<String>string=
				Arrays.asList("TamilNadu","Andhra Pradesh","Telangana","kerala");
		
		
		Predicate<String> p=(String str)->
		{
			return str.length()>10;
			
		};
		System.out.println(p.test("heyyyy!!!"));
		
		for(String str:strings) {
			System.out.println(p.test(str));
		}
		public static void longString(List<string>strings) {
		
		
	}

}
