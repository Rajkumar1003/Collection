package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseFloat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> ar = Arrays.asList(23.89,45.87,87.90,45.55);
		Double val = ar.stream().collect(Collectors.summingDouble(x->x));
		System.out.println(val);
		
	}

}
