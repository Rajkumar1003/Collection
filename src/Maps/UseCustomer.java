 package Maps;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer a1 = new Customer(12, "Shan", 245678986487l, 100000, 800000, "male", true);
		Customer a2 = new Customer(14, "raghu", 245676984487l, 200000, 900000, "male", false);
		Customer a3 = new Customer(13, "indhu", 245678986127l, 300000, 500000, "Female", true);
		Customer a4 = new Customer(15, "ram", 328478986487l, 600000, 400000, "male", true);
		Customer a5 = new Customer(18, "Rebecca", 245678326487l, 7000, 850000, "Female", false);
		HashMap<Long, Customer> customers = new HashMap<>();
		customers.put(a1.getAadharNumber(), a1);
		customers.put(a2.getAadharNumber(), a2);
		customers.put(a3.getAadharNumber(), a3);
		customers.put(a4.getAadharNumber(), a4);
		customers.put(a5.getAadharNumber(), a5);
		/*
		 * System.out.println(customers.get(a1.getAadharNumber()));
		 * System.out.println(a1); //customers.keySet().forEach(x->{ //);
		 * //System.out.println(x); //}); Iterator<Customer> itr =
		 * customers.values().	Q1iterator(); while(itr.hasNext()) {
		 * if(itr.next().getPurchaseAmount()<10000) { itr.remove(); } }
		 * //System.out.println(customers);
		 * customers.forEach((x,y)->System.out.println(x+" "+y)); // long max =
		 * a1.getTotalAmount(); // for(Customer x : customers.values()) { //
		 * if(x.getTotalAmount()>max) { // max = x.getTotalAmount(); // } // // } //
		 * System.out.println(max); //
		 * 
		 * // customers.values().forEach(x->{ // if(x.getGender().equals("male")) { //
		 * System.out.println(x); // } // // // }); // customers.values().forEach(y->{
		 * // if(y.getName().startsWith("S")) { // System.out.println(y); // } // });
		 * 
		 */
//		customers.keySet().forEach(x -> System.out.println(customers.get(x)));
//		customers.values().forEach(x->System.out.println(x));
		/*
		 * Customer temp =customers.get(a1.getAadharNumber()); for(Long
		 * x:customers.keySet()) { if(customers.get(x).getId() > temp.getId()) { temp =
		 * customers.get(x); } } System.out.println(temp);
		 * 
		 * Customer max = customers.get(a1.getAadharNumber()); for(Customer a :
		 * customers.values()) { if(a.getTotalAmount()>max.getTotalAmount()) { max = a;
		 * } } System.out.println(max);
		 */

		// Customer min = customers.get(a3.getAadharNumber());
//		for (Customer b : customers.values()) {
//			if (b.getName().length() % 2 == 0) {
//				// min = b;
//				System.out.println(b);
//
//			}
//		}
		
//		Customer max = customers.get(a1.getAadharNumber());
//		for(Long x : customers.keySet()) {
//			if(customers.get(x).getTotalAmount()>max.getTotalAmount()) {
//				max = customers.get(x);
//			}
//		}
//		System.out.println(max);
		
		customers.keySet().forEach(x->{
			if(customers.get(x).getGender().equals("male")) {
				System.out.println(customers.get(x).getName());
			}
		});
		
		for(Long x : customers.keySet()) {
			if(customers.get(x).getGender().equals("male")) {
				customers.get(x).setTotalAmount(customers.get(x).getTotalAmount()+customers.get(x).getTotalAmount()*10/100);
				System.out.println(customers.get(x).getTotalAmount());
			}
		}
		Iterator<Long> itr = customers.keySet().iterator();
		while(itr.hasNext()) {
			if(customers.get(itr.next()).getGender().equals("male")) {
				itr.remove();
			}
		}
		System.out.println(customers);

	}

}

class Customer {
	private int id;
	private String name;
	private long aadharNumber;
	private int purchaseAmount;
	private int totalAmount;
	private String gender;
	private boolean isOutfitAvailable;

	public void setId(int a) {
		id = a;
	}

	public int getId() {
		return id;
	}

	public void setName(String b) {
		name = b;
	}

	public String getName() {
		return name;
	}

	public void setAadharNumber(long c) {
		aadharNumber = c;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setPurchaseAmount(int d) {
		purchaseAmount = d;
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setTotalAmount(int e) {
		totalAmount = e;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setGender(String f) {
		gender = f;
	}

	public String getGender() {
		return gender;
	}

	public void setIsOutfitAvailable(boolean g) {
		isOutfitAvailable = g;
	}

	public boolean getIsOutfitAvailable() {
		return isOutfitAvailable;
	}

	public Customer(int id, String name, long aadharNumber, int purchaseAmount, int totalAmount, String gender,
			boolean isOutfitAvailable) {
		this.id = id;
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.purchaseAmount = purchaseAmount;
		this.totalAmount = totalAmount;
		this.gender = gender;
		this.isOutfitAvailable = isOutfitAvailable;
	}

	public String toString() {
		return id + " " + name + " " + aadharNumber + " " + purchaseAmount + " " + totalAmount + " " + gender + " "
				+ isOutfitAvailable;
	}
}
