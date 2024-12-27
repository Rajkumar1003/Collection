package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import java.util.stream.Collectors;

public class UseIntArraySorted {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {32,87,65,90,41,35};
		//List<int[]> li = Arrays.asList(arr);
		 Arrays.stream(arr).sorted().forEach(System.out::println);

		
	}

}
