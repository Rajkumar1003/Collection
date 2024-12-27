package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(10,"ram","male",true);
		Student s2 = new Student(15,"banu","female",false);
		Student s3 = new Student(20,"pre","male",true);
		Student s4 = new Student(30,"indhu","female",false);
		Student s5 = new Student(25,"tharsika","female",false);
		HashMap<Integer,Student> stu1 = new HashMap<>();
		stu1.put(s1.getId(),s1);
		stu1.put(s2.getId(),s2);
		stu1.put(s3.getId(),s3);
		stu1.put(s4.getId(),s4);
		stu1.put(s5.getId(),s5);
//		 int max = s1.getId();
//		 for(Student x : stu1.values()) {
//			 if(x.getId()>max) {
//				 max = x.getId();
//			 }
//		 }
//		 System.out.println(max);
//		
//		Student max = stu1.get(s1.getId());
//		for(Integer x : stu1.keySet()) {
//			if(stu1.get(x).getId()>max.getId()) {
//				max = stu1.get(x);
//			}
//		}
//		System.out.println(max);
		
		//map to map
		
//		HashMap<Integer,Student> a = new HashMap<>();
//		stu1.forEach((x,y)->{
//			a.put(x,y);
//			
//		});
//		System.out.println(a);
		
		//map to list
//		ArrayList<Student> b = new ArrayList<>();
//		stu1.values().forEach(x->{
//			if(x.getName().length()>5) {
//				b.add(x);
//			}
//		});
//		System.out.println(b);
//		ArrayList<Student> b = new ArrayList<>();
//		stu1.keySet().forEach(x->{
//			if(stu1.get(x).getId()>20) {
//				b.add(stu1.get(x));
//			}
//		});
//		System.out.println(b);
		
		//iterator
//		 Iterator<Student> itr = stu1.values().iterator();
//		 while(itr.hasNext()) {
//			 if(itr.next().getGender().equals("male")) {
//				 itr.remove();
//			 }
//		 }
//		 System.out.println(stu1);
		
		stu1.keySet().forEach(x->{
			if(stu1.get(x).getName().length()%2==0) {
				int index = stu1.get(x).getName().length()/2;
				System.out.println(stu1.get(x).getName().charAt(index)+ ""+stu1.get(x).getName().charAt(index+1));
			}
		});
	
		
		
		
		

	}

}
class Student {
	private int id;
	private String name;
	private String gender;
	private boolean isMale;
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
	public Student(int id, String name, String gender, boolean isMale) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", isMale=" + isMale + "]";
	}
	
}
