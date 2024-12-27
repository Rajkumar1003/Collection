package List;
import java.util.ArrayList;
public class UseBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike("yamaha","grey",90000,5);
		Bike b2 = new Bike("splendor","yellow",45000,10);
		Bike b3 = new Bike("enfield","black",600001,15);
		ArrayList<Bike> bikes = new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		//Bike max = b1;
		//for(int i=0;i<bikes.size();i++) {
			//if(bikes.get(i).getPrice()>70000){
				//System.out.println(bikes.get(i));
				//System.out.println(bikes.get(i).getColor());
			//if(bikes.get(i).getPrice()>max.getPrice()) {
				//max = bikes.get(i);
			//}
		//}
		//System.out.println(max.getPrice());
		//for(int i=0;i<bikes.size();i++) {
			//if(bikes.get(i).getBrand().length()>5 && bikes.get(i).getPrice()>30000 && bikes.get(i).getColor().length()>5) {
				//System.out.println(bikes.get(i));
			//}
		//}
		//for(int i=0;i<bikes.size();i++) {
			//if(bikes.get(i).getPrice()%2==1) {
				//System.out.println(bikes.get(i).getBrand()+" "+bikes.get(i).getColor());
			//}
		//}
		//System.out.println(bikes.get(i).getBrand());
			//if(bikes.get(i).getColor().equals("yellow")) {
				//System.out.println(bikes.get(i).getBrand()+" "+bikes.get(i).getPrice());
			//}
			//bikes.get(i).setPrice( bikes.get(i).getPrice()-(bikes.get(i).getPrice()*bikes.get(i).getDiscount()/100));
		
//		int max = b1.getPrice();
//		for(int i=0;i<bikes.size();i++) {
//			if(bikes.get(i).getPrice()>max) {
//				max = bikes.get(i).getPrice();
//			}
//		}
//		System.out.println(max);
		
//		Bike max = b1;
//		for(int i=0;i<bikes.size();i++) {
//			if(bikes.get(i).getPrice()>max.getPrice()) {
//				max = bikes.get(i);
//			}
//		}
//		System.out.println(max);
			
		
		
//		bikes.get(2).setBrand("Raj");
//		bikes.get(1).setPrice(12000);
//		for(Bike x : bikes) {
			//System.out.println(x);
		
//		bikes.forEach(a->{
//			System.out.println(a.getBrand().charAt(0));
//			
//		});
		
		for(Bike x : bikes) {
			if(x.getBrand().contains("a") || x.getBrand().contains("e") || x.getBrand().contains("e")) {
				System.out.println(x.getBrand());
			}
		}
	}
	}

class Bike {
	private String brand;
	private String color;
	private int price;
	private int discount;
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	//private boolean isMileage;
	public void setBrand(String e) {
		brand = e;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String a) {
		color = a;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int b) {
		price = b;
	}
	public int getPrice() {
		return price;
	}
	//public void setisMileage(boolean c) {
		//isMileage = c;
	//}
	//public boolean getisMileage() {
		//return isMileage;
	//}

	public Bike(String brand, String color, int price, int discount) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", color=" + color + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
}
