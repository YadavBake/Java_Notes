
												Language Fundamentals Part-11 || Types of Variables :part-2
											====================================================================
==================
 Local variables
==================

 -> Some times to meet temporary requirements of the progrmmer we can declare variables inside a method or block or constructor such
    type of variables are called local variables or temporary variables or stack variables or automatic variables.

	m1(){				static (){					Test(){
		                	                    	
		int x =10 ;     	int x =10 ;         	int x =10 ;
	}                   }                       }
	// Method 			 // Static block 			// constructor 	
	
 -> Local variables will be stored inside stack memory.
 
 -> Local variables will be created while executing the block in which we declared it.
 
 -> Once block execution complite automatically local variable will be destroyed. Hance a the scope of local variable is the block
    in which we declared it.
	
	
	
		class Test {
			
				public static void main(String args[]){
					
					int i=0;
					for(int j=0; j<3;j++){
						i=i+j;
					}
					System.out.println(i+"..."+j);
				}							   |-----> // CE: cannot find symbol. Symbol: variable j . Location: class Test  	
		}	
		
		
		class Test {
			
			public static void main(String arga[]){
				
				try {
					
					int j = Integer.parseInt("ten");
				}catch(NumberFormatException e){
					j =10;
					|-----> // CE: cannot find symbol. Symbol: variable j . Location: class Test
				}
				System.out.println(j);
			}					   |-----> // CE: cannot find symbol. Symbol: variable j . Location: class Test
		}
		
 -> For variables JVM won't provide default values compulsory we should perform initilization explicitly before using that variable 
    that is if we are not using than it is not required to perform initilization .


	class Test {									  	class Test {			
		                                              	
			public static void main(String args[]){   		public static void main(String args[]){
				                                      			
				int x ;                               			int x ;
				System.out.println("Hello");          			System.out.println(x);
			}                                         		}
	} // Hello                                        } //CE: variable x might not have been initilized


 -> It is not recomanded to perform initilization for local variables inside logical blocks because there is geranty for the execution 
	of this blocks always at runtime.
	
 -> It is highly recomanded to perform initilization for local variables at the time of declaration at list with default values.
 
 
	Ex. 
 
 
	class Test {											class Test {											
    	                                                    	
    		public static void main(String args[]){         		public static void main(String args[]){
    			                                            			
    			int x ;                                     			int x ;
				if(args.length	>0){                        			if(args.length	>0){
					x=10;                                   				x=10;
				}                                           			}
    			System.out.println(x);                      			else {
    		}                                               				x=20;
    } //CE: variable x might not have been initilized       			}
                                                            			System.out.println(x);
                                                            		}
                                                            } java Test A B 
																x =10;
															 java Test 
																x=20
																
 -> The only applicable modifire for local variables is final by mistake if we are trying to apply any other modifire then we will
	get compile time error.

	class Test {														class Test {
														|public         	
		int x =10;------------------------------------->|private        	public static void main(String args[]){
		static y =20;---------------------------------->|protected      		
														|default        		public x =10;		|
		public static void main(String args[]){                         		private x =10;		|
			                                                            		protected x =10;	|
			int z =30;                                                  		static  x =10;		|=======> // CE: illegal Start 
		}                                                               		transient x =10;	|		//of Expression	
	}		                                                            		volatile x =10;		|
                                                                        		
                                                                        		final x =10; // valid 
                                                                        		
	                                                                    	}
	                                                                    }
																		
 Note: If we are not declaring with any modifire then by default it is a default but this rull is applicable only for instance and 
       static variables but not for local variables.

		Ex. 
	
	class Test {
		
		int x = 10;
		static int y =20;	
		
		public static void main(String args[]){
			int z = 30;
		}
	}	
	
 Conclusion: 

	1. For instance and static variables JVM will be provide default values and we not required to perform initilization explicitly.
	
	2. But for local variables JVM won't provide default values compulsory we should peroform initilization explicitly before using 
	   that variable.
	   
	3. Instance and static variables can be accessed by mutiple threads simulatensiualy and hence a this are not thread safe but in the 
	   case of local variables for every thread saparet copy will be created and hence local variables are thread safe.	
	   
	   
								  -------------------------------------------------	
								  |	Type of variable 	|	Is Thread Safe Or Not |
								  -------------------------------------------------	
								  |	1. instace variable |			No 			  |
								  |	                    |                         |
								  |	                    |                         |
								  |	2. static variable 	|			No            |
								  |	                    |                         |
								  |	                    |                         |
								  |	3. local variable	|			Yes           |
								  -------------------------------------------------

 -> Every variable in java should be either instance or static or local.
 
 -> Every variable in java should be either primitive or reference. Hance a various possible combinations in java are 
 
	intance == [primive , reference]
	static == [primive , reference]
	local == [primive , reference]



	class Test {
		
			int x =10;  // This variable is instance primitive 
			static string s = "Durga"; // This variable is static reeference 
			public static void main(String args[]){
				
				int [] z = new int[3]; // This variable is loca reference
			}
	}		
				
=======================								  
 UnInitilized Array's 	
=======================

 -> 


	class Test {
		
			int [] x ;
			public static void main(String args[]){
				
				Test t = new Test();
				System.out.println(t.x); // null 
				System.out.println(t.x[0]); // RE: NullPointerException
				
			}
	}
	
	
	I. Instance Level
	-----------------
	
		1 int[] x ;
		
		
		System.out.println(obj.x); // null 
        System.out.println(obj.x[0]); //RE: NullPointerException
								  
								  
		2. int [] x = new int[3];						  
								  
			System.out.println(obj.x); // [I3ea@i					  
			System.out.println(obj.x[0]); // 0					  
								  
								  
	II. Static Level 
    ----------------

			
								  
		1 static int[] x ; 						  
								  
								  
		System.out.println(obj.x); // null						  
		System.out.println(obj.x[0]); //RE: NullPointerException						  
								  						  
								  						  
		2. static  int [] x = new int[3];								  
								  						  
			System.out.println(obj.x); //[I@34f353						  
			System.out.println(obj.x[0]); //0						  
								  						  
								  
								  
	III. Local Level 
    ----------------
	
			
								  
		1  int[] x ; 						  
								  
								  
		System.out.println(obj.x); //CE: variable x might not have been initilized						  
		System.out.println(obj.x[0]); //CE: variable x might not have been initilized					  
								  						  
								  						  
		2. static  int [] x = new int[3];								  
								  						  
			System.out.println(obj.x); //[I@34f353						  
			System.out.println(obj.x[0]); //0									  
			
			
								  
	Note: Once we creates an array every array element by default initilized with default values erespective whether it is instance 
		  or static or local array .
	   
	   
	   
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
	
	
	
    
    
    





	
	