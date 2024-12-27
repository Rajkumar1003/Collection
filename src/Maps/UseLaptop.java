package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class UseLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1 = new Laptop(1,400000,"lenovo",true,"white");
		Laptop l2 = new Laptop(2,50000,"asus",false,"black");
		Laptop l3 = new Laptop(3,60000,"dell",true,"red");
		Laptop l4 = new Laptop(4,70000,"samsung",false,"blue");
		Laptop l5 = new Laptop(5,55500,"acer",true,"yellow");
		HashMap<Integer,Laptop> laptops = new HashMap<>();
		laptops.put(l1.getId(),l1);
		laptops.put(l2.getId(),l2);
		laptops.put(l3.getId(),l3);
		laptops.put(l4.getId(),l4);
		laptops.put(l5.getId(),l5);
//		for(Laptop x : laptops.values()) {
//			if(x.getBrand().length()>5) {
//				System.out.println(x.getBrand());
//			}
//		}
		
//		Laptop max = laptops.get(l1.getId());
//		for(Integer x : laptops.keySet()) {
//			if(laptops.get(x).getPrice()>max.getPrice()) {
//				max = laptops.get(x);
//			}
//			
//		}
//		System.out.println(max);
		
		//map to list
		
//		ArrayList<Integer> ar = new ArrayList<>();
//		for(Integer x : laptops.keySet()) {
//			if(laptops.get(x).getId()>3) {
//				ar.add(x);
//				
//			}
//			
//		}
//		System.out.println(ar);
		
		
		
		
		//map to list using values()
//		ArrayList<Laptop> ar = new ArrayList<>();
//		for(Laptop x : laptops.values()) {
//			if(x.getColor().equals("black")) {
//				ar.add(x);
//			}
//		}
//		System.out.println(ar);
		//map to map
		
		HashMap<Integer,Laptop> ar = new HashMap<>();
		laptops.forEach((x,y)->{
			ar.put(x,y);
		});
		System.out.println(ar);
		


	}

}
class Laptop {
	private int id;
	private int price;
	private String brand;
	private boolean isColor;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public boolean isColor() {
		return isColor;
	}
	public void setColor(boolean isColor) {
		this.isColor = isColor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Laptop(int id, int price, String brand, boolean isColor, String color) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
		this.isColor = isColor;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", price=" + price + ", brand=" + brand + ", isColor=" + isColor + ", color="
				+ color + "]";
	}
	
}
