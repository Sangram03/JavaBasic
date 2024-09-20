# JavaBasic
some java Concepts
<<<<<<< HEAD
public class Basic 
=======
>>>>>>> c94332ccf65c7148771b8882926d9c7effe0d1c3
  /*
   ? =>main() method in java
   ? =>System
   ? is a built in java class that contains useful members.
   ? =>out
   ? Which is short for "OUTPUT"
   ? =>println()
   ? method,short for "print line"
   !=>;
   ? must end of each code
   */
  // !single line comment
  /*  multi
   * line
   * comment
  */
  //=========================================================================++++++++++===================================================
  /*
   ! =>JAVA VARIABLES
   ! => String
   ! stores text ex :- "hello"
   ! =>int
   ! stores integers value without decimal numbers[123 to-123]
   ! =>float
   ! stores floating points numbers with decimal[19.99 to-19.99]
   ! =>char
   ! stores a single character ex:- 'A','B' 
   ! =>boolean
   ! stores values with two states ex:- int myNum=15; System.out.println(myNUm);
   ! {true or false}
   */
  //=========================================================================++++++++++===================================================
  /*
  ? => JAVA IDENTIFIERS
  ? =>All java variables must be identified with unique names.
  ? =>Names can contain letters , digits,underscores and dollar signs
  ? =>Names must begin with a letter
  ? =>names can start with a lowercase letter,and cannot contain whitespace
  ? =>Names can also begin with $ and _(but we will not use it in this tutorial)
  ? =>Names are case-sensitive("myVar"and "myvar"are different variable)
  ? =>Reserve words (likes java keywords,such as int or boolean)cannot be used as names.
   */
  //=========================================================================++++++++++===================================================


  /*
  ? => Classes ;
  ? User-defined data types that encapsulate data and methods.
  ? => Interface :
  ? Define a contract for classes to implement.
  ? =>Arrays :
  ? Collection of elements of the same type.
  ? =>String :
  ? A special non-primitive type representing sequences of characters
  ? internally represent a class
  ? => Variable :
  ? a variable is a container thats holds a value.
  ? => Objects :
  ? a real-life entities
  ! [Creation,State,Behavior,Identity,Reference]
  */
<<<<<<< HEAD
    
=======

>>>>>>> c94332ccf65c7148771b8882926d9c7effe0d1c3
    // ! mainly datatype are two {Primitive, non-Primitive}
//=========================================================================++++++++++===================================================
/*
 * primitive mainly 4type  [integral,Float,Char,Boolean]
 * integral int 4-Types
 * byte []Represent a 8-bit signed integer
 * short[]Represent a 16-bit singed integer.
 * int []Represent a 32-bit signed integer.
 * long []Represent a 64-bit signed integer.
 * Float float(decimal value) 2-types
 * float[]Represent a 32-bit signed integer.
 * double[]Represent a 64bit double-precision floating-point number.
 * Character char [''] Represent a single character
 * Boolean[true/false]
 *DATA TYPE ==================== SIZE ============================== DESCRIPTION ==============================================================================    EXP ================
 *  byte  ====================== 1byte ===========================  Stores wholes numbers from -128 to 127                                               ====
 *  short ====================== 2byte ===========================  Stores whole numbers from -32,768 to 32,767                                          =====
 *  int  ====================== 4byte ===========================  Stores whole numbers from -2,147,487,648 to 2,147,483,647                             ====  int myNUM =5;
 *  long  ===================== 8byte ===========================  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 *  float ===================== 4byte ===========================  Stores whole numbers from  Sufficient for storing 6to7 decimal digits                  ===== float myFloatNum =6.99f;
 *  double ==================== 8byte ===========================  Stores whole numbers from  Stores fractional numbers.Sufficient for storing 15 decimal digits ===
 *  boolean =================== 1byte ===========================  Stores true false values                                                                   === boolean myBool = true;
 *  char ====================   2byte ===========================  Stores a single character/letter or ASCII values
 * 
 * 
 */
//=========================================================================++++++++++===================================================
/*
 * Non-primitive Data Types  :-
 * Non-primitive data types are called reference types because they refer to objects.
 * Differences
 * Primitive types are predefined(already defined)in java .
 * Non-primitive types are created by the programmer and is not defined by java(except for String).
 * Non-primitive types can be used to call methods to perform certain operations.while primitive types cannot.
 * A primitive types always has a value,while non-primitive types can be null.
 * A primitive type starts with a lowercase letter,while non-primitive types starts with an uppercase letter.
 * Exp:- String,Arrays,Classes,Interface,etc.
 */
//=========================================================================++++++++++===================================================
 /*
  * Some important methods in the Object class
  ! =>equals(): Compares two objects for equality.
  ! =>hashCode(): Return a hash code value for the object.
  ! =>toString(): Return a string representation of the object.
  ! =>getClass(): Return the runtime class of the object.
  ! =>finalize(): Called by the garbage collector before an object is reclaimed.
  */
//=========================================================================++++++++++===================================================
/*
 * =>Java Type Casting :-
 ! =>Type casting is when you assign a value of one primitive data type to another data type.
 ! =>in java type casting are mainly two types:
 ! =>Widening Casting(automatically)-converting a smaller type to a large type of size.
 ! Widening casting is done automatically when passing a smaller size to a large size type.
 ! =>byte -> short -> char -> int -> long ->float ->double
 ! =>Narrowing Casting (manually)- converting a larger type to a smaller size type.
 ! Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
 ! =>double -> float -> long ->int ->char ->short ->byte
 */
//=========================================================================++++++++++===================================================
/*
 * => JAVA OPERATORS :
 ? => Operators are used to perform operations on variables and values.
 ? =>in the example below , we can use the + operator to add together two values
 ? =>java divides the operators into the following groups :
 ? => Arithmetic operators
 ? => Assignment operators
 ? => Comparison operators
 ? => Logical operators
 ? => Bitwise operators
  !                                    -:    Arithmetic operators :-
 * OPERATOR ======= NAME ==================== DESCRIPTIONS ============================== EXAMPLE ====== 
 * =>  +    ======= Addition ========= Add together two values =========================== X+Y =========
* =>  -    ======= Subtraction ====== Subtracts one value from another values ========== X-Y =========
* =>  *    ======= Multiplication === Multiplies two values ============================ X*Y =========
* =>  /    ======= Division ========= Divides one value by another ===================== X/Y =========
* =>  %    ======= Modulus ========= Returns the division remainder ==================== X%Y =========
* =>  ++    ======= Increment ========= Increase the value of a variable by 1 ========== ++X =========
* =>  --    ======= Decrement ========= Decrease the value of a variable by 1 ========== --X =========
 !                                    -:     Assignment operators :-
* => the Addition assignment operator (+=) add a value to a variable
* =>A list of all assignment operators
!                                     -:    Assignment operators  :-
! => Operators ===================== Example ==================================== Same As ======================================Try it
? => =    ========================== x=5 ======================================== x=5   =========================================
? => +=   ========================== x+=3 ======================================= x=x+3 =========================================
? => -=   ========================== x-=3 ======================================= x=x-3 =========================================
? => *=   ========================== x*=3 ======================================= x=x*3 =========================================
? => /=   ========================== x/=3 ======================================= x=x/3 =========================================
? => %=   ========================== x%=3 ======================================= x=x%3 =========================================
? => &=   ========================== x&=3 ======================================= x=x&3 =========================================
? => |=   ========================== x|=3 ======================================= x=x|3 =========================================
? => ^=   ========================== x^=3 ======================================= x=x^3 =========================================
? => >>=  ========================== x>>=3 ====================================== x=x>>3 ========================================
? => <<=  ========================== x<<=3 ====================================== x=x<<3 ========================================
!                                      -:   Comparison operators   :-
? =>Comparison operators are used to compare two values (or variables).
? =>This is important in programming ,because it helps us to find answers and make decisions.
? =>The return value
* =>
* =>
 */

  //=========================================================================++++++++++===================================================



<<<<<<< HEAD


=======
>>>>>>> c94332ccf65c7148771b8882926d9c7effe0d1c3
