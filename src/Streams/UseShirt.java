package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.multi.MultiColorChooserUI;

import java.util.Set;

public class UseShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirt s1 = new Shirt(1,"ooto",1500,"blue",true);
		Shirt s2 = new Shirt(2,"raymond",5000,"green",false);
		Shirt s3 = new Shirt(3,"allensolly",2000,"red",true);
		Shirt s4 = new Shirt(4,"peter england",3000,"blue",true);
		Shirt s5 = new Shirt(5,"ooto",1000,"black",false);
		List<Shirt> shirts = Arrays.asList(s1,s2,s3,s4,s5);
		//**to initialize shirt price is >1000
//		List<Shirt> expensiveShirt = shirts.stream().filter(x->x.getPrice()>1000).collect(Collectors.toList());
//		expensiveShirt.forEach(x->System.out.println(x));
		
		
		//**to initialize to get shirts brand
//	List<Character> brands = shirts.stream().map(x->x.getBrand().charAt(2)).collect(Collectors.toList());
//		brands.forEach(x->System.out.println(x));
		
		
		//**to initialize count value for shirt brand
		//List<String> brands = shirts.stream().map(x->x.getBrand()).collect(Collectors.toList());
//		long count = shirts.stream().filter(x->x.getBrand().equals("ooto")).count();
//		System.out.println(count);
		
		
		//** to initialize sorted() to getPrice
//		List<Integer> a = shirts.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
//		a.forEach(x->System.out.println(x));
		
		
		//** to initialize sorted() for descending order to getPrice
//		List<Integer> a = shirts.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		a.forEach(x->System.out.println(x));
		
		
		//** to initialize ascending order shirt price object
//		List<Shirt> b = shirts.stream().sorted(Comparator.comparing(Shirt::getPrice)).collect(Collectors.toList());
//		b.forEach(x->System.out.println(x));
		
		
		//** to initialize descending order shirt price object
//		List<Shirt> b = shirts.stream().sorted(Comparator.comparing(Shirt::getPrice).reversed()).collect(Collectors.toList());
//		b.forEach(x->System.out.println(x));
		
		
		//** to initialize shirt brand using distinct()
//		List<String> c = shirts.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
//		c.forEach(x->System.out.println(x));
		
		//** to initialize shirt price using limit()method
//		List<Shirt> b = shirts.stream().filter(x->x.getPrice()>1000).limit(2).collect(Collectors.toList());
//		b.forEach(x->System.out.println(x));
		
		
		//** to initialize shirt price using skip()method
//		List<Shirt> c = shirts.stream().filter(x->x.getPrice()>100).skip(2).collect(Collectors.toList());
//		c.forEach(x->System.out.println(x));
		
		//Object Comparable;
		//**to initialize maximum shirt brand using max()
	//String brand = shirts.stream().map(x->x.getBrand()).max(Comparable::compareTo).get();
	//System.out.println(brand);
		
		//**to initialize minimum shirt brand using min()
//		String brand = shirts.stream().map(x->x.getBrand()).min(Comparable::compareTo).get();
//		System.out.println(brand);
		
		//** to initialize boolean value using anyMatch()
//		boolean anyMatch = shirts.stream().anyMatch(x->x.getPrice()==5000);
//		System.out.println(anyMatch);
		
		//** to initialize shirt price using sorted() and findFirst()
	//List<Integer> sort = shirts.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
		//sort.forEach(x->System.out.println(x));
		
		
		//** to initialize shirt brand using set
//		Set<String> b = shirts.stream().map(x->x.getBrand()).collect(Collectors.toSet());
//		b.forEach(x->System.out.println(x));
		
		//** to initialize using Map<>
//		Map<Integer,Shirt> a = shirts.stream().collect(Collectors.toMap(x->x.getId(),y->y));
//		a.forEach((x,y)->System.out.println(x+" "+y));
		
		//** to initialize shirt total amount using summingInt()
//		int totalAmount = shirts.stream().map(x->x.getPrice()).collect(Collectors.summingInt(x->x));
//		System.out.println(totalAmount);
		
		//** to find count value for shirt brand using groupingBy()
//		Map<String,Long> grouping = shirts.stream().collect(Collectors.groupingBy(x->x.getBrand(),Collectors.counting()));
//		System.out.println(grouping);
	//	grouping.forEach((x,y)->System.out.println(x+" = "+y));
		
		//** to find out using flatMap()
		//List<String> a = shirts.stream().flatMap(x->x.getBrand()).collect(Collectors.toList());
		
		//** to find second max
//		    List<Integer> smax = shirts.stream().map(x->x.getPrice()).sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
//		
//	smax.forEach(x->System.out.println(x));
//	List<Integer> li = (Arrays.asList(23,45,23));
//
//	List<Integer> lr = Arrays.asList(12,56,78);
//	
//	List<List<Integer>> lq = new ArrayList<>();
//	lq.add(li);
//	lq.add(lr);
//	List<Integer> ar = lq.stream().flatMap(x->x.stream()).collect(Collectors.toList());
//	//ar.forEach(x->System.out.println(x));
//	System.out.println(ar);
	 
//	
//	List<Integer> arr = shirts.stream().map(x->x.getPrice()).filter(x->x>4000).collect(Collectors.toList());
//	arr.forEach(x->System.out.println(x));
//		List<Shirt> arr = shirts.stream().filter(x->!x.getColor().equals("white")).collect(Collectors.toList());
//		arr.forEach(x->System.out.println(x));
	//forEach(x->System.out.println(x));
//		List<Shirt> ar = shirts.stream().filter(x->x.getPrice()>2000).map(x->x.getPrice()-500).collect(Collectors.toList());
//		ar.forEach(x->System.out.println(x));
		//List<Integer> a = pho
	
//		List<Shirt> add = shirts.stream().map(y -> {
//			if (y.getColor().equals("blue")) {
//				y.setPrice(y.getPrice() * 10 / 100);
//			}
//			return y;
//		}).collect(Collectors.toList());
//		System.out.println(add);
	
//	List<Shirt> add = shirts.stream().filter(x->x.getColor().equals("blue")).map(x->{
//		x.setPrice(x.getPrice()+x.getPrice()*10/100);
//		return x;
//	}).collect(Collectors.toList());
//	System.out.println(add);
		
	List<Shirt> ar = 	shirts.stream().sorted(Comparator.comparing(Shirt::getPrice).reversed()).limit(2).skip(1).collect(Collectors.toList());
System.out.println(ar);
	}

}
class Shirt {
	private int id;
	private String brand;
	private int price;
	private String color;
	private boolean isFabric;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFabric() {
		return isFabric;
	}
	public void setFabric(boolean isFabric) {
		this.isFabric = isFabric;
	}
	public Shirt(int id, String brand, int price, String color, boolean isFabric) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isFabric = isFabric;
	}
	@Override
	public String toString() {
		return "Shirt [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", isFabric="
				+ isFabric + "]";
	}
}