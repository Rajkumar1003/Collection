package Task3;

import java.util.Arrays;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		
		int[] nums = {10,20,67,80,64};
		//List<Integer> ar = Arrays.asList(nums);
		int even = Arrays.stream(nums).filter(x->x%2==0).sum();
		System.out.println(even);
	
		
		
		
		

	}

}
