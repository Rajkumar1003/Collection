package Task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UseSecondMaximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(20000);
		Car c2 = new Car(35000);
		Car c3 = new Car(40000);
		Car c4 = new Car(50000);
		Car c5 = new Car(45000);
		List<Car> cars = Arrays.asList(c1,c2,c3,c4,c5);
		List<Integer> ar = cars.stream().map(x->x.getPrice()).sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		ar.forEach(x->System.out.println(x+"is second maximum"));

	}

}
class Car {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	public Car(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}
	
}

