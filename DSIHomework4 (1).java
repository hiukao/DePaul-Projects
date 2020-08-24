package homework;

import java.util.Arrays;  // for testing purposes. Don't use in your solutions
import stdlib.*;

/**
DSIHomework4  version 1.1
 * 
 *   Your Name goes here
 *  
 *  Delete one of the following:
 *  A) The work submitted here is solely mine. 
 *  
 *  B) I had *some* help on the following parts (list them!) of this assignment
 *   
 *   
 * This is a skeleton file for your homework. Edit the sections marked TODO. You
 * may add new functions. You may also edit the function "main" to test your
 * code.
 *
 * You must not add static variables. You MAY add static functions.
 *
 * It is okay to add functions, such as
 *
 * <pre>
 *     public static double sumOfOddsHelper (double[] list, int i) {
 * </pre>
 *
 * but it is NOT okay to add static variables, such as
 *
 * <pre>
 * public static int x;
 * </pre>
 *
 * As in homework 1,2,3 you must not change the declaration of any method.
 * 
 * You can edit the main function all you want. I will not run your main
 * function when grading. For example, you can "comment out" sections of main
 *  when testing your functions
 *  
 *  This program does contain *some* testing code - however it is not guaranteed to be exhaustive
 *  and you will need to manually examine the output to see if the tests succeed or not
 */
public class DSIHomework4 {

	/**
	 * As a model for Problem 1, here are two functions to find the minimum value of an array of ints
	 * an iterative version and a recursive version
	 *
	 * precondition:   list is not empty
	/** iterative version */
	public static double minValueIterative (int[] list) {
		int result = list[0];  // list is not empty, so this exists!
		int i = 1;
		while (i < list.length) {
			if (list[i] < result) result = list[i];
			i = i + 1;
		}
		return result;
	}

	/** recursive version 
	 * Find minimum of a list of size N starting at location 0
	 * Smaller problem is :  Find minimum of list of size N-1, starting at 0
	 * 
	 * precondition:   list is not empty
	 */
	public static int minValueRecursive (int[] list) {
		return minValueHelper (list, list.length);    // 2nd parameter allows for smaller problem 
	}
	private static int minValueHelper (int[] list, int n) {
		if (n == 1)           // the list of size 1 is the single element list[0]
			return list[0];   //  the minimum of this list is just that element.

		//  else:  find minimum of smaller list

		int minOfSmallerList = minValueHelper( list, n-1);  // recursive call, 'smaller' list

		//  now compare min of smaller list to 'last' element of this list
		//  the list is of size n, the 'last' element is at position n-1
		//    because indexes start at 0.
		int theMin;

		if ( list[n-1] < minOfSmallerList)
			theMin = list[n-1];
		else
			theMin = minOfSmallerList;

		return theMin;
	}

	/**
	 * PROBLEM 1: Find the sum of the positive values in an array
	 *
	 * You should write a helper method. You may not use any "fields" to solve
	 * this problem (a field is a variable that is declared "outside" of the
	 * function declaration --- either before or after).
	 * You may not use other Java classes/algorithms, e.g. Arrays.sort
	 * 
	 * Precondition:  a list of ints, - maybe empty!
	 * Postcondition: the sum of the odd values is returned
	 */
	public static int sumOfPositives (int[] a) {
		int result = 0;
		int i = 0;
		while (i < a.length) {
			if ( a[i] > 0)
				result = result + a[i];
			i = i + 1;
		}
		return result;
	}

	public static int sumOfPositivesRecursive (int[] a) {


		return -1; // TODO 1  replace this by a call to your helper function, then write the helper function below

	}
	
	// this would be a good place to put the helper function for #1

	/**
	 * Here is an in-place iterative function to reverse an array.
	 * 
	 * in-place means:  we don't create an extra array to make our coding easier
	 *
	 */
	public static void reverseIterative (char[] a) {
		int hi = a.length - 1;
		int lo = 0;
		char loVal, hiVal;
		while (lo < hi) {
			loVal = a[lo];
			hiVal = a[hi];
			a[hi] = loVal;
			a[lo] = hiVal;
			lo = lo + 1;    //Hint:  These two lines 
			hi = hi - 1;    //       create a smaller problem 
		}
	}
	/*
	 * * PROBLEM 2: Develop a recursive function to solve the problem: reverse an array
	 * 
	 * You should write a helper method. You may not use any "fields" to solve
	 * this problem (a field is a variable that is declared "outside" of the
	 * function declaration --- either before or after).
	 * The reversing should be done 'in-place' ; do not create an entire new array
	 * You may not use any other methods
	 * 
	 * Your helper function must be parameterized to allow a smaller problem to
	 * be specified.  How do you reverse an array of size N?
	 * (the answer is likely NOT: reverse an array of size N-1 ! Study the iterative
	 * version above.
	 */
	public static void reverseArray (char[] a) {
	
		return;  // TODO 2   replace this by a call to your recursive helper function, then write the helper function below

	}
	
	// a good place for your helper function for #2
	/**
	 * PROBLEM 3: merge together two sorted arrays of char into a new sorted array.
	 * 
	 * The examples below 
	 * Example1  merge: [a c e g ] with [ b d f h] would yield [a b c d e f g h] 
	 * Example2  merge: [a f  ] with [ b c  h i] would yield [a b c f h i] 
	 * There is no guarantee about the size of either array. When/if you run out of elements in 
	 * either array, copy all the remaining elements from the nonempty array to the the new array 
	 * preconditions:
	 *          both arrays are sorted low to high
	 *          there are no duplicate values among the two arrays
	 *          either array may be empty
	 * postcondition: an array with all elements from both arrays sorted from low to high
	 * 
	 * You may not use any additional methods, sorting routines etc
	 * For full credit, your solution may only go through each array one time ( so in particular - no nested loops)
	 * 
	 * You will need to create a new array inside the function
	 * You do not have to write this recursively, but could be an interesting exercise.
	 */

	public static char[] mergeArrays( char[] A, char[] B) {

		char[] answer = new char[ 0];  // an empty array to have something to return

			return  answer; // ToDo  3 .   Fix this function

		}

		/*
		 * testing functions and main.
		 * There are no Todo's for you in the code below.
		 */


		public static void main (String[] args) {

			StdOut.println(" This program calls your functions for a number of test cases");
			StdOut.println(" It does not check your results for correctness");
			StdOut.println(" You should examine the ouput to determine if your code is correct\n\n");


			sumOfPositiveTests();
			reverseArrayTests();
			mergeArrayTests();


			StdOut.println("\n This program calls your functions for a number of test cases");
			StdOut.println(" It does not check your results for correctness");
			StdOut.println(" You should examine the ouput to determine if your code is correct\n\n");
		}
		public static void sumOfPositiveTests() {
			int[] list0 = new int[] {};
			int[] list1 = new int[] { 5 };
			int[] list2 = new int[] { 3, -4 };
			int[] list3 = new int[] { 2, -3, 4 };
			int[] list4 = new int[] { -1, -2, -4, 5 };
			int[] list5 = new int[] { 6, -1, 2, -3, -8 };

			StdOut.format(" list: %s  sum of positives: %d\n",Arrays.toString(list0), sumOfPositivesRecursive (list0));
			StdOut.format(" list: %s  sum of positives: %d\n",Arrays.toString(list1), sumOfPositivesRecursive (list1));
			StdOut.format(" list: %s  sum of positives: %d\n",Arrays.toString(list2), sumOfPositivesRecursive (list2));
			StdOut.format(" list: %s  sum of positives: %d\n",Arrays.toString(list3), sumOfPositivesRecursive (list3));
			StdOut.format(" list: %s  sum of positives: %d\n",Arrays.toString(list4), sumOfPositivesRecursive (list4));
			StdOut.format(" list: %s  sum of positives: %d\n",Arrays.toString(list5), sumOfPositivesRecursive (list5));
			StdOut.println( "end of sum of positives tests\n");

		}

		public static void reverseArrayTests() {
			char[] list0 = new char[] {};
			char[] list1 = new char[] { 'M' };
			char[] list2 = new char[] { 'M','U','G' }; 
			char[] list3 = new char[] { 'D','A','T','A' }; 
			char[] list4 = new char[] { 't','o','d','a','y' }; 
			char[] list5 = new char[] { '1','2','3','4','5','6','7','8'};
		

			StdOut.println ("Reverse: Before: " + Arrays.toString(list1 )  );
			reverseArray (list1);
			StdOut.println ("         After:  " + Arrays.toString (list1) + "\n" );

			StdOut.println ("Reverse: Before: " + Arrays.toString(list2 )  );
			reverseArray (list2);
			StdOut.println ("         After:  " + Arrays.toString (list2) + "\n");

			StdOut.println ("Reverse: Before: " + Arrays.toString(list3 )  );
			reverseArray (list3);
			StdOut.println ("         After:  " + Arrays.toString (list3) + "\n");

			StdOut.println ("Reverse: Before: " + Arrays.toString(list4 ) );
			reverseArray (list4);
			StdOut.println ("         After:  " + Arrays.toString (list4) + "\n");

			StdOut.println ("Reverse: Before: " + Arrays.toString(list5 ) );
			reverseArray (list5);
			StdOut.println ("         After:  " + Arrays.toString (list5) + "\n");
			StdOut.println( "end of reverse array tests\n");
		}
		public static void mergeArrayTests() {

			char one[] = new char[] {'a','c','e','g','i','k'};
			char two[] = new char[] {'b','d','f'};
			char[] combinedArray = mergeArrays( one,two);
			StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
			StdOut.println("  --> " + Arrays.toString(combinedArray));

			one = new char[] {'a','d','e','g','i','k'};
			two = new char[] {'b','c'};
			combinedArray = mergeArrays( one, two);
			StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
			StdOut.println("  --> " + Arrays.toString(combinedArray));

			one = new char[] {'a','c','e','g','i','k'};
			two = new char[] {};
			combinedArray = mergeArrays( one,two);
			StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
			StdOut.println("  --> " + Arrays.toString(combinedArray));

			one = new char[] {'b','f'};
			two = new char[] {'a','c','d','h'};
			combinedArray = mergeArrays( one,two);
			StdOut.println("merging: "+ Arrays.toString(one) + " " + Arrays.toString(two));
			StdOut.println("  --> " + Arrays.toString(combinedArray));

			StdOut.println( "end of merge array tests\n");
		}
	}
