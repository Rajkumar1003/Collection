package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class UsePencil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pencil p1 = new Pencil(20,"apsara","black",true);
		Pencil p2 = new Pencil(10,"Doms","blue",false);
		Pencil p3 = new Pencil(25,"natraj","red",true);
		Pencil p4 = new Pencil(30,"camlin","grey",false);
		Pencil p5 = new Pencil(40,"Faber Castell","peach",true);
		HashMap<Integer,Pencil> pencils = new HashMap<>();
		pencils.put(p1.getPrice(),p1);
		pencils.put(p2.getPrice(),p2);
		pencils.put(p3.getPrice(),p3);
		pencils.put(p4.getPrice(),p4);
		pencils.put(p5.getPrice(),p5);
		
		//map to map
//		HashMap<Integer,Pencil> a = new HashMap<>();
//		pencils.forEach((x,y)->{
//			a.put(x,y);
//			
//		});
//		System.out.println(a);
		//map to list using keyset()
//		ArrayList<Pencil> a = new ArrayList<>();
//		pencils.keySet().forEach(x->{
//			if(pencils.get(x).getPrice()>25) {
//				a.add(pencils.get(x));
//			}
//		});
//		System.out.println(a);
		
		//map to list using values()
//		ArrayList<String> a = new ArrayList<>();
//		pencils.values().forEach(x->{
//			if(x.getColor().length()>4) {
//				a.add(x.getColor());
//			}
//		});
//		System.out.println(a);
		
		//Iterator<Employee> itr = employees
		
//		pencils.values().forEach(x->{
//			if(x.getPrice()>10) {
//				x.setPrice(x.getPrice()+ x.getPrice()*10/100);
//			}
//		});
//		pencils.values().forEach(x->System.out.println(x));
		
		ArrayList<Pencil> ar = new ArrayList<>();
		pencils.keySet().forEach(x->{
			ar.add(pencils.get(x));
		});
		System.out.println(ar);
		
	
		
		

	}

}
class Pencil {
	private int price;
	private String brand;
	private String color;
	private boolean isSharp;
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
	public boolean isSharp() {
		return isSharp;
	}
	public void setSharp(boolean isSharp) {
		this.isSharp = isSharp;
	}
	public Pencil(int price, String brand, String color, boolean isSharp) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.isSharp = isSharp;
	}
	@Override
	public String toString() {
		return "Pencil [price=" + price + ", brand=" + brand + ", color=" + color + ", isSharp=" + isSharp + "]";
	}
	
}
