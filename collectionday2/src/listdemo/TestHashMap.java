package listdemo;

import java.util.HashMap;


	
		// TODO Auto-generated method stub
		
		import java.util.HashMap;
		import java.util.Iterator;
		public class TestHashMap {

			public static void main(String[] args) {
				
		              HashMap<String,String> countryCurr = new HashMap<>();
		              
		              countryCurr.put("IND","Rupe");
		              countryCurr.put("USA","Doller");
		              countryCurr.put("UK","Pound");
		              System.out.println(countryCurr);
		              System.out.println(countryCurr.get("IND"));
		              
		              countryCurr.put("IND", "Rupee");
		              		
		              		System.out.println(countryCurr.size());
		              		System.out.println(countryCurr.containsKey("UK"));
		              		System.out.println(countryCurr.containsValue("Doller"));
		              			}

		


	}


