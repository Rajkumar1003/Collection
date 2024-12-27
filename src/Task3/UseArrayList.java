package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(10,20,30,10,25);
//		List<Integer> ar = nums.stream().distinct().collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
		nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);

	}

}
