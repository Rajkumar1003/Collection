package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("ganesh",100000,"tcs");
		Employee e2 = new Employee("shivan",200000,"cts");
		Employee e3 = new Employee("ramu",300000,"wipro");
		HashMap<Integer,Employee> a = new HashMap<>();
		a.put(e1.getPrice(), e1);
		a.put(e2.getPrice(), e2);
		a.put(e3.getPrice(), e3);
		//a.values().forEach(x->System.out.println(x.getName().toUpperCase()));
		//a.keySet().forEach(y->System.out.println(y));
		
//		int max = e1.getPrice();
//		for(Employee x : a.values()) {
//			if(x.getPrice()>max) {
//				max = x.getPrice();
//			}
//		}
//		System.out.println(max);
		
//		Employee max = a.get(e1.getPrice());
//		for(Integer x : a.keySet()) {
//			if(a.get(x).getPrice()>max.getPrice()) {
//				max = a.get(x);
//			}
//		}
//		System.out.println(max);
		
		//map to list
		
		ArrayList<Employee> listEmployee = new ArrayList<>();
		a.values().forEach(x->{
			listEmployee = a.put(x.getPrice(), x);
			
		
			
		});
		
	}
}
class Employee {
	private String name;
	private int price;
	private String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Employee(String name, int price, String company) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
	
}