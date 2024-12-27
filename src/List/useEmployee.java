package List;

import java.util.ArrayList;

public class useEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("raj","male");
		Employee e2 = new Employee("prem","male");
		Employee e3 = new Employee("priya","female");
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getGender().equals("male")) {
				System.out.println(ar.get(i).getName().charAt(0));
			}
			else if(ar.get(i).getGender().equals("female")) {
				System.out.println(ar.get(i).getName().charAt(ar.get(i).getName().length()-1));
			}
		}

	}

}
class Employee {
	private String name;
	private String gender;
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
	public Employee(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + "]";
	}
	
}
