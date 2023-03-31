package enumm;

public enum Enum {
	
	MONDAY("monday"),
	TUESDAY("tuesday"),
	WEDNESDAY("wednesday"),
	THURSDAY("thursdsy"),
	FRIDAY("friday"),
	SATURDAY("saturday"),
	SUNDAY("sunday");
	
	private final String name;
	
	
	Enum(String name){
		this.name=name;
		
		
		
	}
     public String getName() {
    	 return name;
     }
}



