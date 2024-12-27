package Exception;

public class UseIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//		String name = "raghx";
//		char a = name.charAt(9);
//		System.out.println(a);
//		}
//		catch(Exception ae) {
//			ae.printStackTrace();
//		}
		try {
		int arr[] = {12,3,436,76,645};
		System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
//		catch()) {
//			
//		}
		

	}

}
