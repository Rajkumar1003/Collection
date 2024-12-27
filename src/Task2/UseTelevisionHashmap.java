package Task2;

import java.util.HashMap;

public class UseTelevisionHashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t1 = new Television(20000,"Samsung","Blue",true,1);
		Television t2 = new Television(30000,"Redmi","Black",false,2);
		Television t3 = new Television(40000,"Realme","Red",true,3);
		Television t4 = new Television(25000,"Hitachi","Green",false,4);
		Television t5 = new Television(45001,"Panasonic","White",true,5);
		HashMap<Integer,Television> ar = new HashMap<>();
		ar.put(t1.getId(), t1);
		ar.put(t2.getId(), t2);
		ar.put(t3.getId(), t3);
		ar.put(t4.getId(), t4);
		ar.put(t5.getId(), t5);
//		for(Integer x : ar.keySet()) {
//			System.out.println(x);
//		}
		//ar.forEach((x,y)->System.out.println(x+" "+y));
//		for(Television x : ar.values()) {
//			System.out.println(x);
//		}
//		for(Television x : ar.values()) {
//			if(x.getPrice()%2==0) {
//				System.out.println(x.getPrice());
//			}
//			
//		}
		
		
//		for(Television x : ar.values()) {
//			if(x.getBrand().startsWith("S")) {
//				System.out.println(x.getBrand());
//			}
//			
//		}
		
//		long max = t1.getPrice();
//		for(Television x : ar.values()) {
//			if(x.getPrice()>max) {
//				max = x.getPrice();
//			}
//		}
//		System.out.println(max);
		
//		Television max = ar.get(t1.getId());
//		for(Integer x : ar.keySet()) {
//			if(ar.get(x).getId()>max.getId()) {
//				max = ar.get(x);
//			}
//			
//		}
//		System.out.println(max);
		
		for(Television x : ar.values()) {
			if(x.getBrand().length()>6) {
				System.out.println(x);
			}
		}

	}

}
class Television {
	private int price;
	private String brand;
	private String color;
	private boolean isAvailable;
	private int id;
	public int getPrice() {
		return price;
	}
	public Television get(int id2) {
		// TODO Auto-generated method stub
		return null;
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
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Television(int price, String brand, String color, boolean isAvailable, int id) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.isAvailable = isAvailable;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Television [price=" + price + ", brand=" + brand + ", color=" + color + ", isAvailable=" + isAvailable
				+ ", id=" + id + "]";
	}
	
}
