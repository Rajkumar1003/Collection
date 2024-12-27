package Task3;

import java.util.Arrays;

public class StringUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"aaa","xxx","abd","heg","ikl"};
		Arrays.stream(arr).map(String::toUpperCase).forEach(System.out::println);
		

	}

}
