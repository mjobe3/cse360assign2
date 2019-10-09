/**
 * <h1>AddingMachine.java</h1>
 * 
* @author Matthew Jobe
* Class ID: CSE360 - 70641
* Assignment 2
* 
* This AddingMachine program performs addition and subtraction operations
* on integers and reports the total and history of operations
*/

package cse360assign2;

public class AddingMachine 
{

	/**
	 * total holds the current total after operations,
	 * history is a string of all the operations performed
	*/
	
	private int total;
	private String history = "";
	
	
	/**
	 * This constructor assigns total to 0
	 * and adds the initial total to the operation history
	*/
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		history = history + Integer.toString(total) + " ";
	}
	
	/**
	 * This method returns the current total
	*/
	
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * This method adds the parameter to the total
	 * and adds the value/operation to history
	*/
	
	public void add (int value) 
	{
		history = history + "+ " + Integer.toString(value) + " ";
		total = total + value;
	}
	
	
	/**
	 * This method subtracts the parameter from the total
	 * and adds the value/operation to history
	*/
	
	public void subtract (int value) 
	{
		history = history + "- " + Integer.toString(value) + " ";
		total = total - value;
	}
	
	/**
	 * This method returns the history of addition/subtraction operations as a string
	*/
		
	public String toString () 
	{
		return history;
	}

	
	/**
	 * Resets the total and history
	*/
	
	public void clear() 
	{
		total = 0;
		history = "";
	}
}
