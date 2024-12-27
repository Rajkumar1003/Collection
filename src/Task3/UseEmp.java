package Task3;

import java.util.ArrayList;
import java.util.List;

public class UseEmp {
	
	public void add(ArrayList<Emp> a) {
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getAge()>=25 && a.get(i).getAge()<=35) {
				System.out.println(a.get(i));
			
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 = new Emp(10000,"raj",26);
		Emp e2 = new Emp(20000,"aadhi",29);
		Emp e3 = new Emp(30000,"amuthu",24);
		Emp e4 = new Emp(40000,"sanjay",23);
		Emp e5 = new Emp(50000,"sakthi",34);
		ArrayList<Emp> a = new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		UseEmp num = new UseEmp();
		num.add(a);
		
		

	}

}
class Emp {
	private int price;
	private String name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Emp(int price, String name, int age) {
		super();
		this.price = price;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [price=" + price + ", name=" + name + ", age=" + age + "]";
	}
	
}