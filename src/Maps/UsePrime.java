package Maps;

import java.util.HashMap;

public class UsePrime {
	public static void main(String[] args) {
		HashMap<Integer,String> ar = new HashMap<>();
		ar.put(11, "ramu");
		ar.put(12, "ghs");
		ar.put(7, "raj");
		ar.keySet().forEach(x->{
			boolean isPrime = true;
			int num = x;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime = false;
				}
			}
			if(isPrime==true) {
				//System.out.println(ar.get(x));
				System.out.println(x);
			}
//			else {
//				System.out.println(ar.get(x));
//			}
			
//			int num = x;
//			for(int i=2;i<=num;i++) {
//				boolean isPrime = true;
//				for(int j=2;j<i;j++) {
//					if(i%j==0) {
//						isPrime = false;
//					}
//				}
//				if(isPrime==true) {
//					System.out.println(i+" prime");
//				}
//				else {
//					System.out.println(i+" not a prime");
//				}
//				
//			}
//				
	});
			
	}

}
