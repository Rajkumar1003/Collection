package Exception;

import java.util.Optional;

public class UseOrelsethrow {
	public static void main(String[] args) 
	{
		String name = null;
		Optional<String> a = Optional.ofNullable(name);
				a.orElseThrow(()->  new raj("hbhd"));
	}

}
class raj extends NullPointerException {
	public raj(String a) {
		super(a);
	}
	
}
