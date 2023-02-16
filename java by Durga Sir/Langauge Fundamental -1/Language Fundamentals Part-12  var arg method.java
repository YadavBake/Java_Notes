
												Language Fundamentals Part-12 || var-arg method		
											=====================================================

=========================================================
 var-arg Methods (Variable Number of Argument Methods)	
=========================================================

 -> Until 1.4v version we can't declare a method with variable number of arguments if there is change in number of arguments 
    compulsory we should go for new method. It increases length of the code and redeuces readbility.
	
 -> To overcome this problem sun people introduced var-arg methods 1.5v version accroding to this we can declare a method which can 
    take variable number of arguments such type of methods are called var-arg methods.

 -> We can declare a var-arg method as follows: 	
	
	
		m1(int... x )

 -> We can called this method by passing any number of int values including zero number.
	
		Ex. 
		
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
		
 
	Ex. 
	
	class Test {											class Test {
		                                                    	
		public static void m1(int... x ){                   	public static void m1(int... x ){
			                                                		
			System.out.println("var-arg method");           		System.out.println("The number of arguments you pass"+xlength);
		}                                                   	}
		public static void main(String args[]){             	public static void main(String args[]){
			                                                		
			m1();									        		m1();									
            m1(10);									                m1(10);									
            m1(10,20);                                              m1(10,20);
            m1(10,20,30,40);						                m1(10,20,30,40);						
		}                                                   	}
	}	                                                    }	
	
 ->  Internally var-arg parameter will be converted into one deminasional array hance a within the var-arg method we can differentiate 
     values by using index
	
	
			↑---------↓	
	m1 (int...x ){	 int[] x --> 
	
	}
	
 ->



		class Test {
			
			public static void main(String args[]){
				
				sum(); // expected output is The Sum: 0
				sum(10,20); // expected output is The Sum: 30
				sum(10,20,30); // expected output is The Sum: 60
				sum(10,20,30,40); // expected output is The Sum: 100
				
			}
			public static void sum(int... x ){
				
				int total =0;
				for(int x1 : x){
					total = total+x1;
				}
				System.out.println("The Sum is :" +total);
			}
		}
	
	
 Case 1: Which of the following are valid var-arg method declarations ?


	m1(int[]x)			m1(int... x) // valid 
	m1(int	[]x)		m1(int	...x)// valid
	m1(int	x[])		m1(int	x...) // invalid
						m1(int...x) //valid
						m1(int.	..x) //invalid
						m1(int	.x..)//invalid
 
 Case 2: We can mix var-arg parameter with normal parameter. 	
	
	Ex. 
	
	m1(int x, int... y ) // valid
	m1(string s, double... y )	// valid
	
	
 Case 3: If we mix normal parameter with var-arg parameter then var-arg parameter should be last parameter .
	
	m1(double... d, string s) // invalid
	m1(char ch, string... s) // valid
	
 Case 4: Inside var-arg method we can take only one var-arg parameter and we can't take more then one var-arg parameter 

	m1(int... x. double... d) // invalid
	
 Case 5: Inside class we can't declare var-arg method and corresponding one dimensional array method simultaneously otherwise we 
		 will get compile time error.

		class Test {
			
				public static void m1(int... x){
					
					System.out.println("int...");
				}
				public static void m1(int[] x ){
					
					System.out.println("int[]");
				}
		} //CE: cannot declare both m1(int[])and m1(int..) in test 

 Case 6: In ganeral var-arg method will get list priority that is if no other method matched then only var-arg method will get the
         chance. It is excatly same as default 'case' inside switch 
 
		Ex. 
		
		class Test {
			
			public static void m1(int... x){
				
				System.out.println("var-arg method");
			}
			public static void m1(int x ){
				
				System.out.println("Normal method");
			}

		   public static void main(String args[]){

				m1(); // var-arg method
				m1(10,20); // var-arg method
				m1(10) // Noraml method
		   }
		}
		
	
 -> Equivelants between var-arg parameter and one dimensional array ? 


	Case 1: Where ever one dimensional array  prasent we can replace with var-arg parameter.
	
	
		m1(int[] x) can be replace m1(int.. x )
		
		Ex. 
		
		main(String[] arg) can be replaced with main(String... args)
	
	
		---------------------------------------------------
		|							|					  |
		|	m1(int []  x )   		|		m1(int... x ) |
		---------------------------------------------------									              
		|	m1(new int[]{10});		|  -> 	valid         |
		|m1(new int[]{10,20});		|  -> 	valid 	      |
		|m1(new int[]{10,20,30});	|  ->    valid        |
		|							|		m1();	      |
		|							|		m1(10);       |
		|							|		m1(10,20);    |
		|							|                     |
		---------------------------------------------------
		
		
		ex. 
		
		class Test {
			
			public static void main(String... args){
				
				System.out.println("Var-arg method");
			}
		} 

	Case 2: Where ever var-arg parameter prasent we can't replace with one dimensional array.
				
			
			m1(int... x) we can't replace with m1(int[] x) // invalid
	
	
		---------------------------------------------------
	    |							|					  |
	    |	m1(int...  x )   		|		m1(int[]  x ) |
	    ---------------------------------------------------
	    |	m1();	   				|  -> 	invalid       |
	    |	m1(10);    				|  -> 	invalid       |
	    |	m1(10,20); 				|  ->   invalid       |
	    |	m1(new int[]{10});		|  -> 	valid	      |
	    |							|				      |
	    |							|				      |
	    |							|                     |
	    ---------------------------------------------------
	
	
	Note: 
	
		1. m1(int... x) => int[] x 
		
			- We can call these method by passing a group of int values and x will become one dimensional array.
		
		2. m1(string..x) => String[] x
		
		3. m1(int[]... x) => int[][]
		
			- We can call these method by passing a group of one dimensional int[] and x will become two dimensional array.
		
		4. m1(int[][]... x) => int[][][]
		
	
			Ex. 
			
			
				class Test {
					
					public static void main(String[] args) {
						
						int[] a = {10,20,30};								  -------------	
						int[] b = {40,50,60);							x-----|		|	  |	
																			  ------------- 			
						m1(a,b);												|		|
					}													-------------- --------------
						public static void m1(int[]... x ){				| 10| 20 | 30| | 40| 50 | 60|
																		-------------- --------------
							for(int[] x1 : x){							  x1				x1 
								
								System.out.println(x1[0]);
							}
						}
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		