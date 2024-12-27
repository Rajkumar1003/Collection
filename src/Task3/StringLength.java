package Task3;

public class StringLength {
	public static void main(String[] args) {
		String[] arr = {"raj","vasu","onesoft"};
//		int max = arr[1].length();
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].length()>max) {
//				max = arr[i].length();
//				
//			}
//		}
//		System.out.println(max);
//		String maxS = arr[0];
//		int max = arr[0].length();
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].length()>max) {
//				max = arr[i].length();
//				maxS = arr[i];
//				
//			}
//		}
//		System.out.println(maxS);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;i++) {
				if(arr[i].length()>arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		//System.out.println(arr[1]);
		for(String x : arr) {
			System.out.println(x);
		}
		
		}
		
	}


