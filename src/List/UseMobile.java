package List;
import java.util.ArrayList;
import java.util.HashMap;

public class UseMobile {

	public static void main(String[] args) {
		Phone p1 = new Phone("redmi",300000,"white",true,"2006");
		Phone p2 = new Phone("realme",25000,"blue",false,"2000");
		Phone p3 = new Phone("iphone",100000,"black",true,"2010");
		Phone p4 = new Phone("moto",50000,"gr",true,"2013");
		//System.out.println(p1.toString()+" "+p2+" "+p3+" "+p4);
		ArrayList<Phone> phones = new ArrayList<>();
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);
		phones.add(p4);
		//for(int i=0;i<phones.size();i++) {
			//System.out.println(phones.get(i));
			
		//}
		//phones.forEach(x-> {
			//System.out.println(x);
		//});
		//for(int i=0;i<phones.size();i++) {
			//if(phones.get(i).getPrice()>35000) {
				//System.out.println(phones.get(i).getPrice());
				
			//}

			//}
		//}
//		Phone max = p1;
//		for(int i=0;i<phones.size();i++) {
//			if(phones.get(i).getPrice()>max.getPrice()) {
//				max = phones.get(i);
//				
//			}
//		}
//		//System.out.println(max.getPrice()+" is the maximum price");
//		System.out.println(max.getBrand()+max.getColor());
//		
//		
//		ArrayList<Phone> expensivePhones = new ArrayList<>();
//		
//		phones.forEach(x-> {
//			if(x.getPrice()>=20000) {
//				expensivePhones.add(x);
//			}
		
//		});
//		
//		expensivePhones.forEach(x->System.out.println(x));
//		
//		//List to Map
//		
//		HashMap<Integer, Phone> mapPhones = new HashMap<>();
//		
//		phones.forEach(x-> {
//			mapPhones.put(x.getPrice(), x);
//		}	);
//		
//		
//		System.out.println(mapPhones);
		
		ArrayList<Character> b = new ArrayList<>();
		phones.forEach(x->{
			if(x.getColor().length()>4) {
				b.add(x.getColor().charAt(x.getColor().length()-1));
			}
			else if(x.getColor().length()<3) {
				b.add(x.getColor().charAt(0));
			}
		});
		
		System.out.println(b);
		
		
		
		
		
	
		}
}

		

	


class Phone {
	private String brand;
	private int price;
	private String color;
	private boolean isWarranty;
	private String editionYear;
	public void setBrand(String a) {
		brand = a;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int b) {
		price = b;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setisWarranty(boolean d) {
		isWarranty = d;
	}
	public boolean getisWarranty() {
		return isWarranty;
	}
	public void seteditionYear(String e) {
		editionYear = e;
	}
	public String geteditionYear() {
		return editionYear;
	}
	public Phone(String brand,int price,String color,boolean isWarranty,String editionYear) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isWarranty = isWarranty;
		this.editionYear = editionYear;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+isWarranty+" "+editionYear;
	}
	
}
