package testlamdas;

public class LambdasSwitchCase {
  static double calculate(String operator,double x,double y) {
	  return switch (operator) {
	  case "+" ->x+y;
	  case "-" -> x-y;
	  case"*" -> x*y;
	  case"/" -> {
		  if (y==0) {
			  throw new IllegalArgumentException("can't divide by 0");
		  }
		  yield x/y;
		  
		  }
	  defualt  ->throw new IllegalArgumentException("Unknown value"+operator);
	  };
  }
    public static void main(String[] args) {
	  
	
	  
	  
	  
	  
	  
	  
	  }
  }
}