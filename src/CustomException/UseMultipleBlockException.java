package CustomException;

public class UseMultipleBlockException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String[] names = {"kjhgd","Raj",null};
			String name =names[3];
		  char chr = names[0].charAt(6);
	       String g = names[2].toUpperCase();
			
		}
		catch(StringIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println(ae);
			
		
		}
		catch(ArrayIndexOutOfBoundsException ie){
			ie.printStackTrace();
			System.out.println(ie);
			
		}
		catch(NullPointerException er) {
			er.printStackTrace();
			System.out.println(er);
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("executing ");
		

	}

}
