package CustomException;

public class UsePriceException {

	public static void main(String[] args)throws PriceException{

		
			int[] arr = {1000,2000,3000,900,500};
			for(int i=0;i<arr.length;i++) {
				try {
				if(arr[i]>1000) {
					System.out.println(arr[i]);
				}
				else {
					throw new PriceException(arr[i]+"not to go");
				}
			
		}catch(PriceException ae) {
			System.out.println(ae);
		}
//		finally {
//			System.out.println("start");
//		}
//		System.out.println("end");

	}
	}
}
