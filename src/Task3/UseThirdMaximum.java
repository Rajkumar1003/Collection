package Task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UseThirdMaximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike(10000);
		Bike b2 = new Bike(20000);
		Bike b3 = new Bike(30000);
		Bike b4 = new Bike(5000);
		Bike b5 = new Bike(1000);
		List<Bike> bikes = Arrays.asList(b1,b2,b3,b4,b5);
		List<Integer> ar = bikes.stream().map(x->x.getPrice()).sorted(Collections.reverseOrder()).limit(3).skip(2).collect(Collectors.toList());
		ar.forEach(x->System.out.println(x+"is third maximum"));

	}

}
class Bike {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Bike(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}
	
}
