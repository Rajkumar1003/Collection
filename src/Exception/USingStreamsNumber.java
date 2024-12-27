package Exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class USingStreamsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {1500,7500,1100,100,500};
//		
//		
//		 Arrays.stream(arr).filter(x-> String.valueOf(x).startsWith("1")).forEach(x->System.out.println(x));
		
		List<Integer> ar = Arrays.asList(10,11,12,34,56);
		List<Integer> add = ar.stream().filter(x->String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(add);
 
	}

}
