package Exception;

public class UseNumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "10A;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaQ";
		try {
		int b = Integer.parseInt(a);
		System.out.println(b);
		}
		catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println(ne);
		}
		finally {
			System.out.println("finally");
		}
		     

	}

}
