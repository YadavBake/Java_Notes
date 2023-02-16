
															Language Fundamentals Part-10 || Types of Variables : part-1
														=================================================================
================
  Division one 														
================

 -> Based on type of value reprasented by a variable all variables are divided into two types.

			1. Primitive Varaibles.
			
					- Can be used reprasent primitive values.
				
						Ex.
						
						int x = 10;
						
						
			2. Reference varaibles.
			
				- Can be used to refer objects.
				
					Ex. 
															    -----------
					Student s = new Student();			s-----> | Object  |
																-----------
																
																
================
 Division Two 	
================

 -> Based on positon of declration and behavior all variables are divided into 3 types. 

	
			- Instances Variables.
			- Static variables.
			- Local varaibles.
			
			
			
	1. Instance variables 
		
		 - If the value of a variable is different from object to object such type of variables are called instance varaibles.

		 - For every object a seperate copy of instance variable will be created.
		 
		 
		 class Student {
			 
			string name ;			     --------------   	       --------------    	      --------------
			int  rollno;        s1-----> |name: Ravi  |   s2-----> |name: Durga |    s600---> |name: shiva  |
			                    		 |rollno: 102 |   		   |rollno: 102 |    		  |rollno: 600  |
										 --------------   		   --------------    		  --------------
		 }
		 
		 - Instance varaibles should be declare within the class directly but outside of any method or block or constructor.

		 - Instance variable will be created at the time of object creation and distroyed at the time of object distruction. Hance a the scope of instance variable 
		   is a exactly same as the scope of object.
		   
		- Instance variable will be strod in the heap memory as the part of object. 
		 
		- We can't access  instance variables directly from static area but we can access by using object reference.
		
		- But we can access instance variables directly from instance area.

			Ex. 

			class Test {
				
				int x = 10;
				
				public static void main(String [] args){
					
					Test t1 = new Test();
					System.out.println(x); // CE: non-static variable x cannot be reference from a static 	context.
					System.out.priintln(t1.Test); // 10
					
				}
				public void m1(){
					
					System.out.println(x); // 10
				}
			}	
	
		 - For instance variables JVM will always provide default values and we are not required perform initialization explicitally.
		 
			class Test {
				
					int x ;
					double d;
					boolean b;
					string s ;
					
				public static void main(String args[]){
					
						Test t1 = new Test();
						System.out.println(t1.x); // 0
						System.out.println(t1.d); //0.0
						System.out.println(t1.b); //false 
						System.out.println(t1.s); // null
				}
			}
			
		 - Instance variable also known as object level variables or attributes.



	2. Static variable:	
			
			- If the value of a variable is not different from object to object then it is not recommanded to declare variable as instance variable. We have to declare 
			  such type of variable at class level by using static modifires.
			  
			- In the case of instance variables for every object a separete copy will be created but in the case of static variables a single copy will be created at class 
			  level and shared by every object of the class.
			  
			  
																				--------------			
																				| cname : DS |
																				--------------
																			    ↑		|   |-------------------------
																	|------------		|						     |			
																	|					|--						   	 |
			class Student {											|					  ↓							 ↓			
														     --------------   	       --------------    	      --------------
					string name;					s1-----> |name: Ravi  |   s2-----> |name: Durga |    s600---> |name: shiva  |
					int rollno;                     		 |rollno: 102 |   		   |rollno: 102 |    		  |rollno: 600  |
															 |cname: DS	  |			   |cname: DS   |			  |cname: DS    |	
					static string Cname;               		 --------------   		   --------------    		  --------------
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			