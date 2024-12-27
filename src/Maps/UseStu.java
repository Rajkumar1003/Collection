package Maps;

import java.util.HashMap;

public class UseStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stu s1 = new Stu(100000,1,"raj","male",true);
		Stu s2 = new Stu(150000,2,"priya","female",false);
		Stu s3 = new Stu(200000,3,"pradeep","male",true);
		Stu s4 = new Stu(400000,4,"divya","female",false);
		Stu s5 = new Stu(550000,5,"tamil","male",true);
		HashMap<Integer,Stu> students = new HashMap<>();
		students.put(s1.getId(),s1);
		students.put(s2.getId(),s2);
		students.put(s3.getId(),s3);
		students.put(s4.getId(),s4);
		students.put(s5.getId(),s5);
		
//		for(Stu x : students.values()) {
//			if(x.getGender().equals("male")) {
//				System.out.println(x.getName());
//			}
//		}
		
//		int max = s1.getFees();
//		for(Stu x : students.values()) {
//			if(x.getFees()>max) {
//				max = x.getFees();
//			}
//		}
//		System.out.println(max);
		
//		Stu max = s1;
//		for(Integer x : students.keySet()) {
//			if(students.get(x).getFees()>max.getFees()) {
//				max = students.get(x);
//			}
//		}
//		System.out.println(max);
		
//		for(Integer x : students.keySet()) {
//			if(students.get(x).getGender().equals("male")) {
//				students.get(x).setFees(students.get(x).getFees()+students.get(x).getFees()*10/100);
//				
//			}
//		}
//		System.out.println(students);
		
		for(Integer x : students.keySet()) {
			if(students.get(x))
		}
		

	}

}
class Stu {
	private int fees;
	private int id;
	private String name;
	private String gender;
	private boolean isMale;
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Stu(int fees, int id, String name, String gender, boolean isMale) {
		super();
		this.fees = fees;
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Stu [fees=" + fees + ", id=" + id + ", name=" + name + ", gender=" + gender + ", isMale=" + isMale
				+ "]";
	}
	
}