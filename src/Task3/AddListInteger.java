package Task3;

import java.util.ArrayList;
import java.util.List;

public class AddListInteger {
	
	public int num(List<Integer> a) {
		
		int temp = 0;
		for(int i=0;i<a.size();i++) {
			temp = temp+a.get(i);
			
		}
		return temp;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(12);
		a.add(13);
		AddListInteger num1 = new AddListInteger();
		System.out.println(num1.num(a));
		
	}

}
