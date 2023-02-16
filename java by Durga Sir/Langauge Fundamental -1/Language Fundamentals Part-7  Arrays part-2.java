
															   Language Fundamentals Part-7 || Arrays part-2
															 =================================================
====================================
  Two Dimensional Arrays creations  
====================================

 -> In java two dimensional array not implemented by using matrix style sun people followed Array of Arrays approach for Multiple dimensional creations.

 -> The main advantage of this approach is memory untilization will be improved.

       Ex. 
																--------------------		
		int [][] = new int[2][];						x------>|		 |		   |		
		x = new int [2];										--------------------
		x = new int [3];										    |		   |
																	|		   |
															-------------   -----------------		
															|	   |    |   |    |    |     |
															-------------   -----------------
															
 
	int[][][] = new int[2][][];
    x[0] = new int [3][];								--------------------		
    x[0][0] = new int [1];                      x------>|		 |		   |		
	x[0][1] = new int [2];                      		--------------------
    x[0][2] = new int [3];                      		    |		   |
	x[1] = new int[2][2];	                    			|		   |
                                                	-------------     ------------
                                                	|	|   |    |    |    |     |
                                                	-------------     ------------
													 | 	 |    |			|		|----------
													 |	 |    |		  ------------		  |
										-------------↓   ↓    |------ |    |     |     ------------
										↓			 ------------	| ------------     |    |     |
									 ----- 	         |    |     |   |                  ------------
                                     |	|            ------------   |
                                     -----                          |
															------------- 		
                                                            |	|   |    |
                                                            ------------- 
															
 -> which of the following array declarations are valid ?

    int[] a  = new int []; // invalid 
	int[] a  = new int [3]; // valid 
	int[][] a  = new int [][]; // invalid 
	int[][] a  = new int [3][]; // valid 
	int[][] a  = new int [][4]; // invalid 
	int[][] a  = new int [3][4]; // valid 
	int[][][] a  = new int [3][4][5]; // valid 
	int[][][] a  = new int [3][4][]; // valid 
	int[][][] a  = new int [3][][5]; // invalid 
	int[][][] a  = new int [][4][5]; // invalid 
	
==========================================================================================================================================================================

																4. Array Initialization 
															=============================

-> Once we creates an array every element by default initialized with default values zero.

																						
    int[] x = new int [3];											     ------------- 	
	System.out.println(x);										x------->|	|   |    |
	System.out.println(x[0]);                                            ------------- 
	
	
 Note: Whenever we are trying to print any reference variable internally toString() method will be called 	which is implemented by default to return the string in the 
       following  classname@hashcode_in_Hexadecimalform.
	
	
	int[][] x = new int [2][3];											 --------------	
	System.out.println(x);	// [[I@3ezsa5						x------->|	   |      | 
	System.out.println(x[0]); //[I@3sdns98								 --------------
	System.out.println(x[0][0]); //0										|		|
																	-------------  --------------	
	                                                                | 0	| 0 | 0 |  | 0  | 0  | 0|
	                                                                -------------  --------------
	
	
	
	
	
	int[][] x = new int [2][];				
	System.out.println(x);	// [[I@31befd9f
	System.out.println(x[0]);// null												 --------------	
	System.out.println(x[0][0]); //RE : NullPointerException		        x------->| null |null | 
	                                                                        		 --------------
	
	
 Note: If we are trying perform any operation on null then we will get runtime exception saying NullPointerException.


 -> Once a we creates an array every array element by default initialized with default values.
 
 -> If we are not saticified with default values then we can override this values with our customized values.

	int [] x = new int [6]
	x [0]=10;												  -----------------------------
	x [1]=20;										x-------->| 0| 0 | 0 |  | 0  | 0  | 0 | --> with default value of array 
	x [2]=30;                                                 -----------------------------
	x [3]=40;										
	x [4]=50;										
	x [5]=60;										
	x [6]=70; //RE: ArrayIndexOutOfBoundsException				  -----------------------------								
	x [-6]=80;//RE: ArrayIndexOutOfBoundsException		x-------->|10| 20 |30 | 40  | 50  | 60 -->After customized value of array	 								
	x [2.5]=90;//CE: PLP found double required int 		          -----------------------------									
								
 
 Note: IF we are trying to access array element with out of range index (either positive value or negative int value ) then we will get runtime exception saying 
       ArrayIndexOutOfBoundsException.
															
														
															
															