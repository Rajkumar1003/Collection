package Exception;

public class UseNullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String a = null;
		String b = a.toLowerCase();
		System.out.println(b);
		}
		catch(Exception ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}

	}

}
