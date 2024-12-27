package List;

import java.util.ArrayList;

public class ArraylistMethodUsingForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>nums = new ArrayList<>();
		nums.add(54);
		nums.add(90);
		nums.add(32);
		nums.add(65);
		//for(int i=0;i<nums.size();i++) {
			//System.out.println(nums.get(i));
		//}
		nums.forEach(x->System.out.println(x));
		

	}

}
