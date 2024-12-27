package Maps;
import java.util.HashMap;
public class UseMask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mask m1 = new Mask(56,"ble");
		Mask m2 = new Mask(98,"bfhdbf");
		Mask m3 = new Mask(100,"yellow");
		HashMap<Integer,Mask> masks = new HashMap<>();
		masks.put(m1.getPrice(), m1);
		masks.put(m2.getPrice(), m2);
		masks.put(m3.getPrice(), m3);
		//**initialize max value using values()
		//int max = m1.getPrice();
//		for(Mask x : masks.values()) {
//			if(x.getPrice()>max) {
//				max = x.getPrice();
//			}
		
//		}
//		System.out.println(max);
		//**initialize max object using keySet()
//		Mask max = masks.get(m1.getPrice());
//		for(Integer x : masks.keySet()) {
//			if(masks.get(x).getPrice()>max.getPrice()) {
//				max = masks.get(x);
//			}
//		}
		//System.out.println(max);
		masks.values().forEach(x->System.out.println(x));
//		masks.keySet().forEach(y->System.out.println(y));
		
		

	}

}
class Mask {
	private int price;
	private String color;
	public void setPrice(int a) {
		price = a;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String b) {
		color = b;
	}
	public String getColor() {
		return color;
	}
	public Mask(int price,String color) {
		this.price = price;
		this.color = color;
	}
	public String toString() {
		return price+"="+color;
	}
}