package CustomException;

public class UseAgeException {

	public static void main(String[] args)throws AgeException {
		try {
		int age = 9;
		if(age>=18) {
			System.out.println("eligible to vote");
		}
		else {
		    throw new AgeException("invalid age to vote");
		}
		}
		catch(AgeException ae) {
			ae.printStackTrace();
		}
		
		
		finally {                                                                                      
			System.out.println("good to go");
		}
		System.out.println("good to go3");
		
	}

}
