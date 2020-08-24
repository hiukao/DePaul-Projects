package homework;           // -1 point if you change the package name
import java.text.DecimalFormat;
import java.util.NoSuchElementException;


import stdlib.*;
public class DSIHomework6 {  //-1 point if you change the class name

	/** this class maintains a linked structure via the instance variable first
	 *  
	 *  in the examples in this file and testing output, a list is denoted using {  } 
	 *  
	 *  example  { 1 2 3 4 }  represents a linked list with first node value 1;
	 *    subsequent nodes have values 2,3,4    
	 *    4 is the value in the last node
	 */

	/** 
	 * DSIHomework6  version 1.0
	 *  
	 *   Delete one of the following:
	 *   
	 *  A) The work submitted here is solely mine. 
	 *  
	 *  B) I had *some* help on the following parts of this assignment
	 *   
	 *  Complete the methods below.
	 *  None of your methods should modify the list, unless that is the purpose of the method.
	 *  All your methods should on operate on the instance variable first
	 *     The toString method is provided for debugging and testing; you may not use it in your solutions
	 * 
	 *  You may not use arrays or any other java collection class 
	 *  You may not add any fields to the node or list classes.
	 *  You may not add any methods to the node class.
	 * 
	 *  You MAY add private methods to the DSIHomework6 class (helper functions for the recursion). 
	 */
	static boolean showMeSuccess = true;   //  set to true to also see Success notifications for tests
	//  set to false to only see Failure notifications for tests

	static class Node {
		public Node (int item, Node next) { this.item = item; this.next = next; }
		public int item;
		public Node next;
	}

	Node first;     // reference to the whole list


	/** here is an example function w/ helper function to compute the size of linked list
	 */ 
	public int size () {
		return sizeHelper( first);
	}

	private int sizeHelper( Node x) {  // x represents the first node of the 'current' list
		//base case:  empty list, size is 0
		if ( x == null) return 0;

		// general case.  smaller problem is list that comes after x
		// below:  1 counts the node that x refers to
		// recursive call finds size of smaller list

		return 1 + sizeHelper( x.next);

	}
	/**  findMax
	 * 
	 *  precondition: list has at least value
	 * 
	 *  a function to compute the max of the list using recursion
	 *  Note max of a list of size 1 is the sole value in the list
	 *  You will want to create a helper function to do the recursion
	 *  
	 */

	public int findMax () {
		// next line is just a demo of checking the precondition, will not be tested 
		if ( first == null ) throw new NoSuchElementException(" User Error: FindMax invoked on empty list ");

		return StdRandom.uniform(1000); //TODO 1: fix this

	}
	// place helper function for findMax here


	/** insertValueBeforeEveryX
	 * 
	 *  Preconditions:  list may be empty,   X and Value are not equal
	 *  
	 *  insert a new node containing  Value  before every node containing X
	 *  
	 *  you can write this iteratively or recursively,  but you should only have one loop or recursive helper
	 *  you may not call any other method (e.g.  size  )

	 *  
	 *   { }.insertValueBeforeEveryX(9,2)           -->  { }                // initial list was empty
	 *   { 1 1 1 1 }.insertValueBeforeEveryX(9,2)   -->  { 1 1 1 1  }       // 0 occurrences of '2'
	 *   { 2 }.insertValueBeforeEveryX(9,2)         -->  { 9 2}             // 1 occurrence of '2'
	 *   { 1 2 3 2 }.insertValueBeforeEveryX(9,2)   -->  { 1 9 2 3 9 2}     // 2 occurrences of '2'
	 *   
	 */
	public void insertValueBeforeEveryX (int value, int X ) {

		// next line is just a demo of checking the precondition, will not be tested 
		if ( X == value ) throw new IllegalArgumentException(" User Error: illegal argument ");

		return;  //TODO 2: fix this
	}


	/**   positionOfSecondToLastOccurrence
	 * 
	 *  Precondition:  none   // list may be empty
	 * 
	 *  a function to compute: the position within the list of the second to last occurrence 
	 *  of the parameter: number 
	 *  
	 *  positions are counted as an offset from the beginning. 
	 *  
	 *  if the list is { 1,2,3,4,3 }, the second to last 3 is in position 2
	 *  if number appears 0 or 1 time, return -1
	 *  
	 *  you can write this iteratively or recursively,  but you should only have one loop or recursive helper
	 *  Examples
	 *  {0,1,2,5,5,5,5,5,8,9}.positionOfSeondToLastOccurrence(5) == 6
	 *  {0,1,3,4,5,5,2,5,8,9}.positionOfSeondToLastOccurrence(2) == -1   
	 *  
	 */

	public int positionOfSecondToLastOccurrence (int number) {

		return -2; //TODO 3: fix this
	}

	/** deleteTheFirstConsecutiveDuplicateItem
	 * 
	 *  Precondition:  None.   List may be empty or have only one value
	 * 
	 *  a function to delete the second of two consecutive nodes containing the same value
	 *  only delete the duplicate for the first such occurrence
	 *  
	 *  Examples:
	 *  {1 2 3 4 5 6}.deleteTheFirstConsecutiveDuplicateItem()   -->  {1 2 3 4 5 6}   // no consecutive duplicates
	 *  {1 2 1 2 1 2}.deleteTheFirstConsecutiveDuplicateItem()   -->  {1 2 1 2 1 2}   // no consecutive duplicates
	 *  {5 5 2 3 4 5}.deleteTheFirstConsecutiveDuplicateItem()   -->  {5 2 3 4 5}     // delete the 5
	 *  {5 1 1 2 3 1}.deleteTheFirstConsecutiveDuplicateItem()   -->  {5 1 2 3 1}     // delete the 1
	 *  {5 5 1 1 3 4}.deleteTheFirstConsecutiveDuplicateItem()   -->  {5 1 1 3 4 }    // delete the 5
	 *  {5 4 3 2 1 1}.deleteTheFirstConsecutiveDuplicateItem()   -->  {5 4 3 2 1 }    // delete the 1
	 *
	 */

	public void deleteTheFirstConsecutiveDuplicateItem() {

		// TODO 4: fix this
	}

	/**  
	 *   the following is an example method included as a reference
	 *   
	 *   deleteTheFirstOccurrenceOf
	 *   
	 *   it deletes the first occurrence of a node with the parameter 'value'
	 *   {1 2 3 4 3 6}.deleteTheFirstOccurrenceOf(3)   -->  { 1 2 4 3 6 }   
	 *   {1 2 1 2 1 2}.deleteTheFirstOccurrenceOf(1)   -->  {2 1 2 1 2} 
	 *   
	 *   a video exploring it's solution and debugging may be available
	 *   
	 *   to test this function
	 *      comment in:   debugSomething in main,  
	 *      create a test case in debugSomething
	 *      call the test function, passing test case
	 *   here's an example:
	 *       testDeleteTheFirstOccurenceOf("1225", 5, "122");
	 */

	public void deleteTheFirstOccurrenceOf(int value) {

		if (first == null) return; // empty list

		if ( first.item != value) { // special case:  item is at front.
			first = first.next;
			return;  // stop looking
		}
		for(Node tmp = first; tmp.next !=null; tmp = tmp.next) { // note: stopping early

			if ( tmp.next.item == value) { //note: peek ahead!
				tmp.next = tmp.next.next;   // deletes tmp.next
				return; // stop looking
			}
		}

	}


	// for debugging purposes, you may comment/uncomment the calls in main below 
	// you should restore the calls as below when you submit your solution
	public static void main (String args[]) {
		//debugSomething();    
		findMaxTests ();
		insertValueBeforeEveryXTests();
		secondToLastPositionTests();
		deleteTheFirstConsecutiveDuplicateItemTests();

	}

	private static void debugSomething () {
		// Use this for debugging!
		// Add the names of helper functions if you use them.
		//Trace.drawSteps();
		Trace.drawStepsOfMethod ("findMax");
		Trace.drawStepsOfMethod ("insertValueBeforeEveryX");
		Trace.drawStepsOfMethod ("positionOfSecondToLastOccurrence");
		Trace.drawStepsOfMethod ("deleteTheFirstConsecutiveDuplicateItem");
		Trace.drawStepsOfMethod ("deleteTheFirstOccurrenceOf");

		//Trace.run (); 
		// To Use:  Put the test here you want to debug:
		// testFindMax (4, "11 -21 31 41");
		testDeleteTheFirstOccurenceOf("1 2 2 3 4 4 ", 2, "1 2 3 4 4" );

	}

	private static void findMaxTests() {
		// arg1: the max  
		// arg2: data to build the list
		testFindMax(4, "4");
		testFindMax(4, "1 2 3 4");
		testFindMax(4, "4 3 2 1");
		testFindMax(4, "1 1 2 3 2 4 1 2");
		StdOut.println( " ........ find max tests complete \n");

	}

	private static void insertValueBeforeEveryXTests() {
		// arg1: expected list contents  
		// arg2: value to insert
		// arg3: X - number to search for
		// arg4: data for original list

		// all tests use value = 1, X = 99
		testInsertValueBeforeEveryX ("", 1, 99, "");              // empty starting list
		testInsertValueBeforeEveryX ("1 99", 1, 99, "99");        // starting list has one value: 99
		testInsertValueBeforeEveryX ("88", 1, 99, "88");          // starting list has one value: 88
		testInsertValueBeforeEveryX ("1 99 10", 1, 99, "99 10");  // starting list has two values, starts with 99
		testInsertValueBeforeEveryX ("10 1 99", 1, 99, "10 99");  // starting list has two values, ends with 99
		testInsertValueBeforeEveryX ("1 99 10 1 99", 1, 99, "99 10 99");  // starting list has multiple 99s
		testInsertValueBeforeEveryX ("5 1 99 6 1 99 1 99 7", 1, 99, "5 99 6 99 99 7");  // starting list has multiple 99s
		StdOut.println( " ........ insertValueBefore tests complete \n");
	}

	private static void secondToLastPositionTests() {

		// arg1: expected position answer 
		// arg2: value to search for
		// arg3: data for original list
		testPositionOfSecondToLastOccurrence (-1, 99, "");
		testPositionOfSecondToLastOccurrence (-1, 99,  "11");
		testPositionOfSecondToLastOccurrence (-1, 99, "11 21 31 41");
		testPositionOfSecondToLastOccurrence (-1, 11, "11 21 31 41");
		testPositionOfSecondToLastOccurrence (-1, 21, "11 21 31 41");
		testPositionOfSecondToLastOccurrence (0, 11, "11 21 31 11");
		testPositionOfSecondToLastOccurrence (3, 11, "11 11 11 11 11");
		testPositionOfSecondToLastOccurrence (2, 11, "11 21 11 35 11");
		StdOut.println( " ........ secondToLastPosition tests complete \n");
	}

	private static void deleteTheFirstConsecutiveDuplicateItemTests() {
		// arg 1: data for original list
		// arg 2: data for correct modifed list
		testDeleteTheFirstConsecutiveDuplicateItem("","");
		testDeleteTheFirstConsecutiveDuplicateItem("1","1");
		testDeleteTheFirstConsecutiveDuplicateItem("1 2","1 2");
		testDeleteTheFirstConsecutiveDuplicateItem("1 2 3","1 2 3");
		testDeleteTheFirstConsecutiveDuplicateItem("1 1 2 3 4 5","1 2 3 4 5");
		testDeleteTheFirstConsecutiveDuplicateItem("1 2 2 3 4 5","1 2 3 4 5");
		testDeleteTheFirstConsecutiveDuplicateItem("1 1 2 2 3 4 5", "1 2 2 3 4 5");
		testDeleteTheFirstConsecutiveDuplicateItem("1 2 3 4 5 5", "1 2 3 4 5");
		StdOut.println( " ........ deleteTheFirstConsecutiveDuplicateItem tests complete \n");
	}


	/* ToString method to print */
	public String toString () { 
		// Use DecimalFormat #.### rather than String.format 0.3f to leave off trailing zeroes
		DecimalFormat format = new DecimalFormat ("#.###");
		StringBuilder result = new StringBuilder ("{ ") ;
		for (Node x = first; x != null; x = x.next) {
			result.append (format.format (x.item));
			result.append (" ");
		}
		result.append (" }");
		return result.toString ();
	}

	/* Method to create lists */
	public static DSIHomework6 of(String s) {
		Node first = null;
		String[] nums = s.split (" ");
		for (int i = nums.length-1; i >= 0; i--) {
			try { 
				int num = Integer.parseInt (nums[i]); 
				first = new Node (num, first);  
			} catch (NumberFormatException e) {
				// ignore anything that is not an int
			}
		}
		DSIHomework6 result = new DSIHomework6 ();
		result.first = first;
		return result;
	}

	private static void testFindMax (int expected, String sList) {
		DSIHomework6 list = DSIHomework6.of (sList);
		String sStart = list.toString ();
		int actual = list.findMax();
		boolean status = true;
		String fsList = "{ " + sList + " }";
		if (expected != actual) {
			StdOut.format ("Failed %20s.findMax(): Expecting: %2d Actual: %4d\n", fsList, expected, actual);
			status = false;
		}
		String sEnd = list.toString ();
		if (! sStart.equals (sEnd)) {
			StdOut.format ("Failed %20s.findMax(): List changed to %s\n", fsList, sEnd);
			status = false;
		}
		if ( status && showMeSuccess)  
			StdOut.format ("Success findMax():  Result: %d  input: %s\n", actual, sStart);
	}	

	private static void testInsertValueBeforeEveryX (String eList, int iValue, int X, String sList) {
		DSIHomework6 list = DSIHomework6.of (sList);
		DSIHomework6 expectedList = DSIHomework6.of (eList);
		list.insertValueBeforeEveryX(iValue, X);
		String actual = list.toString();
		String expected = expectedList.toString();

		boolean status = true;
		String fsList = "{ " + sList + " }";
		if (! expected.equals(actual)) {
			StdOut.format ("Failed  %18s.insertValueBeforeEveryX(1,99): Expecting %s Actual %s\n", fsList, expected, actual);
			status = false;
		}

		if ( status && showMeSuccess) 
			StdOut.format ("Success %18s.insertValueBeforeEveryX(1,99): Result: %s  \n", fsList, actual);
	}	

	private static void testPositionOfSecondToLastOccurrence (int expected, int num, String sList) {
		DSIHomework6 list = DSIHomework6.of (sList);
		String sStart = list.toString ();
		int actual = list.positionOfSecondToLastOccurrence(num);
		boolean status = true;
		String fsList = "{ " + sList + " }";
		if (expected != actual) {
			StdOut.format ("Failed  %20s.positionOfSecondToLastOccurrence(%2d):  Expecting: %d Actual: %d\n", fsList, num, expected, actual);
			status = false;
		}
		String sEnd = list.toString ();
		if (! sStart.equals (sEnd)) {
			StdOut.format ("Failed  %20s.positionOfSecondToLastOccurrence(%2d):  List changed to %s\n", fsList, num, sEnd);
			status = false;
		}
		if ( status && showMeSuccess) 
			StdOut.format ("Success %20s.positionOfSecondToLastOccurrence(%2d):  Result: %2d  position of %d in %s\n", fsList, num, actual, num , sStart);
	}	


	private static void testDeleteTheFirstConsecutiveDuplicateItem (String sList, String eList) {
		DSIHomework6 list = DSIHomework6.of (sList);
		DSIHomework6 expectedList = DSIHomework6.of (eList);
		list.deleteTheFirstConsecutiveDuplicateItem();
		String actual = list.toString();
		String expected = expectedList.toString();

		boolean status = true;
		String fsList = "{ " + sList + " }";
		if (! expected.equals(actual)) {
			StdOut.format ("Failed  %18s.deleteTheFirstConsecutiveDuplicateItem(): Expecting %s Actual %s\n", fsList, expected, actual);
			status = false;
		}

		if ( status && showMeSuccess) 
			StdOut.format ("Success %18s.deleteTheFirstConsecutiveDuplicateItem(): Result: %s  \n", fsList, actual);
	}


	private static void testDeleteTheFirstOccurenceOf (String sList, int x, String eList) {
		DSIHomework6 list = DSIHomework6.of (sList);
		DSIHomework6 expectedList = DSIHomework6.of (eList);
		list.deleteTheFirstOccurrenceOf(x);
		String actual = list.toString();
		String expected = expectedList.toString();

		boolean status = true;
		String fsList = "{ " + sList + " }";
		if (! expected.equals(actual)) {
			StdOut.format ("Failed  %18s.deleteTheFirstOccurenceOf(%d): Expecting %s Actual %s\n", fsList, x, expected, actual);
			status = false;
		}

		if ( status && showMeSuccess) 
			StdOut.format ("Success %18s.TheFirstOccurenceOf(%d): Result: %s  \n", fsList,x, actual);
	}



}
