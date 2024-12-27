package List;

import java.util.ArrayList;

public class ArrayListOddorEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(90);
		nums.add(32);
		nums.add(79);
		nums.add(65);
		nums.add(62);
//		//for(int i=0;i<nums.size();i++) {
//			//if(nums.get(i)%2==0) {
//				//System.out.println(nums.get(i));
//			//}
//		nums.forEach(x-> {
//			if(x%2==0) {
//				System.out.println(x);
//			}
		//});
		
		int max = nums.get(0);
		for(int x : nums) {
			if(x>max) {
				max = x;
			}
		}
		System.out.println(max);

	}

}
