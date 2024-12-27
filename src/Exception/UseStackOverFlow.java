package Exception;

public class UseStackOverFlow {
	public void get() {
		System.out.println("raj");
		get();
	}
	public static void main(String[] args) {
		UseStackOverFlow t1 = new UseStackOverFlow();
		t1.get();
		
		
		
		
		
		
	}

}
