public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserUtility lb = new UserUtility("Brian", "Alfano");
		String username =  lb.createUsername("Brian", "Alfano");
		
		System.out.println(username);
	}

}