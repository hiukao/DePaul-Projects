package homework;

import stdlib.*;
import java.util.Arrays;  // for testing purposes.  You may NOT use  


/**
 * ds1Hw2  version 1.0
 * 
 *   Your Name goes here
 *  
 *  Delete one of the following:
 *  A) The work submitted here is solely mine. 
 *  
 *  B) I had *some* help on the following parts of this assignment
 *  
 * 
 * This is a skeleton file for your programming assignment. Edit the sections marked TODO. 
 *
 * Unless specified otherwise, you must not change the declaration of any method. 
 * This will be true of every skeleton file I give you.
 *
 * For example, you will get zero points if you change the line
 * <pre>
 *     public static int minCount (double[] list)
 * </pre>
 * to something like
 * <pre>
 *     public static void minCount (double[] list)
 * </pre>
 * or
 * <pre>
 *     public static double minCount (double[] list, int i) {
 * </pre>
 * 
 * Each of the functions below is meant to be SELF CONTAINED. This means that
 * you should use no other functions or classes.  You may not create static class variables
 * You should not use any HashSets or ArrayLists, or anything else unless specifically indicated! 
 * 
 */
public class ds1Hw2 {

		static boolean showMeSuccess = false;  // change to true to see all testing output
		
	/**
	 * minCount returns the number of values in the array that are equal to the minimum  
	 * Precondition: the array is nonempty.  
	 * 
	 * Here are some examples (using "<--" informally):
	 *
	 * <pre>
	 *    1 <-- minCount (new double[] { -7 })
	 *    2 <-- minCount (new double[] { 1, 7, 1, 11 })
	 *    1 <-- minCount (new double[] { 5, 4, 3, 2, 1 })
	 *    3 <-- minCount (new double[] { 4, 5, 4, 6, 4, 10 })
	 *    5 <-- minCount (new double[] { 4, 4, 4, 4, 4 })
	 * 
	 * The code below is a stub version, you should replace the line of code
	 * labeled TODO  with code that achieves the above specification
	 * </pre>
	 */
	public static int minCount (double[] list) { 
		return -1; //TODO 1:  fix this

	}

	/**
	 * posOfSmallestElementGtOeT returns the position of the smallest element in the array that 
	 * is greater than or equal to the limit parameter
	 * if all values are smaller than limit, return -1;
	 * 
	 * Precondition:  the array is nonempty and all elements are unique.
NOTE!   For full credit, your solution may go through the array exactly once.  (30% deduction)
	 *
	 * <pre>
	 *   0 <-- posOfSmallestElementGtOeT(3, new double[] { 7 })                      // value: 7 is in pos 0
	 *   5 <-- posOfSmallestElementGtOeT(3, new double[] { 11, -4, -7, 4, 8, 1 }),   // value: 4 is in pos 3
	 *  -1 <-- posOfSmallestElementGtOeT(17, new double[] { 1, -4, -5, 7, 8, 11 }),  // all elements are < 17
	 * 
	 * The code below is a stub version, you should replace the line of code
	 * labeled TODO  with code that achieves the above specification
	 * </pre>
	 */
	public static int posOfSmallestElementGtOeT( double limit, double[] list) {
		return -2; //TODO 2: fix this

	}

	/**
	 * stringReformat takes a person's name in the format  <Last, First{ Initial.}>  and
	 * reformats it to the form  <First {Initial }Last> 
	 * {} means may or may not be present
	 *
	 * Preconditions:  
	 *       the string is not empty
	 *       there is exactly one ','  (comma) and it comes at the end of the Last name
	 *       there is 1 space after the comma
	 *       there may or may not be a middle initial after the first name
	 *       If there is a middle initial, it will be separated from the first name by a single space
	 *       The middle initial may be followed by a '.' and 0 or more spaces.
	 * 
	 * Here are some examples ("<--" indicates the returned value
	 *
	 * <pre>
	 *   "Alex P Keaton"  <--  stringReformat("Keaton, Alex P.");
	 *   "Lois Steem"     <--  stringReformat("Steem, Lois");        // no middle initial
	 *   "Luke A Boyd"    <--  stringReformat("Boyd, Luke A");       // no '.'
	 *   "Lotta B Essen"  <--  stringReformat("Essen, Lotta B.  ");  // extra spaces at end
	 *   
	 *   You may only use the  length,  substring  and charAt methods of the string class.
	 *   You may not use any other Java classes or functions without permission
	 *         Some sample code to help you think about the problem is given below for your reference; 
	 *         you should delete this from the solution you submit for credit.
	 *   You may write additional functions to help solve this problem if you want.
	 *   
	 *   Hints:  
	 *         Find the location of the  ',' and ' ' (spaces)  using charAt
	 *         Build the new string by extracting the corresponding substrings and concatenating them together
	 * </pre>
	 */
	public static String stringReformat( String name) {
		String theAnswer = "this is not the answer";
		//  example code starts here:  delete or comment out when you have completed the function
		String  subExample = name.substring(1,5);  // some example code
		char  theChar = name.charAt(4);
		StdOut.println(" stringReformat demo1.  the substring(1,5) is: " + subExample);
		if ( theChar == ',' )
			StdOut.println(" stringReformat demo2.  the character in position 4 is a comma");
		else
			StdOut.println(" stringReformat demo2.  the character in position 4 is NOT a comma, it is: "+ theChar);
		//  end of example code
		String x = theAnswer + " " + subExample;


		return theAnswer;   // TODO 3:  fix this.

	}
	/**
	 * primesInRange determines  how many prime numbers occur with a range of values
	 * 
	 * A prime number is a number divisible only by itself and 1
	 * * 
	 * Here are some examples ("<--" indicates the returned value
	 *
	 *  4 <-- primesInRange(10,20);    // 11, 13, 17, 19
	 *  1 <-- primesInRange(20,28);    // 23
	 *  0 <-- primesInRange(122,126);  // no primes in this range
	 *  1 <-- primesInRange(23,23);    
	 * 
	 * Precondition:  0 < low <= high
	 *
	 * The code below is a stub version, you should replace the line of code
	 * labeled TODO  with code that achieves the above specification
	 * 
	 * Suggestion:  write a helper function  isPrime  to determine if a number is prime
	 */
	
	public static int primesInRange( int low, int high) {
		
		return -1; //TODO 4: fix this
	}
	/*
	 * A test program, using private helper functions.  See below.
	 */
	public static void main (String[] args) {
		// do all the tests
		minCountTests();
		posOfSmallestElementGtOeTTests();
		stringReformatTests();
		primesInRangeTests();

		StdOut.println ("Finished tests");
	}

	/* Test functions --- lot's of similar code!    Do not change any of the code below*/


	private static void minCountTests() {
		// for minCount: array must be nonempty
		testMinCount (1, new double[] {11} );
		testMinCount (5, new double[] { 11,11,11,11,11} );
		testMinCount (1, new double[] {11, 1} );
		testMinCount (1, new double[] {1,11} );
		testMinCount (1, new double[] {11, 21, 9, 31, 41});
		testMinCount (1, new double[] {41, 21, 9, 31, 11});
		testMinCount (1, new double[] {11, 41, 9, 31, 21});
		testMinCount (1, new double[] {-41, -21, -11, -31, -9});
		testMinCount (1, new double[] {-9, -21, -11, -31, -41});
		testMinCount (1, new double[] {-41, -11, -9, -31, -21});
		testMinCount (1, new double[] {-11, -21, -41, -31, -9});		
		testMinCount (3, new double[] { 0.2, -0.5, -0.1, -0.5, -0.5});
		StdOut.println(" finished minCount tests");
	}
	static int minCountTest = 1;
	private static void testMinCount (int expected, double[] list) {
		int actual = minCount (list);  // calls your function

		if (expected != actual) {   // compares your result with the expected result
			StdOut.format ("Failed minCount(%s): Expecting (%3d) Actual (%3d)\n", Arrays.toString(list), expected, actual);
		}
		else if (showMeSuccess) {
			StdOut.format ("Correct MinCount: test#  %2d \n", minCountTest++);
		}
		
	}
	private static void posOfSmallestElementGtOeTTests() {
		//  array must be nonempty with unique elements
		//   arg0: answer, arg1: limit, arg2: the array
		testPosOfSmallestElementGtOeT (0, 0, new double[] {0});
		testPosOfSmallestElementGtOeT (3, -5, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (3, -5.5, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (0, 0, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (5, -10, new double[] {1,2,3,-5,-6,-8, 6, 7});
		testPosOfSmallestElementGtOeT (-1, 10, new double[] {1,2,3,-5,-6,-8, 6, 7});

		StdOut.println(" finished smallest Element tests");
	}
	static int testnum =1;
	private static void testPosOfSmallestElementGtOeT(int expected, double limit, double[] list) {

		int actual = posOfSmallestElementGtOeT (limit,list); // calls your function

		if (expected != actual) { // compares your result with the expected result
			StdOut.format ("Failed posOfSmallestElementGtOeT(%5.2f , %s): Expecting (%d) Actual (%d)\n", limit, Arrays.toString(list), expected, actual);
		}
		else if (showMeSuccess) {
			StdOut.format ("Correct PosOfSmallestElementGtOeT: test#  %2d \n", testnum++);
		}
		
	}	
	private static void stringReformatTests() {
		testStringReformat("Keaton, Alex P.", "Alex P Keaton");
		testStringReformat("Steem, Lois", "Lois Steem");
		testStringReformat("Boyd, Luke A.   ", "Luke A Boyd");
		testStringReformat("Essen, Lotta B.", "Lotta B Essen");
		testStringReformat("Rittenoff, Candace B.", "Candace B Rittenoff");
		testStringReformat("Early, Stu", "Stu Early");
		testStringReformat( "Keaton, Alex P.", "Alex P Keaton");
		testStringReformat("Bruptly, Vera A. ", "Vera A Bruptly");
		testStringReformat("Datso, Wanda Y.", "Wanda Y Datso");
		testStringReformat("Silver, I O.", "I O Silver");
		StdOut.println( " finished stringReformat tests");	
	}
	static int stringTestNum = 1;
	private static void testStringReformat (String stringToTest, String expected) {

		String actual = stringReformat( stringToTest);    // calls your function

		if ( ! actual.equals(expected))        // compares your result with the expected result
			StdOut.format ("Failed  testStringReformat:  Expected: (%s)  Actual (%s) \n", expected, actual);
		else if (showMeSuccess) {
			StdOut.format ("Correct StringReformat: test# %2d %s \n", stringTestNum++,stringToTest);
		}
	}
	private static void primesInRangeTests() {
		//  precondition:  2 <= low <= high
		//   arg0: answer, arg1: low, arg2: high
		testPrimesInRange( 1,2,2);
		testPrimesInRange( 1,3,3);
		testPrimesInRange( 2,3,5);
		testPrimesInRange( 2,25,31);
		testPrimesInRange(143,100,1000);
		testPrimesInRange(1061,1000,10000);
		StdOut.println(" finished PrimesInRange tests");
	}
	static int primeTestNum = 1;
	private static void testPrimesInRange (int expected, int low, int high) {
		if ( low > high ) throw new IllegalArgumentException(" testCaseError in testPrimesInRange");
		int actual = primesInRange(low, high);    // calls your function

		if ( actual != expected)        // compares your result with the expected result
			StdOut.format ("Failed  primesInRange:  Expected: (%d)  Actual (%d) \n", expected, actual);
		else if (showMeSuccess) {
			StdOut.format ("Correct primesInRange: test# %2d [%d,%d] \n", primeTestNum++, low, high);
		}
	}

}