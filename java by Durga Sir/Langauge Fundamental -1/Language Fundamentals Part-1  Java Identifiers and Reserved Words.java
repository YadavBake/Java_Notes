
											Language Fundamentals Part-1 || Java Identifiers and Reserved Words
										=========================================================================

========================
 Language Fundamentals
========================

1. Indentifiers 
2. Reserved words 
3. Data Types.
4. Literals.
5. Arrays.
6. Types of variables.
7. var-arg methods.
8. main method.
9. command line arguments.
10. java conding statndars.


===========================================================================================================================================================================

														1. Identifiers
													=====================

-> A name in java program is called identifier, Which can be used for identification purpose it can be method name, or variable name or 
   class name or lable name.

	
			↓-----> 1 
	class Test
		{						↓--2       ↓--4 
			public static void main(String args[]){
									  ↑--3	
				int x =10;
				    ↓--5
				
			}

		} // In this program there are 5 identifiers.

========================================
  Rule's for defining java identifier 
========================================

 1. The only allowed charcters in java identifiers are ' a to z , A to Z , 0 to 9, $, _' if we are using any other charcter we will get 
    compile time error.
 
  Ex. 
	
	total_number // valid 
    
	total#    // invalid

 2. Identifiers can't starts with digits.
 
	Ex. 
	
	 total123 // valid
	 
	 123total // invalid

 3. Java identifiers are case sensitive of_course java langauge it's self treated as case sensitive programing langauge.
 
	EX. 
	
	class Test {
		
		int number =10; |
		int Number =20; |===> We can differentiate with respect to case 
		int NUMBER =30; |

	}

 4. There is not lenght limit for java identifiers but a it is not recomanded to take to lengthy identifiers.

	Ex. 

	class Test {
		
		public static void main(String args[]){
			
			int xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = 10 ;
			
			System.out.println(xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
		}
	}

	
 5. We can't use reserved word as identifiers
 
 
  Ex. 
  
	int x =10 ; // valid

    int if = 20; // invalid because if is a reserved in java 


 6. All pre-difine java class names and interface names we can use as identifiers.
 
 
 
  Ex. 															Ex.
  
   class Test {													class Test {
	                                                        	   
	   public static void main (String args[]){             	   public static void main (String args[]){
		                                                    		   
		   int String = 888;                                		   int Runnable = 888;
		                                                    		   
		   System.out.println(String);                      		   System.out.println(Runnable);
                                                            
	   }                                                    	   }
   }                                                           }

  -> Even though it is valid but it is not a good programming practice because it reduaces readbility and creates confusion.
  
  
 -> Which of following are valid java identifiers ?
 
 
  1. total_number  // valid
  2. total# 		// invalid
  3. 123total 		// invalid
  4. total123 		// valid
  5. ca$h 			// valid
  6. _$_$_$_$_     // valid
  7. all@hands    // invalid
  8. Java2Share  // valid
  9. Integer  	// valid 
  10. Int 		// valid
  11. int 		// invalid


=======================
 2. Reserved Words 
=======================


 -> In java some words are reserved to reprasent some meaning or functionality such type of words are called reserved words.

				
															Reserved words(53)
															       |
																   |
					-----------------------------------------------------------------------------------------------------------------											   
					|																												|
			keywords(50)																						            Reserved Literals(3)
                |																													|								
	-------------------------																										|--true
    |						|																									    |--false
 used keyword(48) 	 Unused keyword(2)																								|--null
	|--if					|--goto	
	|--else					|--const
    |--...	



============================
 1. Key-word for Data types
============================ 
 
 -> byte, short, int,long,float,double,boolean,char (8)
 
==================================== 
 2. key-words for Flow-controll 
====================================
   
 -> if,else, switch, case, default,while,do,for,break,continue,return. (11)
 
============================== 
 3. key-words for modifiers 
==============================

 -> public,private, protected,static, final,abstract,synchronized,native,strictfp(1.2v),transient, volatile (11) with default (12).
 
=======================================
 4. key-words for Exception Handling   
=======================================

 -> try, catch, finally, throws,throws,assert(1.4v) (6)
 
=============================== 
 5. class related key-words
===============================

 -> class, interface, extends implements, package, import. (6)

================================= 
 6. Object related key-words  
=================================

 -> new, instanceof,super,this (4)

====================================
 7. void return type key-word  (1)
====================================

 -> void 	

 -> In java return type mandatory if a method won't return anything then we have to declare that with void return type.
 
 -> But in C language return type is optional and default return type is int.
 
========================= 
 8. Unused key-words (2)
=========================
 
 1. goto => Uses of goto creates a several problems in old langauges and hance a sun people banned this key-word in java 

 2. const => Use final instaited of const.
	
 
 
 Note: goto and const are unused key-words and if we are trying to use we will get compile time error.

========================= 
 9. Reserved literles(3) 
=========================
 
 true and false => use for boolean values for data type.
 
 null => default value for object reference.
 
====================
 10. enum key-word 
====================

 -> enum (1.5v)
 
 -> We can use enum to define a group of named constant. 

	Ex. 
	
	enum month {
		
		JAN, FAB, ....DEC 
		
	}	


 conclusion
 
  1. All 53 reserved word in java contains only lower case alphabet symbols 
  
  2. In java we have only new key-word and there is no delete key-word because destraction of use-less objects is the responsibility of 
     GC(garbage collector).
  
  3. The following are new key-words in java 
  
		1. strictfp 1.2v
		2. assert 	1.4v
		3. enum 	1.5v
		
		
  4. 
  
  
	strictfp but not strictFp
	instanceof but not instanceOf
	synchronized but not synchronize
	extends but not extend
	implements but not implement
	import but not imports
	const but not constant


 => Which of the following list contains only java reserved words.
 
  new, delete
  goto, constant
  break,continue,return, exit
  final,finally,finalize
  throw, throws,thrown
  notify,notifyAll
  implements,extends,imports
  sizeof,instanceof
  byte,short, Int
  None of the above.,

 => Which following are java reserved words
 
  public
  static 
  void 
  main
  String 
  args
  












	

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 












