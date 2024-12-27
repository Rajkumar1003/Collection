package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseLaptopStreams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop(55000,"Dell","White",true);
		Laptop l2 = new Laptop(50000,"Dell","Black",false);
		Laptop l3 = new Laptop(60000,"Lenovo","Blue",true);
		Laptop l4 = new Laptop(65000,"VivoBook","Green",true);
		Laptop l5 = new Laptop(70000,"Apple","Red",false);
		List<Laptop> laptops = Arrays.asList(l1,l2,l3,l4,l5);
//		List<Laptop> ar = laptops.stream().filter(x->x.getBrand().length()>5).collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		List<Integer> ar = laptops.stream().map(x->x.getPrice()).collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		long count = laptops.stream().filter(x->x.getPrice()>55000).count();
//		System.out.println(count);
		
//		List<Integer> ar = laptops.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		List<Integer> ar = laptops.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		List<String> ar = laptops.stream().map(x->x.getColor()).sorted().collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		List<Integer> ar = laptops.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		List<String> ar = laptops.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		int price = laptops.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
//		System.out.println(price);
		
//		String brand = laptops.stream().map(x->x.getBrand()).min(Comparable::compareTo).get();
//		System.out.println(brand);
//		
//		int price = laptops.stream().map(x->x.getPrice()).min(Comparable::compareTo).get();
//		System.out.println(price);
		
//		boolean val = laptops.stream().anyMatch(x->x.getBrand().length()==5);
//		System.out.println(val);
		
//		int sort = laptops.stream().map(x->x.getPrice()).sorted().findFirst().get();
//		System.out.println(sort);
//		
//		List<Integer> ar = laptops.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		
//		int total = laptops.stream().map(x->x.getPrice()).collect(Collectors.summingInt(x->x));
//		System.out.println(total);
			
//		Map<String,Long> ar = laptops.stream().collect(Collectors.groupingBy(x->x.getBrand(),Collectors.counting()));
//		ar.forEach((x,y)->System.out.println(x+","+y));
		
		Map<Integer,Laptop> ar = laptops.stream().collect(Collectors.toMap(x->x.getPrice(),y->y));
		ar.forEach((x,y)->System.out.println(x+","+y));
		}
		
		
		
		

	}


class Laptop {
	private int price;
	private String brand;
	private String color;
	private boolean isFixed;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFixed() {
		return isFixed;
	}
	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}
	public Laptop(int price, String brand, String color, boolean isFixed) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.isFixed = isFixed;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + ", color=" + color + ", isFixed=" + isFixed + "]";
	}
	
}