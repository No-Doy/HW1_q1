/**
 * @author Brian_California
 *
 */
public class UserUtility {
	private String firstName;
	private  String lastName;
	
	public UserUtility(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static String createUsername(String firstName, String lastName) {
		// TODO Auto-generated method stub
		String fn = firstName.substring(0, 3);
		int length = lastName.length();
		String ln = lastName.substring((length -3), length);
		
		String fullname = fn + ln;
		
		return fullname;
		
	}

}