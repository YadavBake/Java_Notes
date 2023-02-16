
															Language Fundamentals Part-5 || Literals part-2
														======================================================
---------------
 char literal 														
---------------

 -> we can specify char literal as single charcter within single quates.

		Ex. 
		
		char ch  ='a';//valid
 ->		char ch =a ; //invalid CE: cannot find symbol Symbol: variable a Location:class Test 
		char ch = "a";//invalid CE: incompatible type found:java.lang.String required char 
		char ch = 'ab';// invalid CE: unclosed charcter  literal CE": unclosed char literal CE: not a java statement 
		
 -> we can specify char literal as integeral literal which reprasents unicode value of the charcter and a that integeral literal can be specified either in decimal, 
    or octal or Hexadecimal forms but a allowed range is 0 to 65535.

 -> We can reprasent char literal in unicode reprasentation which is nothing but single quate '\uxxxx'
		
		Ex. 																					 ----
																								  |--> u=digit hexadecimal number 	
			char ch = 97;
			SOP(ch);
			
			char ch = 0xFace;//valid
			char ch = 0777;//valid
			char ch = 65535; //valid
			char ch = 65536; // invalid CE: PLP found: int required: char 
			
			class Test {
				public static void main(String args[]){
					
				char ch ='\u0061';
				System.out.println(ch);
				}
			} // a 
	
	-> Every escap is a valid char literal 
	
		EX. 

		char ch = '\n';
		char ch ='\t';
		char ch ='\m';// CE illegal escap charcter
		

 			
	-> 

		Escap charcter 				Description 
		
	1.  \n							New line 
	2.  \t							Horizontal tab 							System.out.println("This is \' symbol");
	3.  \r 							carrieage return                        System.out.println("This is \" symbol");
	4.  \b							back space charcter                     System.out.println("This is \\ symbol");
	5.  \f							form feed 
	6.  \'							single 	quate 
	7.  \"							double quate 
	8.  \\							Back slace			
	
	
 -> Which of the following are valid ?

	char ch = 66536;// invalid 
	char ch = oxbeer;// invalid
	char ch = \uface; // invalid
	char ch = '\ubeef';// valid
	char ch = '\m'; // invalid
	char ch = '\iface'; //invalid
	
-----------------------	
 String literal	
-----------------------

 -> Any sequance of charcter within double quate is treated as string literal.
	
	Ex. 

	String s = "Durga";
	

 -> 1.7v version inhancement with respect to literals.

	1. Binary Literal's 
	--------------------		
		
		-> For integeral data type until 1.6v version we can specified literal value in the following ways.decimal, Octal and Hexadecimal	but from 1.7v version onwords 
		   we can specified literal value even in binary form also.
		   
		-> Allowed digits are 0 and 1/
		
		-> Literal value should be prexed with 0b and 0B.
		
		Ex. 
		
			int x = 0B1111;
			System.out.println(x); // 15 
			
	
	2. Usages of underscro symbol in numeric literals.

		-> From 1.7v version we can use underscore between digits of numeric literal.
		
		Ex. 

		double d = 123456.789; == double d = 1_23_456.7_8_9; == double d = 123_456.7_8_9;
		
		-> The main advantage of this approach is readability of the code will be improved.
		
		-> At the time of compilation this underscore symbols will be removed automatically hance a after compilation the above lines will become double d = 123456.789; .
	
		-> We can use more than one underscore symbol also between the digits.
			
			Ex. 
		
			double d = 1__23_4_5__6.7_8_9;
			double d = 1____23___4_5__6.7_8_9;
		
		-> we can use underscore symbol only between the digits if we are using any where else we will get compile time error.

			Ex. 
			
			double d = _1_23_456.7_8_9; |	
			double d =  1_2_3456_.7_8_9;|==> //invalid 
			double d = 1_23__456.7_8_9_;|
		
	Note: 8 byte long value we can assing to 4 byte float variable because both are following different memory reprasentation internally. 
	
		
		-------------------------------------------------------------------
		| 1byte 	 2byte				  |							      |
		|byte--> short----| 			  |	                              |
		|			  |->|-->int-->long-->|float-->double                 |
		|	char------|		4byte   8byte | 4byte  8byte 	              |
		|    2byte 						  |		                          |
		|								  |                               |
		|	 This is data type is 		  |	This is data type is 	      |
		|	 Integeral data type 		  |	floating-point data type      |
		|								  |                               |
		------------------------------------------------------------------
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	