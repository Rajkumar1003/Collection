package List;

import java.util.ArrayList;
import java.util.HashMap;

public class UseTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table t1 = new Table(10,"Wakefit Coffee","blue",true);
		Table t2 = new Table(15,"Pedpix Modern","red",false);
		Table t3 = new Table(20,"MATTERHORN","black",true);
		Table t4 = new Table(12,"Adele Rectangular","white",true);
		ArrayList<Table> tables = new ArrayList<>();
		tables.add(t1);
		tables.add(t2);
		tables.add(t3);
		tables.add(t4);
		// list to list
//		ArrayList<String> tableBrand = new ArrayList<>();
//		tables.forEach(x->{
//			if(x.getColor().length()>4) {
//				tableBrand.add(x.getColor());
//				
//			}
//	});
//		System.out.println(tableBrand);
//		
		//list to map
		
		HashMap<Integer,Table> a = new HashMap<>();
		tables.forEach(x->{
			a.put(x.getId(),x);
		});
		System.out.println(a);
		
		//list to list
		
//		ArrayList<Table> ar = new ArrayList<>();
//		for(Table x : tables) {
//			if(x.getBrand().length()>11) {
//				ar.add(x);
//			}
//		}
//		System.out.println(ar);
		
		HashMap<Integer,Table> ar = new HashMap<>();
		tables.forEach(x->{
			ar.put(x.getId(),x);
		});
		System.out.println(ar);
		
		
			
		}

	}


class Table {
	private int id;
	private String brand;
	private String color;
	private boolean isAvailable;
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
	public Table(int id, String brand, String color, boolean isAvailable) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Table [id=" + id + ", brand=" + brand + ", color=" + color + ", isAvailable=" + isAvailable + "]";
	}
	
}
