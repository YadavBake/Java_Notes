
															Language Fundamentals Part-9 || Arrays Part-4
														====================================================
----------------------------
 Array Variable Assingment 	
----------------------------

 case 1:  Element level pramosions are not applicable at array level for example char element can be pramoted to int type whereas char array cannot be pramoted
          to int[] array.

	
	
		int[] x = {10,20,30,40};
		char [] ch = { 'a','b','c','d',};
															 ----------------
															 |				|
		int[] b = x ;  //valid 				int x ---------> |------------- |
													 |---->	 || |  |   |  | |
											int b ---		 |------------- |
															 ----------------
		
		int [] c = ch;	 // invalid CE: incompatiable types found: char [] required: int[]			char []			int []
																									↓				  ↓		
																								   [C				  [I	
																								   
																								   
																								   
 -> Which of following pramosions will be perform automatically.

	
	char --->int //valid 
	char[] --->int[] //invalid
	int---->double // valid
	int[] --->double[] //invalid
	float-->int // invalid
	float[] -->int[] // //invalid
	string-->object // valid
	string[] -->object[] // valid  
	
	- But in the case of object type arrays  child class type array can be pramoted parent class type array.
	
		Ex. 
	
		string s = {"A", "B","C"}
		object[] a =s ;
	

 case 2 : Whenever we are assigning one array to another array internal elements won't be copy just reference variables will be re-assinged.


	int[] a ={10,20,30,40,50,60};
	int [] b = {70,80};
	
	
															-------------------------------				
	1. a= b //valid 							a ----X---> | 10 | 20 | 30 | 40 | 50 | 60 | 
													|		-------------------------------	
													|------>-----------
												b---------> | 70 | 80 |
															-----------	
	
	
	2. b=a  // valid							
	                                            			-------------------------------	
	                                            a ----X---> | 10 | 20 | 30 | 40 | 50 | 60 | 
	                                            	|------>-------------------------------	
	                                            	|       -----------
	                                            b------X--> | 70 | 80 |
	                                            			-----------	
	
	
	
 case 3: Whenever we are assigning one array to another the dimansions must be matched for example in the one dimansional int[] array we should provide one dimansional
		 array [] only if we are trying to provide any other dimansion then we will get compile time error.

														
																																--------------
		int [][] a = new int [3][] ;																				  a-------->| 0 | 1  | 2 |
																																--------------
       a[0] = new int[4][3]; // CE: incompatiable types  found : int [][] required : int []												  	
	   a[0] =10; //CE: incompatiable types found: int required: int []
	   a[0] = new int [2]; //valid 	
	
 Note: Whenever we are assigning one array to another array both dimansions and types must be matched but sizes are not required to matched.


	Ex. 1 
	
	
	class Test {
		
	public static void main (String args[]){
		
		for(int i=0; i<=args.length;i++){
			System.out.println(args[i]);
		}
	}
}


		java		Test A		B 		c 											java		Test 
		   A
		   B
		   C 	
		// RE: ArrayIndexOutOfBoundsException										// RE: ArrayIndexOutOfBoundsException
		
		
		java		Test A		B 	 
			A
			B
		// RE: ArrayIndexOutOfBoundsException
	
	
	
	Ex 2. 
	
	class Test {
		
			public static void main(String args[]){
				
				string [] argh = { "X", "Y", "Z"};
				
				args=argh;
				for(string s : args){
					System.out.println(s);
				}
			}	
	}
	
	
	java		Test A		B 		c 											java		Test 
	 x																			 x
	 y                                                                           y
	 z                                                                           z
	
	
	
	java		Test A		B 	 
	x
	y
	z
	
	
	Ex. 3 
																	-----------------
	                                                                |   |	|	|   |
	                                                                -----------------			---------
	int [][]x = new int [4][3]; //5										 ↑   |---------------- >|   |	|
	a[0] = new int [4];	//1											   ------------------		---------
	a[1] = new int [2];//1		------<-----<----------a-----X------->| 0 | 1 |  2	| 3	| 
								↓									   ------------------
								↓					-----------X--------|  ↓--|  ↓	  |------------
								↓					↓					 ↓--X-↓	 ↓ 				  ↓
								↓			--------------  --------------    --------------    --------------
	                            ↓           |   |	|	|   |   |	|	 |    |   |	 |	  |     |   |	|	|
	                            ↓           --------------  --------------    --------------    --------------
								↓	
								↓
	a = new int[3][2]; //4 		↓
								↓
								↓							 --------------
	                            ↓----------->a------------>  |   |	 |    |
	                                                         --------------
												|-------------↑    |	|
												|				   ↓	|------↓
											---------		---------		---------
	                                        |   |	|       |   |	|       |   |	|
	                                        ---------       ---------       ---------
	
	
	
	
	1 . Total  how many objects created ?  11
	
	2. Total how many object eligible for GC ? 7 
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	