
																Language Fundamentals Part-6 || Arrays Part-1
															======================================================

===========															
 Arrays 
===========
 
 1. Introduction.
 2. Arrays Declaration.
 3. Arrays Creations.
 4. Arrays Intialization.
 5. Arrays Declaration, creation, and Initialization  in a single Line.
 6. length vs length.	
 7. Anonymous arrays.
 8. Arrays elements assingment.
 9  Arays variable assingment.

==========================================================================================================================================================================

																		1. Introduction.		
																	======================

 -> An array is a n indexed collection of fixed number of homogeneous data elements.
 
 -> The main advantage of arrays is we can reprasent multiple number of values by using single variable so that readability of the code we will be imporoved.
 
 -> But a the main disadvantage of arrays is fixed in size that is once we creates an array there is no chance of increasing or decreasing the size based on requirement.
 
 -> Hence a to use arrays concept compulsory we should know the size in advanced, which may not possible always.
 
 

	int x = 10;													  -------------------------------------	
	int y = 20;		== int [] x = new int [10000];			x---> | 1 | 2 | 3 | 4 |...........| 10000 | 
    int z = 30; 												  -------------------------------------	
	
	

==========================================================================================================================================================================

																		2. Arrays Declaration
																	-----------------------------
----------------------------------------
 1. One dimensional arrays declaration	
----------------------------------------

 ->
	int[]  x ; // valid It's recomanded because name is clrealy separated from type
	
	int  []x; // valid 
	
	int   x[] ; // valid
 

 -> At the time of declaration we can't specify the size otherwise we will get compile error.
 
	int[6] x ; // invalid 
	
	int[] x ; // valid  

-----------------------------------------
 2. Two Dimensional arrays declaration 
-----------------------------------------

 -> 
 
		int [][]  x ; // valid 
		int 	[][]x; // valid 
		int 	x[][];// valid 
		int []  []x; // valid 
		int[] 	x[]; // valid 
		int 	[]x[]; // valid 	
		

 -> Which of following are valid 

	int []	a, b; //a-> 1 b -1
	int[] a[]b;     // a-> 2, b->1
	int []	a[],b[]; // a->2, b->2
	int [] []a,b;	// a->2. b->2
	int[] []a,b[];	// a->2. b->3
	
 -> If we want to specify dimansion before the variable that facility is applicable only for first variable in a declaration .
 
 -> If we are trying to apply for remaining variables we will get compile time error.


	int []a , []b, []c ;
		 v
	int []  []a,[]b; // invalid CE: 

-----------------------------------------
 3. Three Dimensional arrays declaration 
-----------------------------------------
 	
	
		int[][][]  x ; // valid 
		int 	[][][]x; // valid 
		int 	x[][][];// valid 
		int []  [][]x; // valid 
		int[] 	x[][]; // valid 
		int[] 	[]x[]; // valid 	
		int[][]  []x; // valid
		int[][]		x[]; // valid
		int		[][]x[]; // valid
		int[] 	x[][]; // valid
	
	
==========================================================================================================================================================================	
	
																3. Array Creations 
															========================

 -> Every array in java is an object only hance a we can create arrays by using new operator.
 
	Ex. 
												
		int [] a = new int [3];					-------------		
										a-----> |	|	|	|
												-------------
		
		
 -> For every array type corresponding are available and these classes are part of java langauge and not available to the programmer level.	
	
	class Main {
		public static void main(String[] args) {
		int[] a = new int[3];
		int[][] a1 = new int[3][];
		
		System.out.println(a.getClass().getName());
		System.out.println(a1.getClass().getName());
		
		}
	} //[I [[I
	
	
	
 -> 

		Array Type 				corresponding class Name
	
		1. int []					[I
		2. int [][]					[[I
		3. double[]					[D
		4. short[]				    [S
		5. byte []					[B	
		6. boolean[]			    [Z
		
		
 -> Loop holes related to Arrays


 1. At the time of array creation compulsory we should specify the size otherwise we will get compile time error.

		Ex. 
		
		int [] x = new int[]; // invalid CE:  
		int [] x = new int[3]; // valid   
		
		
		
 2. It is a legal to have an with size zero in java.
		
		Ex. 
 
		int[] x = new int[0];
		
		
 3. If we are trying to specify array size with some negative int value then we will get Runtime Exception saying NegativeArraySizeException.
 
	Ex. 
	
	int[] x = new int [-3]; // invalid RE: NegativeArraySizeException
		
		
 4. To specify array size the allowed data types are :(byte short char int) if we are trying to specify any other type then we will get compile time error.
 
	Ex. 
																						-------------------------------------------------------------------
	  int[] x = new int[10];                                                            | 1byte 	 2byte				  |							      |
	  int[] x = new int['a'];                                                           |byte--> short----| 			  |	                              |
	                                                                                    |			  |->|-->int-->long-->|float-->double                 |
	  byte  b =20;											                            |	char------|		4byte   8byte | 4byte  8byte 	              |
	  int[] x = new int[b]; 	                                                        |    2byte 						  |		                          |
	                                                                                    |								  |                               |
	 short 	s =30;                                                                      |	 This is data type is 		  |	This is data type is 	      |
	 int[] x = new int[s];                                                              |	 Integeral data type 		  |	floating-point data type      |
	 int[] x = new intp[10l]; // invalid CE: PLP found:long required: int               |								  |                               |
	                                                                                    ------------------------------------------------------------------
		
		
 5.  The maximum allowed array size in java is 2147483647 which the maximum value of int data type.

	Ex. 
	
	int[] x = new int[2147483647]; //valid
	int[] x = new int[2147483648]; // invalid CE: integer number to large  
		
	-> even in the first case we may get runtime exception if a sufficiant heap memory not available.	
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



















 
 