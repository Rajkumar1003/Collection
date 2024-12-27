package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseEmployee6 {
	public void details(List<Employee6> a) {
		List<Employee6> val = a.stream().filter(x->x.getAge()>20).collect(Collectors.toList());
		val.forEach(x->System.out.println(x));
		
		Map<String,Long> val1 = a.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.counting()));
		val1.forEach((x,y)->System.out.println(x+"="+y));
		
		List<Integer> val2 = a.stream().map(x->x.getAge()).sorted().limit(3).collect(Collectors.toList());
		val2.forEach(x->System.out.println(x));
		
//		Map<Character,Long> n =   a.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey);
//		n.forEach((x,y)->System.out.println(x+"="+y));	
		a.stream().map(null)
		
		
				
		
		
	}

	public static void main(String[] args) {
		
		Employee6 e1 = new Employee6(50000,"raj",21);
		Employee6 e2 = new Employee6(40000,"muthu",26);
		Employee6 e3 = new Employee6(55000,"thoubik",19);
		Employee6 e4 = new Employee6(50050,"raj",20);
		Employee6 e5 = new Employee6(50040,"sriram",24);
		List<Employee6> a = Arrays.asList(e1,e2,e3,e4,e5);
		UseEmployee6 num = new UseEmployee6();
		num.details(a);
		
		
		

	}

}
class Employee6 {
	private int salary;
	private String name;
	private int age;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
	public Employee6(int salary, String name, int age) {
		super();
		this.salary = salary;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee6 [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}