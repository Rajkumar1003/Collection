package Maps;
import java.util.HashMap;
public class UsekeysValues {
	
	public static void main(String[] args) {
		HashMap<Integer,String> a = new HashMap<>();
		a.put(1456,"rj");
		a.put(1234,"ram");
		a.put(1567,"gokul");
		a.put(1678,"raghu");
		//for(Integer x: a.keySet()) {
			//System.out.println(x);
		//}
		//for(String c : a.values()) {
			//System.out.println(c);
		//}
		//for(Integer z : a.keySet()) {
			//System.out.println(z+" "+a.get(z));
		//}
		//a.forEach((x,y)->System.out.println(x+" "+y));
		//a.keySet().forEach(x->System.out.println(x));
		//a.values().forEach(y->System.out.println(y));
		a.keySet().forEach(x->{
			if(x%2!=0) {
				System.out.println(x);
				
			}
			
			
		});
		for(String x : a.values()) {
			if(x.contains("a") || x.contains("e") || x.contains("i") || x.contains("e") || x.contains("u")){
				System.out.println(x);
				
			}
				
			}
		//Integer max = a;
			
		}
	}


