
																Language Fundamentals Part-4 || Literals Part-1
															======================================================

===============
 Literals
===============

 -> A constant value which can be assinged to the variable is called  a literal.

	Ex. 
		int				 x 	= 				10;
		↓				 ↓					↓
    data type 		Name of variable	 constant value	
		or 				or 					  or 
	keywords        Identifiers            literal
	
--------------------------	
 Integeral Literal's 
--------------------------

 -> For integeral data types (byte, short, int long) we can specify leteral value in the following ways.

	1. Decimal Form(base -10): Allowed digits are 0 to 9.
	
		Ex.
			int x =10;		
	
	2. Octal form(base 8) : Allowed digtis are 0 to 7:
	
		Ex.
		 
			int x = 010;
			
	3. Hexadecimal form(base 16): Allowed digits are 0 to 9, a to f :
	
		Ex.
		
			int x = 0X10;
			
		- for extra digits (a to f ) we can use both lower an upper case charcters. This is one of very fiew areas where java is not casesencitive.
		- The literal value should be prefixed 0x or 0X is allowed.
		
		
	- This are only posible ways to specify literal value for integeral data tyeps.

	Q. Which of the following declration are valid ? 

	
		int x =10; //valid 
		int x = 0786// invalid CE: Integer number to large.
		int x = 0777// valid
		int x = 0Xface // valid
		int x = 0XBeef // valid
		int x = 0Xbeer// invalid
		
	
		class Test {
			
				public static void main(String args[]){
					
					int x =	10;													
					int y = 010;														
					int z = 0x10;
					System.out.println(x+"..."+y+"......"+z);
									 //10 	   8          16		
				}
		}
		
	-> By default every integeral literal is of int type but we can specify explicitly as long type by specifixed with small 'l' or capital 'L'	.
	
		Ex. 
		
		int x = 10; // valid 
		long x = 10L; // valid
		int x = 10L ; //invalid CE: PLP found:long required : int 
		long l = 10;//valid 
		
			
	-> 	There is no direct way to specify byte and short literal explicitly but indirectly we can specify. Whenever we are assigning integeral literal to the byte 
		variable and if the value within the range of byte then compiler treats it automatically as byte literal similarly short literal also.
		
		Ex. 
		
		byte b = 10; //valid
		byte b =127; //valid
		byte b =128; // invalid CE: PLP found: int required  byte 
		
		
		short s = 32767;//valid 
		short s = 32768; //invalid CE: PLP found : int required : short
		
----------------------------		
 Floating-points literals 	
----------------------------

 -> By default every floating point leteral is of double type and hance we can't assign directly to the float varaible. 
 
 -> But we can specify floating literal as float type by safixed with small 'f' or capital 'F'.

	Ex.
	
	float f = 123.456;   // invalid CE: PLP found: double required: float 
	float f = 123.456f; // valid 
		
	double d = 123.456; //valid 	
	
 -> We can specify explicitly floating point literal as double type by safixed with small 'd' or capital 'D' ofcourse this convention is not required.

 
		class Test {
			
				public static void main(String args[]){
					
				double d =123.4567D;		
				//float f = 123.4567d; // invalid CE: PLP found : double required: float 
				System.out.println(d);
				}
		}//valid 
		
		
 ->  We can specify floating point leterals only in decimal and we can't specify in Octal and Hexadecimal forms.		
		
		Ex. 
		
		double d = 123.456; //valid 
		double d = 0123.456; // valid 
		double d = 0X123.456; //invalid
				   --	
					|--> //CE: malformed floating point leteral					
		
 -> We can assign integeral literal directly to floating point varaibles and that integeral literal can be specified either in decimal, octal, hexadecimal forms.		

		double d = 0786; //invalid CE: integer number to large 
		double d = 0Xface; //valid 
		double d = 0786.0; //valid 
		double d= 0Xface.0; //invalid
		double d=  10; //valid
		double d =0777; //;valid

 -> we can't assing floating point literals to integeral types.

	double d = 10; //valid
	int x = 10.0; // invalid CE: PLP found: double , required :int 
		
		
 -> We can specify floating literal even in exponancial form (scientific notation).

 
	class Test {														class Test {						
	                                                                    
			public static void main(String args[]){                     		public static void main(String args[]){
	                                                                    
			double d = 1.2e3;	== 1.2x10(3) == 1.2x1000 ==1200.0       		float f = 1.2e3;	//== 1.2x10(3) == 1.2x1000 ==1200.0
			System.out.println(d);                                      		System.out.println(f);
			}                                                           		}
	}//valid	                                                        }//invalid CE : PLP found:double required float

	

	float  f = 1.2e3f //valid 	
	
	
---------------------	
 Boolean Literal's 	
---------------------

 -> The only allowed values for boolean data type are true or false.
 
	boolean b = true ; //valid 
	boolean b = 0; // invalid CE: incompatiable type found : int required boolean 
	boolean b = True ; // invalid CE: Can not find symbol Symbol : variable True , Location: class Test 
	boolean b = "true" ; // invalid CE: incompatiable type : found java..lang.String required : boolean

	int x = 0;																						
	if(x){------------------------>//CE: incompatiable type found : int required boolean 
		SOP("Hello");									↑<---------------------------------while (1){
	}																							SOP("Hello");	
	else {																					|
		
		SOP("hi");
	}
	
	


































 
	















	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		