
										Language Fundamentals Part-15|| Command Line Arguments
									=============================================================


 -> The arguments which are passing from command prompt are called command line arguments.

 -> With these command line arguments JVM will create an array and by passing that array as arguments JVM will call main method.

		Ex. 
		
		
		java Test A 		B 		C 
				  |			|		|
				args[0]  args[1]  args[2]
				
			args.length == 3 



 -> The main objective of command line arguments is we can customize behavior of the main method.

	class Test {
		
		public static void main(String args[]){
			
			int n = Integer.parseInt(args[0]);
		System.out.println("The square of " + n+ "is:" +(n*n) );
		}
	}

 Case 1: 


		class Test {
			
			public static void main(String args[]){
							 |-------------------------------replace with <	
				for(int i=0 i<=args.length;i++){
					System.out.println(args[i]);
				}
			}
		}
		
		java Test A 	B 		C						java Test A 		B 						java Test 
		
		A											   A		
		B											   B	
		RE: ArrayIndexOutOfBoundsException			 RE: ArrayIndexOutOfBoundsException			RE: ArrayIndexOutOfBoundsException			
		
		
		- If we replace '<=' with '<' then we won't get any runtime exception.


 Case 2: 

	
	
		class Test {
																	   -------------		
			public static void main(String args[]){				args-X>| x | y | z |
																	 |  -------------		
				String [] argh ={"x", "y", "z"};					 ↓
				args = argh;										 ↓ -------------
				                                                argh-->| x | y | z |
				for(String s : args){                           	   -------------
					System.out.println(s);
				}
			}
		}
		
				java Test A 	B 		C						java Test A 		B 						java Test 
													
				x												x											x	
				y                                               y                                           y
				Z                                               Z                                           Z
				
				
 Case 3: within main method command line arguments are available in String form.


		class Test {
			
			public static void main(String args[]){
				
				System.out.println(args[0]+args[1]);
			}
		}
		
		
		java Test 10 20 
		
		1020
		
		
 Case 4: Useally space it self is the separator between command line arguments. If our command line arguments it self contains a sapce 
		 then we have to enclose that command line argument within double quates.

		
        class Test {
        	
        	public static void main(String args[]){
        		
        		System.out.println(args[0]);
        	}
        }
		
		java Test "Note	book"
		Note Book 
		