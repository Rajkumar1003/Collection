package List;

import java.util.ArrayList;
import java.util.HashMap;

public class UseVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle(20000,"blue","splendor",true);
		Vehicle v2 = new Vehicle(35000,"red","enfield",false);
		Vehicle v3 = new Vehicle(50000,"orange","RC 200",true);
		Vehicle v4 = new Vehicle(25000,"black","Appache",true);
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
//		Vehicle max = v1;
//		for(int i=0;i<vehicles.size();i++) {
//			if(vehicles.get(i).getPrice()>max.getPrice()) {
//				max = vehicles.get(i);
//			}
//		}
//		System.out.println(max);
		
		//list to list
		
//		ArrayList<Vehicle> vehicle = new ArrayList<>();
//		vehicles.forEach(x->{
//			if(x.getPrice()>30000) {
//				vehicle.add(x);
//			}
//		});
//		System.out.println(vehicle);
		
		//list to map
		
		HashMap<Integer,Vehicle> a = new HashMap<>();
		vehicles.forEach(x->{
			a.put(x.getPrice(),x);
		});
		
		System.out.println(a);
		

	}

}
class Vehicle {
	private int price;
	private String color;
	private String brand;
	private boolean isAvailable;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Vehicle(int price, String color, String brand, boolean isAvailable) {
		super();
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", color=" + color + ", brand=" + brand + ", isAvailable=" + isAvailable
				+ "]";
	}
	
}