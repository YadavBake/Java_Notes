
											Language Fundamentals Part-16 || Java Coding Standards
										=============================================================


 -> Whenever we are writing java code it is highly recomanded to follow coding standards. 

 -> Whenever we are writing any component it's name should reflect the purpose of that component (funcanality).
 
 -> The main advantage of this approach is readability and maintainbility of the code will be improved.


	class A {										package com.durgasoft.scjp;
													public class Calculator {
		public int m1(int x, int y){					public static int add(int number1, int number2){
			return x+y;											return number1 + number2;
		}													}
	}											   }
	
		Local  coding starndard 								Hi-tech city coding Standard
		

==============================		
 Coding Standard for classes
==============================

 -> Useally class names are nouns.
 
 -> Should start with a Upper case charcter and if it contains multiple words every inner words should start with Upper case charcter
 
		Ex. 
		
		String , StringBuffer, Dog, Account this are nouns.
		
=================================		
 Coding Standard for interfaces 
=================================

	-> useally interface name are adjectives.
	
	-> Should start with a upper case charcter and a if it contains multiple words every inner words should start with uper case 
	   charcter 

			Ex .

			Runnable, Serializale, Comparable is the Adjectives 	

=============================
 Coding Standard for Methods 
============================


  -> Useally methods names are either verbs or verb-noun combination.
  
  -> Should start with a lower case alphabet symbol and if it contains multiple words then inner word should start with upper case 
     chacter (Camal Conventions).
  
  
		Ex. 
		
		print(), sleep(), run(), eat(), start(), it is verb because it reprasent some action  
		getName(), setName(). This methods name are verb noun combinations.


================================
 Coding Standard for Variables 
================================

 -> Useally variables name are nouns.
 
  -> Should start with a lower case alphabet symbol and if it contains multiple words then every inner word should start with upper 
	 case charcter (camal case Conventions).
 
 
	Ex. 
	
	name, age salary, mobileNumber //This is are nouns in english 


================================= 
 Coding Standard for Constant
=================================

 -> Useally constant names are nouns.
 
 -> Should contain only upper case charcters and if it contains multiple words then these words are separated with underscore symbol.
 
 
	Ex. 
	
	MAX_VALUE, MAX_PRIORITY, NORM_PRIORITY, MIN_PRIORITY, PI. // This are in enlish nouns only 

 Note: Useally we can declare constants with public,static,and final modifires.
 
 
=========================== 
 javaBean Coding Standards 
===========================

 -> A java Bean is a simple java class with private properties and public getter and setter methods.


		public class StudentBean { // Class name ends with 'Bean' not official convetion from sun
			
			
			private String name;
			
			public	void setName(String name){

				this.name = name;
			}

			public String getName(){
				return name;
			}
		}
		
  -> Syntax for Setter Method 		
 
		- It should be public method.

		- The return type should void.
		
		- Method name should be prexied with set.
		
		- It should take some arguments that is it should not be no argument method.
		

  -> Syntax for Getter Method 
  
 
		- It should be public method.

		- The return type should not be  void.
		
		- Method name should be prexied with get.
		
	    - It should not  take any argument.
 
 
  Note: 
	
	-> For boolean properties getter method name can be prifixed with either 'get' or 'is'  but recomanded to use 'is'.
 
	private boolean empty;
	
		public boolean getEmpty(){
			return  empty;
		}

	    public boolean isEmpty(){
			return empty;
		}

============================ 
 Coding Standards Listeners 
============================

 Case 1: To Register a listeners
 
	-> Method name should be prifixed with 'add'.
	
	Ex.
	
	public void addMyActionListener(myActionListener l ) // valid 
		 
	public void registerMyActionListener(myActionListener l ) // invalid

	public void addMyActionListener(ActionListener l ) //invalid
	

 Case 2: To UnRegister a Listeners 

	-> Method name should be prixid remove.
	
	
	Ex. 
	
		public void removeMyActionListener(myActionListener l) //valid
		
		public void unRegisterMyActionListener(myActionListener l) // invalid
		
		public void removeMyActionListener(ActionListener l) // invalid 
		
		public void deleteMyActionListener(myActionListener l)// invalid
	

		
	
	
 
  
 
 
 


















 
  
 