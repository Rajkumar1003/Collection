package Task3;

import java.util.Arrays;
import java.util.List;

public class UseNumberOfEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("raj");
		Employee e2 = new Employee("rahul");
		Employee e3 = new Employee("rram");
		Employee e4 = new Employee("prem");
		Employee e5 = new Employee("raghu");
		Employee e6 = new Employee("shahul");
		List<Employee> li = Arrays.asList(e1,e2,e3,e4,e5,e6);
		long count = li.stream().map(x->x.getClass()).count();
		System.out.println(count);
		

	}

}
class Employee {
	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "UseNumberOfEmployee [empName=" + empName + "]";
	}
	
}
