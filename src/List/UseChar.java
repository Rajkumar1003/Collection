package List;
import java.util.ArrayList;
public class UseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Character> nums = new ArrayList<>();
//		nums.add('e');
//		nums.add('a');
//		nums.add('i');
//	for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		int sum = 0;
//		int num1 = nums.get(0);
//		int num2 = nums.get(1);
//		int sum = num1+num2;
//		System.out.println(sum);
//		for(int i=1;i<=20;i++) {
//			nums.add(i);
//		}
//		System.out.println(nums);
		//for(Integer x : nums) {
			//sum=sum+x;
		
		//}
		for(int i=1;i<nums.size();i++) {
			sum = sum+nums.get(i);
		}
		System.out.println(sum);
		
		
			
		}

	}


