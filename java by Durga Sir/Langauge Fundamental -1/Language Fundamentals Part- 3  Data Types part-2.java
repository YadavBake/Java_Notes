
															Language Fundamentals Part- 3 || Data Types part-2
														=========================================================
=====================
 4. Long Data type 
=====================

 -> Sometimes int my not enough to hold big values then we should go for long type.

 -> Ex. 1 

		- The amount of distance traveld by light in thousand days, to hold this value int may not enough we should go for data type.

				Ex. ling l = 1,2600*6*60*24*1000 miles
				
 -> The number of charcters prasent in a big file may exised int range hance a the return type of length method is long but not int.
 
				Ex. long l = f.length();
				
 -> Size: 8 bytes(74)
 -> - 2'63 to 2'63-1

 Note: All the above data types (byte,short,int,long) ment for reprasenting integeral values if we want to reprasente floating point values then we should go for 
       floating point data types.
	   
==========================================================================================================================================================================	   

																		Floating-point Data types 
																	--------------------------------
																				  ↓↓
								------------------------------------------------------------------------------------------------------------
								|	                  float[5] 						|					double [6]                         |
								------------------------------------------------------------------------------------------------------------	
								|												    |                                                      |
								|1. If we want 5 to 6 decimale placeses of accurry  | If we want 14 to 15 decimale places of accurry then  |
								|   we should go for float                          | we should go for double.                             |
								| 													|                                                      |
								|2. float followes single precision.				| double followes Double precision.                    |
								|													|	                                                   |
								|3. size: 4 byte. 								    | size: 8 byte.                                        |
								|													|                                                      |
								|4. Range:										    | Range:                                               |
								|   -3.4e38 to 3.4e38								|  -1.7e308 to 1.7e308	                               |
								|													|		                                               |
								------------------------------------------------------------------------------------------------------------
				
========================				
 7. boolean data type 		
========================

 -> Size: Not Applicable [Virtual Machine dependent ]
 -> Range: Not Applicable [But allowed values are true or false]


  boolean b = true; // valid
  boolean b =0; // invalid CE: Incompatible found int required boolean 
  boolean b = True;//invalid CE: cannot find symbol. Symbol: variable True. Location : class Test 
  boolean b = "True"; // invalid CE: incompatible type found java.lang.String required boolean 


	int x =0; 
	if(x){--------------------------------------
	  System.out.println("Hello");			   |	
		}									   |			
	else									   |--->  //incompatible type found java.lang.String required boolean 
		{																		↑
	System.out.println("Hi");												    ↑
   }																			↑			
																while(1){--------
																	System.out.println("Hi");
																}

====================
 8 char data types 
====================

 -> Old langauges(like C/C++) or ASCII code based and the number of allowed different ASCII code charcters are <=256.

 -> To reprasente this 256 charcters 8 bits are enough hance a the size of char in old langauges is 1 byte.

 -> But java is unicode based and the number of different unicode charcters are >256 and <=65536. 
 
 -> To reprasente this many charcters 8 bit may not enough compulsory we should go for 16 bits hance a the size of char in java is 2 byte.
 
	Size: 2 byte.
	Range 0 to 65535
	
========================================== 
 Summary of java Primitive Data types 
==========================================


			--------------------------------------------------------------------------------------------------------------------------------------
			| Data type 	|		siz    |		range 									|	wrapper class 	   |		default value       |
			|               |              |                      							|                      |                            |
			|1. byte 		|	  1 byte   |  -2'7 to 2'7-1(-128 to 127)                    |   Byte               |			0               |
			|               |              |                                                |                      |                            |
			|2. short       |    2 byte    | -2'15 to 2'15-1 (-32768 to 32767)              |  Short               |			0               |
			|               |              |                                                |                      |                            |
			|3. int         |    4 byte    | -2'31 to 2'31 -1 (-2147483648 to 2147483747).  |  Integer             |			0               |
			|               |              |                                                |                      |		                    |
			|4. long        |    8 byte    | - 2'63 to 2'63-1                               |  Long                |			0               |
			|               |              |                                                |                      |                            |
			|5. float       |    4 byte    | -3.4e38 to 3.4e38	                            | Float                |			0.0             |
			|               |              |                                                |                      |                            |
			|6. double      |    8 byte    | -1.7e308 to 1.7e308	                        | Double               |			0.0             |
			|               |              |                                                |                      |                            |
			|7. boolean     |     N A      | N A [But allowed values are true or false]     | Boolean	           |			false           |
			|               |              |                                                |                      |                            |
			|8. char        |     N A      | 0 to 65535                                     | Charcter             |   0[reprasente space class |
			|               |              |                                                |                      |                            |
			-------------------------------------------------------------------------------------------------------------------------------------


 -> null is the default value for object reference and we can't apply for primitives if we are trying to use for primitive then we will get compile time error.
    
	Ex. 
   
	char ch = null; // invalid CE: Compatible type : found null required null
















 




 