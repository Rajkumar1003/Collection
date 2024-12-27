package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UseStringLengthArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] name = {"nisha","kralice","demet"};
//		List<String> li = Arrays.asList(name);
//		List<Integer> val = li.stream().filter(x->x.length()).collect(Collectors.toList());
		
		String[] name = {"nisha","sahsukd","sasuke","hinatanaruto"};
		//List<String> val = Arrays.asList(name);
		 Arrays.stream(name).map(String::length).forEach(length->System.out.println(length));
		 //System.out.println(count);
		

	}

}
