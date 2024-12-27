package Task2;

import java.util.ArrayList;

public class UseMobileList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile(20000,"redmi","Blue",true);
		Mobile m2 = new Mobile(25000,"Moto","Green",true);
		Mobile m3 = new Mobile(30001,"Realme","White",false);
		Mobile m4 = new Mobile(50003,"IPhone","Black",true);
		ArrayList<Mobile> mobiles = new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
//		for(int i=0;i<mobiles.size();i++) {
//			System.out.println(mobiles.get(i));
//		}
//		for(int i=0;i<mobiles.size();i++) {
//			if(mobiles.get(i).getPrice()>20000) {
//				System.out.println(mobiles.get(i));
//			}
		//}
//		for(int i=0;i<mobiles.size();i++) {
//			if(mobiles.get(i).getName().equals("IPhone")) {
//				System.out.println(mobiles.get(i));
//			}
//		}
//		int max = m1.getPrice();
//		for(int i=0;i<mobiles.size();i++) {
//			if(mobiles.get(i).getPrice()>max) {
//				max = mobiles.get(i).getPrice();
//			}
//		}
//		System.out.println(max);
		
//		Mobile max = m1;
//		for(int i=0;i<mobiles.size();i++) {
//			if(mobiles.get(i).getPrice()>max.getPrice()) {
//				max = mobiles.get(i);
//			}
//		}
//		System.out.println(max);
		
//		for(int i=0;i<mobiles.size();i++) {
//			if(mobiles.get(i).getPrice()%2!=0) {
//				System.out.println(mobiles.get(i).getPrice());
//			}
//		}
		
//		for(int i=0;i<mobiles.size();i++) {
//			if(m1.getName().contains(null)=="a" || mobiles.get(i).getName().contains("e") || mobiles.get(i).getName().contains("i") || mobiles.get(i).getName().contains("o") || mobiles.get(i).getName().contains("u")) {
//				System.out.println(mobiles.get(i).getName().charAt(i));
//			}
//		}
		
		
	}

}
class Mobile {
	private int price;
	private String name;
	private String color;
	private boolean isFixed;
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
	public boolean isFixed() {
		return isFixed;
	}
	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}
	public Mobile(int price, String name, String color, boolean isFixed) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
		this.isFixed = isFixed;
	}
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", name=" + name + ", color=" + color + ", isFixed=" + isFixed + "]";
	}
	
}

