package userdefinedobject;

import java.util.HashMap;

public class FrequencyHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.\r\n"
				+ "Bags or multisets (unordered collections that may contain duplicate elements) should implement this interface directly.\r\n"
				+ "\r\n"
				+ "All general-purpose Collection implementation classes (which typically implement Collection indirectly through one of its subinterfaces) should provide two \"standard\" constructors: a void (no arguments) constructor, which creates an empty collection, and a constructor with a single argument of type Collection, which creates a new collection with the same elements as its argument. In effect, the latter constructor allows the user to copy any collection, producing an equivalent collection of the desired implementation type. There is no way to enforce this convention (as interfaces cannot contain constructors) but all of the general-purpose Collection implementations in the Java platform libraries comply.\r\n"
				+ ";";
		
        String words[]=str.split("");
		System.out.println(words);
		System.out.println(words.length);
		HashMap<String,Integer>str1=new HashMap<>();
		
		 for(String i:words) {
	}
	}}
