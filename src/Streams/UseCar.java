package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(100000,"Audi","Black",true);
		Car c2 = new Car(200000,"Benz","Red",false);
		Car c3 = new Car(150000,"Ford","Blue",true);
		Car c4 = new Car(30000,"Audi","Green",false);
		 List<Car> cars = Arrays.asList(c1,c2,c3,c4);
//		 int max = cars.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
//		 System.out.println(max);
		 
		 
//		 boolean ar = cars.stream().anyMatch(x->x.getPrice()==30000);
//		 System.out.println(ar);
		 
//		 int ar = cars.stream().map(x->x.getPrice()).sorted().findFirst().get();
//		 System.out.println(ar);
		 
//		 List<Integer> ar= cars.stream().map(x->x.getPrice()).sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
//		 System.out.println(ar);
		 
		 
//		 List<String> ar = cars.stream().map(x->x.getName()).distinct().collect(Collectors.toList());
//		 ar.forEach(x->System.out.println(x));
		 
//		 int totalAmount = cars.stream().map(x->x.getPrice()).collect(Collectors.summingInt(x->x));
//		 System.out.println(totalAmount);
		 
//		 List<String> ar = cars.stream().map(x->x.getColor()).limit(2).collect(Collectors.toList());
//		 ar.forEach(x->System.out.println());
		 
//		 List<Integer> ar = cars.stream().map(x->x.getPrice()).skip(1).collect(Collectors.toList());
//		 ar.forEach(x->System.out.println(x));
		 
		 List<Car> ar = cars.stream().filter(x->x.getPrice()>100000).collect(Collectors.toList());
		 ar.forEach(x->System.out.println(x));

	}

}
class Car {
	private int price;
	private String name;
	private String color;
	private boolean isAvailable;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Car(int price, String name, String color, boolean isAvailable) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", color=" + color + ", isAvailable=" + isAvailable + "]";
	}
	
}
