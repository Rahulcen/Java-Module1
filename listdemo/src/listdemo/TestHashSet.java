package listdemo;

public class TestHashSet {
  import java.util.HashSet;

		

			public static void main(String[] args) {
				
				HashSet <String> bookSet = new HashSet<String>();
				bookSet.add("java in nutshell");
				bookSet.add("java complete reference");
				bookSet.add("thinking in java");
				bookSet.add("Java in 21 days");
				bookSet.add("java for dummys");
						
				System.out.println(bookSet);
				System.out.println(bookSet.size());
				System.out.println(bookSet.contains("java in nutshell"));

			}                      


