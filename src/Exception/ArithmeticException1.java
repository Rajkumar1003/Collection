package Exception;

public class ArithmeticException1 {

	public static void main(String[] args) {
		System.out.println("start");
		
		int a = 10;
		int b = 0;
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println(ae);
			
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("i am executed");
		

	}

}
