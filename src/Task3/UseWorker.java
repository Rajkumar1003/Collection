package Task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseWorker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker("rahul",28,40000);
		Worker w2 = new Worker("rajesh",24,45000);
		Worker w3 = new Worker("Ankul",25,33000);
		Worker w4 = new Worker("rohit",29,20000);
		Worker w5 = new Worker("sanjana",38,24000);
		List<Worker> li = Arrays.asList(w1,w2,w3,w4,w5);
		List<Worker> ar = li.stream().filter(x->x.getSalary()>=25000).sorted()

	}

}
class Worker {
	private String name;
	private int age;
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Worker(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
