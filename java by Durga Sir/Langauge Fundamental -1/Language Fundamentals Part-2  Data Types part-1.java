
															Language Fundamentals Part-2 || Data Types part-1
														========================================================	
==================
 2 . Data Types 	
==================

 -> In java every variable and every expression has some type.

 -> Each and every data type is clearly difined.

 -> Every assingment should be checked by compiler for type compatability.

 -> Because of above resions we can canclude java langauge is strongly typed programming language.
 
 -> java is not considard as pure object oriented programming langauge because several OOP's fetures are not satisfied by java(like a operator overloading and a 
    multiple inheritance ect..) 

 -> More over we are depending on primitive data types which non-objects.

-----------------------------
 2.1 primmitive Data Types 
----------------------------- 
 
																primmitive Data Types 
																	   |
																	   |
				-----------------------------------------------------------------------------------------------------------													   
				↓																										  ↓
			Numberic Data type 					int x=10														Non-Numeric data Types 
				   ↓							int x=-10															 |-char 
		---------------------		   			double =-10.5														 |-boolean 	
		↓				    ↓
	 Integral DT		floating-point DT	 			
	   |-byte 				  |-float  
	   |-short				  |-double	
	   |-int
	   |-long
	   
	   
 -> Except boolean and char remaining data type are considard as signed data type. Because we can reprasent both  postive(+ve) and Negative(-ve) numbers .
 
 
 
  1. Byte Data Type :
----------------------
			
	-> size: 1 byte (8 bit)										 Most Significant Bit 
	   Max_value: +127											   ↑	
	   Min_value  -128 	  										  MSB	
      Ramge -128 to 127											---------------------------------------	
																| x  | 1  | 1  | 1  | 1 | 1  | 1 |  1 | 
																---------------------------------------
																  ↓  2'6   2'5  2'4  2'3  2'2 2'1  2'0   
															  signed bit 	
															
															 0 == +ve	2'6 = 64 
															 1 == -ve   2'5 = 32
																		2'4 = 16
																		2'3 = 8
																		2'2 = 4
																		2'1 = 2
																		2'0 = 1
																		=======
																		    127
	
 -> The most significant bit access signed bit.

 -> Zero means postive number.

 -> one means Negative number. 
	   
 -> Positive number will be reprasent directly in a memory where as Negative number will  be  reprasent in 2's compliments form.

  Ex. 
 
  byte =10; //valid
  byte = 127; // valid 
  byte = 128; // invalid  CE: possible loss of precision found int required  byte.
  byte = 10.5 // invalid  CE : PLP fount double required  byte
  byte b = true // invalid CE: incompatible type found boolean required byte 
  byte b = "durga" // invalid CE: incompatible type found java.lang.String required byte 
  
  
  class Test {
	  
	  public static void main(String args[]){
		  

			 byte =10; 
             byte = 127; 
             byte = 128; 
             byte = 10.5 
             byte b = true; 
             byte b = "durga";
			System.out.println(b)		
	  }
  }  
             
 -> Byte is the best choice if we want to handle data in term of streams either from the file or from the network( file supported form or network supported form is 
    byte ).
	
	
===========	
 2. Short 
===========
	
  -> This is a most rearly used data type in java.
  -> Size: 2 byte(16 bit)
  -> -2'15 to 2'15-1 (-32768 to 32767)

 -> 

 short s = 32767; // valid
 short s = 32768; // invalid CE: PLP found int required short  
 short s = 10.5 // invalid CE: PLP found double required short 
 short s = true // invalid CE: compatable type found boolean required short 
 
 
 -> Short data type is best shutable for 16 bit processor like 8085 but this processors are complitly outdated and hance currsponding short data type is also 
    outdatet data type.
	
	
=================
 3 Int Data type 
=================

 ->  The most commanly used data type in java is int. 
 -> Size: 4 byte (32 bit).
 -> Range: -2'31 to 2'31 -1 (-2147483648 to 2147483747). 
 
 
  int x = 2147483647 ;//valid
  int x = 2147483648 ;// invalid CE: Integer number to-large.
  int x = 2147483648l; // invalid CE: PLP found long required int.
  int x = true; // invalid CE: incompatible type found boolean required int.
	
	
 
 



 
	   
	   
	   
	   
	   
	   
	   
	   
	   