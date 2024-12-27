package List;

import java.util.ArrayList;

public class ArrayListMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		////nums.add(45);
		//nums.add(6);
		//nums.add(95);
		//nums.add(48);
		//System.out.println(nums);
		//nums.set(2, 90);
		//System.out.println(nums);
		//nums.remove(1);
		//System.out.println(nums);
		//System.out.println(nums.get(1));
		//System.out.println(nums.size());
		nums.add(90);
		nums.add(78);
		nums.add(76);
		nums.add(24);
		nums.set(2, 12);
		System.out.println(nums);
		nums.remove(3);
		System.out.println(nums);
		
	}

}
