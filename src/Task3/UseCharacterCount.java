package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseCharacterCount {
	
	public static void main(String[] args) {
//		String name = "rajkumar";
//		Map<Character,Long> ar = name.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		ar.forEach((x,y)->System.out.println(x+","+y));
		String name = "rajkumar";
		char[] val = name.toCharArray();
		List<char[]> nums = Arrays.asList(val);
		Map<Character,Long> ar = nums.stream().collect(Collectors.groupingBy(x->x,Collectors.counting());
    }

}
