package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseEvenNumber {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,20,30,7,9);
		List<Integer> ar = li.stream().filter(x->x%2==0).collect(Collectors.toList());
		ar.forEach(x->System.out.println(x));
	}

}