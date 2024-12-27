package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name ="Nishanthi";
		//char[] val = name.toCharArray();
		List<Character> name = Arrays.asList('N','i','s','h','a','n','t','h','i');
		List<Character> ar = name.stream().distinct().collect(Collectors.toList());
		ar.forEach(x->System.out.println(x));

	}

}
