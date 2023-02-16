
										Language Fundamentals Part-14 || main() method part-2
									=============================================================

===========================================================
  1.7v version Inhancement with respect to main() method :
===========================================================


 -> Until 1.6v version if the class doen't contain main method then we will get runtime exception saying NoSuchMethodError:main.

 -> But from 1.7v version onwords intiated of NoSuchMethodError we will get more elaborated error information.
 
	Ex. 

												class Test {
				
				
												}
													↓↓
	-----------------------------------------------------------------------------------------------------------------------------
	|					1.6v											1.7v													|
	|                                                                                                                           |
	|                                                                                                                           |
	|javac Test.java 											javac Test.java 		                                        |
	|java Test //RE: NoSuchMethodException:Main					java Test // Error: Main method not found in class Test	please  |
	|																	  // declare main method as public static void main     |
	|																	  // (String [] args)                                   |
	|                                                                                                                           |
	-----------------------------------------------------------------------------------------------------------------------------
	

 -> From 1.7v version onwords main method compulsory to start program execution hance a even though class static block it won't 
    be executed if the class doesn't contain main method. 
	
	
										class Test {
											
											static {
												System.out.printnl("Static Block ");
											}
										}
												↓↓
			---------------------------------------------------------------------------------------------------------									
			|		1.6v											1.7v											|
			|		                                                                                                |
			|Javac Test.java 								Javac Test.java                                         |
			|java Test                                       java Test                                              |
			| static block 									// Error: Main method not found in class Test	please	|	
		    |// RE: NoSuchMethodError:main                    // declare main method as public static void main     |
			|		                                        // (String [] args)                                     |
			|		                                                                                                |
			---------------------------------------------------------------------------------------------------------


 -> From 1.7v version main method is compulsory to start program execution.



											class Test {
                                                  	
                                                  	static {
                                                  		System.out.printnl("Static Block ");
														System.exit(0);
                                                  	}
                                                  }
														↓↓
			---------------------------------------------------------------------------------------------------------
            |		1.6v											1.7v											|
            |		                                                                                                |
            |Javac Test.java 								Javac Test.java                                         |
            |java Test                                       java Test                                              |
			| static block 									// Error: Main method not found in class Test	please	|
			|							                   // declare main method as public static void main     |									
			|		                                        // (String [] args)                                     |									
			|		                                                                                                |									
	        ---------------------------------------------------------------------------------------------------------
			
 

												class Test {
													
													static{
														System.out.println("Static block");
													}
													public static void main(Strig[] args){
														System.out.println("Main methiod ");
													}
												}
															  ↓↓
			---------------------------------------------------------------------------------------------------------
			|		1.6v											1.7v											|
			|		                                                                                                |
			|Javac Test.java 								Javac Test.java                                         |
			|java Test                                       java Test                                              |
			| static block 										static block										|
			| main Method 				                		main Method 									    |	
			|		                                    														    |
			|		                                                                                                |
			---------------------------------------------------------------------------------------------------------
			
			
		
		
			1.6v 																	1.7v
		
	   -------------------												--------------	
	   |Identification of| 												|	chech for| if it is Not available       
	   |static method    |												|	  main() |------------------------	
	   -------------------											    ---------------				   		 ↓  
			   ↓															   ↓						 -------------------------
			   ↓															   ↓---> If it is available  |Error: Main method not |
	   ----------------------- 												   ↓						 |found in class Test 	 |
	   |Exicute static block |										   -------------------				 |please define the main |
	   |		&            |                                         |Identification of| 				 |main method a public 	 |	
	   |static variable      |                                         |static method    |				 |static void main(      |
	   |assignments          |                                         -------------------				 |String [] args)        |
	   -----------------------									  		  	  ↓							 -------------------------
		       ↓                                                  		      ↓				
			   ↓                                                     ----------------------- 	
		---------------                                              |Exicute static block |	
		|	check for |		Not available                            |		&              |  
		|	  Main()  |----------------------		                 |static variable      |  
		---------------						↓                        |assignments          |  
			  ↓					----------------------------		 -----------------------		
			  ↓					|RE: NoSuchMethodError:Main |				   ↓
			  ↓					-----------------------------				   ↓		
		-----------------											    -----------------
		| Exectue Main()|                                               | Exectue Main()|
		-----------------                                               -----------------
			
			
  Q). Without writing main() method is it possible to print some statements to the console ?

	 Yes.By using static block But this rule is applicable until 1.6v version but from 1.7v version onwords it is impossible to print
	 some statements to the console.
	 
	 
	 
			
			
			
			
			
			
			
			
			
			
			
			
			