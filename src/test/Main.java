/**
 * 
 */
package test;
/**
 * @author Albert Ferguson
 *
 */
import core.User;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Implement User class for testing purposes
		
		String Name = "John Doe";
		String Mail = "johndoe@gmail.com";
		String Mobile = "044986786";
		String ContactPhone = "0";
		String DOB = "29/03/1999";
		String Description = "Test";
		String[] Schools = { "Kings" , "USYD" };
		int[] Days = { 1 , 5 , 6 , 7 };
		
		User a = new User(Name, Mail, DOB, Description, Schools, Mobile, ContactPhone, Days, false);
		
		System.out.println("User Bio Object: "+ a.getBio());
		System.out.println("User DOB: "+ a.getBirth());
		System.out.println("Username: "+ a.getUser());
		System.out.println("User ID: "+ a.getID());
		System.out.println("Contact Object: "+ a.getContact());
	}

}
