package com.ust.debugging;

public class Testcode {
	int a;
	boolean b;

	//
		// TODO Auto-generated method stub
		 void m1(){
			    System.out.println("from m1"+this.a+this.b);
			  }

			  void m2(){
			  this.b=false;
			  System.out.println("1"+this.a++);
			  System.out.println("2");
			  System.out.println("3");
			  
			  this.m1();
			  this.b=true;
			  System.out.println("4"+this.a++);
			  System.out.println("2");
			  System.out.println("3"+this.a--);
			  }
			  
			  public static void main(String[] args) {
				new Testcode().m2();
			}
			  




			


	}


