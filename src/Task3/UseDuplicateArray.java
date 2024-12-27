package Task3;

import java.util.Arrays;

public class UseDuplicateArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,4,4,6,6,2,7,1,3,9};
		Arrays.stream(nums).distinct().forEach(System.out::println);

	}

}
