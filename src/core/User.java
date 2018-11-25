/**
 * 
 */
package core;

/**
 * @author iTzEinstein118Xx
 *
 */
public class User {

	//Declarations
	public String Username;
	public String UserID;
	public String Birth;
	//this is always out of 7
	public byte[] DaysFree;
	
	//constructors
	public User(String name, String dob) {
		Username = name;
		Birth = dob;
	}
	
	/**
	 * Method to track User's free days.
	 * @param Days, each has a unique ID (Mon = 1, etc...)
	 * @return, 0 is success. All others are errors outputs
	 */
	public int WorkDays(int[] Days, boolean All) {
		// eg: {1, 3, 5, 6} : Mon | Wed | Fri | Sat
		
		if(All == false) 
		{		
			byte[] DayTracker = new byte[] { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
			for (int n : Days) { 
				DayTracker[n] = 1;
			} 
			DaysFree = DayTracker;
			return 0;
		} else if (All == true) {
			DaysFree = new byte[] { 1 , 1 , 1 , 1 , 1 , 1 , 1 };
			return 0;
		} else {
			return 1;
		}
		
	}
	
}
