
																Language Fundamentals Part-8 || Arrays Part-3
															===================================================

======================================================================
  Arrays Declaration, creation, and Initialization  in a single Line.															
======================================================================

 -> We can Declaration, creation, and Initialization  in a single Line (shortcurt reprasentation).


 --------------------	
 |	int [] x ;      |	  int [] x = {10,20,30};
 |	x = new int[3]; |== > char [] ch  = {'a', 'e','i','o','u'}; 
 |	x[0] =10;    	|     String [] s = {"A", "AA","AAA"}; 
 --------------------    
 
 
 -> We can extend this shortcurt for multidimonsional arrays also
 
	Ex. 
													    --------------------				
                                                x------>|		 |		   |		    	
                                                		--------------------    	
                                                		    |		   |    	
    int[][] x ={ {10,20}, {30,40,50} };            			|		   |    	
                                                	-------------   -----------------    	
                                                	| 10   |20  |   | 30 | 40  | 50 |    	
                                                	-------------   -----------------    	
													
													
	Ex. 												

	int [][][] x ={{{10,20,30,}, {40,50,60}}, {{70,80},{90,100,110}}};
	
	System.out.println(x[0][1][2]); // 60
	System.out.println(x[1][0][1]); // 80
	System.out.println(x[2][0][0]); // RE: ArrayIndexOutOfBoundsException	--------------------			
	System.out.println(x[1][2][0]); // RE: AIOOBE			       x------>|	0	 |	1	   |		  
	System.out.println(x[1][1][1]);  //100                             		--------------------    	
	System.out.println(x[0][1][2]); //RE: AIOOBE                       		    |		   |    	
	System.out.println(x[2][1][0]); //RE: AIOOBE                      			|		   |    	
		                                                            	-------------   ------------ 
                                                                    	|   0  | 1  |   | 0   |  1 | 
                                                                    	-------------   ------------ 
														|-------------|-↑     -- ↑		   |    |					
														|					  |			   |	|---------------- 
														|					  ↓			   |--↓					↓
													-----------------  -----------------	-----------	  -----------------			
                                                    | 10 | 20  | 30 |  | 40 | 50  | 60 |    | 70 | 80 |   | 90 | 100 | 110 |
                                                    -----------------  -----------------    -----------   -----------------
												
  -> if we want to use this shortcurt compulsory we should perform all activity in a single line. if we are trying to divide in to multiple line then we will get compile 
     time error   

  
    int x = 10; == int x ;  								int [] x = {10,20,30}; == int [] x ;															
					x =10;                               							x ={1,20,30	};	
	// It is valid 																			|--------// CE: Illegal start of Expression
					



==========================================================================================================================================================================

																		6. length vs length.
																	-========================-
=========
 length
=========

 -> length is a final variable applicable for arrays.
 
 -> length variable reprasents the size of the array.

 int [] x = new int[6];
 System.out.println(x.length()); //CE: cannot find symbol Symbol: Method length() , location :class int[]
 System.out.println(x.length); //6 
 
 
 
----------- 
 length()
-----------

 -> length() is a final method applicable for string objects.
 
 -> length() method returns number of charcters present in the string.
 
 
	class String {
		
			length(){
				
			}
	}
 

	string s ="durga";
	System.out.println(s.length); // CE: cannot find symbol . Symbol: variable length, Location: java.lang.string
	System.ou.println(s.length()); // 5
 
 Note: length variable applicable for arrays but not for string objects where as length() method applicable for string objects but not for array's.



	string[] s = {"A", "AA", "AAA"};
	
	
	1. System.out.println(s.langth); // 3 
	1. System.out.println(s.langth()); //CE: Cannot find symbol. Symbol: method length(). Location: class String[]
	1. System.out.println(s[0].langth);// CE: Cannot find symbol. Symbol: variable length. Location class java.lang.string
	1. System.out.println(s[0].langth()); // 1 
	
 -> In multidimonsional array's length variable reprasent only base size but not total size.
 

	int [][] x = new int[6][3]								   --------------------------------------------------------------------------------------
														x----> |			|			|			|			|			|			|			|
	System.out.println(x.length); // 6 						   --------------------------------------------------------------------------------------	
	System.out.println(x[0].length); //3 					 ↓---|	  			↓            ↓                ↓                    ↓                ↓
											 -----------------	     -----------------  -----------------   -----------------  -----------------  -----------------
											 |    |    |     |		 |    |    |     |  |    |    |     |   |    |    |     |  |    |    |     |  |    |    |     |
                                             -----------------       -----------------  -----------------   -----------------  -----------------  -----------------
 
  -> There is no direct way to find total length of multidimonsional array but indirectly we can find as follows .
  
	x[0].length+x[1].length+x[2].length+x[3].length+x[4].length+x[5].length....
 
==========================================================================================================================================================================
 
																			7. Anonymous arrays.
																		==========================


 -> Sometimes we can declare an array without name such type of nameless arrays are called Anonymous arrays.

 -> The main purpose of anonymous array is just for instant use (one time usages).

 -> We can create anonymous array as follows. 
 
		new int [] {10,20,30,40}

 -> While creating anonymous arrays we can't specify the size otherwise we will get compile time error.

		new inr [3]{10,20,30}; // invalid 
		new inr []{10,20,30}; //valid
		
		
	class Test {
		
			public static void main(String args[]){
				
				sum (new int [] {10,20,30,40});
				
			
			}
			
			public stait void sum (int [] x) {
				
					int total = 0;
					for (int x1 : x) {
						
						total = total+x1;
						}	
						System.out.println("The sum is : " + total);
					}
	}				

 -> we can create multidimonsional anonymous arrays also.
 
	Ex. 
		 new int [][] {{ 10,20}, {30,40,50}};
		 

 -> Based on our requirement we can give the name for anonymous array then it is no longer anonymous.

	Ex. 
	
		int [] x = new int [] {10,20,30};
		
		
		
		class Test {
        	
        		public static void main(String args[]){
        			
        			sum (new int [] {10,20,30,40});
        			
        		
        		}
        		
        		public stait void sum (int [] x) {
        			
        				int total = 0;
        				for (int x1 : x) {
        					
        					total = total+x1;
        					}	
        					System.out.println("The sum is : " + total);
        				}
						
  -> In the above example just to call some method we required an array but after compliting sum() method call we are not using that array anymore. Hance a for this 
	 one time requierment anonymous array is the best choice.
	 

 ---------------------------
 Aray Elements Assingments  
 ---------------------------
 
 case 1: In the case of primitive type arrays as array elements we can provide any type wich can be inplicitly promoted to declared type  
 
		Ex. 1 
	
		int [] x = new int[5];													-------------------------------------------------------------------
			x[0] = 10;                                                          | 1byte 	 2byte				  |							      |
			x[1] = 'a';                                                         |byte--> short----| 			  |	                              |
			byte b 20;                                                          |			  |->|-->int-->long-->|float-->double                 |
            x[2]= b;                                                            |	char------|		4byte   8byte | 4byte  8byte 	              |
            short s = 30;                                                       |    2byte 						  |		                          |
            x[3] = s;                                                           |								  |                               |
            x[4] = 10l; //CE: PLP found:long required: int                      |	 This is data type is 		  |	This is data type is 	      |
                                                                                |	 Integeral data type 		  |	floating-point data type      |
                                                                                |								  |                               |
                                                                                ------------------------------------------------------------------
 
	Ex. 2 
	
		In the case of float type arrays the allowed data types are byte short char int long float.
		
		
		
 case 2 : Obeject type Array. 


		EX. 1 In the case of object type arrays as a array elements we can provide either declared type object or its child class object  
		
		object[] a = new object[10];
		a[0] = new object();
		a[1] = new string("Durga");
		a[2] = new Integer(10);
 
			
	   Ex. 2 
        
															 Number 									
												--------------------------------											
												 |	   |	|	 |	  |		|											
	   Number[] n = new Number[10];				byte short int long float double									
       n[0]= new Integer(10);											
       n[1]= new  Double (10.0);										 
	   n[2]= new String ("Durga"); //CE: foung: java.lang.String required: java.lang.Number 	
 
 
 case 3: For interface type arrays as array elements it's implementation class object are allowed.	
 
																														Runnable(I)
	Runnable [] r = new Runnable[10];																						↓
	r[0] = new Thread();																									↓
	r[1] = new String("Durga"); //CE: incompatiable type found : java.lang.String require: java.lang.Runnable			 Thread 
 
 
 
 
			Array Type 												Allowed Element Types
	-----------------------------------------------------------------------------------------------------------------------		
	|1.  Primitive Arrays 						|	1. 	We can provide which can be implicitly promoted to declared type. |	
	|                                           |                                                                         |
    |2. Object type Arrays 						|	2. Either declared type or it's child class object                    |
	|                                           |                                                                         |
    |3. Abstract class Type Arrays 				|	3. It's child class object are allowed.                               |
    |                                           |                                                                         |
    |4. interface type array					|	4. It's implementation class object are allowed.	                  |
    -----------------------------------------------------------------------------------------------------------------------
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

































																	


					
    					
											
					
													
													
													
													
													
													
													
													
													
													
													