package strings;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte bytes[]= {65,66,67,68,69};
      String str= new String(bytes);
      System.out.println(str.length());
      System.out.println(str);
      str="welcome to ust global";
      bytes =str.getBytes();
      for( byte b:bytes) {
    	  System.out.println(b);
    	  
      }
      char chars[]={'U','S','T',' ','G'};
      str=new String(chars);
      System.out.println(str);
      str.getChars(0,chars.length-1,chars,0);
      for(char c:chars) {
;

System.out.println(c);
    	  
      }
      String string =new String("she sells sea shells in the sea shore");
    	String words[]=string.split("  ");
    	System.out.println(words.length);
    	
    	for(String word:words) {
    		System.out.println(words);
    		
    		
    	}
         string =new String("Cartoon");
         System.out.println(string.startsWith("Car"));
         System.out.println(string.endsWith("toon"));
         int apos=string.indexOf('a');
         int tpos =string.indexOf('t');
         
         String string2= string.substring(apos,tpos);
         string2 string.substring(tpos);
         
         
      
	}

}
