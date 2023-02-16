
											Language Fundamentals Part-13 || main() method part-1
										===========================================================


 -> Whether class contains main() method or not and whether main() method is declare according to requirement or not these things 
    won't be checked by compiler at runtime JVM is responsible to check these things if a JVM unable to find main method then 
	we will get runtime exception saying NoSuchMethodError:main
	
	
				class Test {
		
		
				}// Compile fine 
				// RUNTIME : NoSuchFieldError:main find 
				
				
 -> At runtime JVM always search for the main() method with the following prototype :


		public 				static 					void 				main						(String []args]){}
		  ↓					  ↓						 ↓ 					 ↓									↓
	  To call JVM 	   without existing 	  main method won't	   This is the 						command line arguments 
	  from anywhere	   object also JVM		  anything to JVM 	   name which is configured 
					   JVM has to call						       inside JVM	
					   this method 
					   
					   
 -> The above syntax is very strict and we perform any change then we will get runtime exception saying NoSuchMethodError:main.

 -> Even though above syntax is very strict the following changes exceptable: 

	1. Intiated of  publi static we can take  static public that is order of modifires is not important in java.
	
	2. we can declare string array in any exceptable form:  main(String[] args) == main(String	[]args) == main(String args[]).
	
	3. Intiated 'args' we can take any java valid identifires  Ex.  main(String[] durga).
	
	4. We can replace string array with var-arg parameter Ex.  main(String... args).
	
	
	
 -> We can declare main() method with the following modifires :

		1. final .
		2. synchronized.
		3. strictfp.
 
		class Test {
			
			static final synchronized strictfp public void main(String... durga){
				
				System.out.println("valid main method");
			}
		} // It is valid main method.

 -> which of the following main method declarations are valid ?
 
 
	1. public static void main(String args); // invalid
	2. public static void Main(String[] args); //invalid
	3. public  void main(String args[]); //invalid
	4. public static int main(String args[]); //invalid
	5. final synchronized strictfp public void main(String[] args) //invalid
	6. static final synchronized strictfp public static  void main(String[] args)//valid
	7. public static void main(String... args); //valid
	
 ->  In which of the above cases we will get compile time error. 

		We won't get compile time error anywhere but except last two cases in remaining we will get runtime exception saying 
		NoSuchMethodError:main 
		
 Case 1: Overloading of the main method is possible but a JVM will always call String[] argument main() method only the overloaded 
		 method we have to call explicitly like normal method call.
 
	
		class Test {
			
			public static void main(String args[]){----------
															|
				System.out.println("String[]");				|
			}												|
			public static void main(int[] args){			|-----> Overloaded Method 
				System.out.println("int []");				|	
															|
			}------------------------------------------------
		} // O/p: String[]
	

 Case 2: Inheritance concept applicable for main() method hance a while executing child class if doesn't contain main method then 
		 parent class main method will be executed.
 
 
			class P {											
				                                                
				public static void main(String[] args){         
																
					system.out.println("Parent Main ");         
				}                                               
			}                                                   
			class C extends P {                                  	
				                                                
																
																
																
			}                                                   		
			                                                    
			                                                    
		// save as p.java                                       
                                                                
                                                                
				javac p.java                                    
					|                                           
		   ↓-------------------------↓	                        
		P.class 				C.class 	                    
                                                                
		java P                                                  
		                                                        
		o/p: Parent main                                        
		                                                        
		java c                                                  
		                                                        
		o/p: Parent main                                        

 
 Case 3: It's seems overriding concept applicable for main method but it is not overriding and it is method hiding.
  
				class P {
            		
            		public static void main(String[] args){-----
            												   |
            			system.out.println("Parent Main ");	   |
            		}										   | 	
            	}											   |
            	class C extends P {							   |It is method hiding but bot overriding
            		public static void main(String []args){	   | 
            												   |	
            			System.out.println("Child Main")	   |	
            		}										   |	
            	}----------------------------------------------|										
            	
            	
            // save as p.java 
            
            
            		javac p.java 
            			|
               ↓-------------------------↓	
            P.class 				C.class 	
            
            java P 
            
            o/p: Parent main 
            
            java c 
            
            o/p: child main 


  Note: For main method Inheritance and Overloading concept are applicable but overridinng concept is not applicable. Intiated of 
	    overriding Method Hiding is applicable.

	