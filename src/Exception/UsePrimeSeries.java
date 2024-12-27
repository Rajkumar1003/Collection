package Exception;

public class UsePrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tem t1 = a->{
			for(int i=2;i<=a;i++) {
				boolean isPrime = true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
					isPrime = false;
				}
			}
			if(isPrime==true) {
				System.out.println(i+" prime");
			}
			else {
				System.out.println(i+"not a prime");
			}
		}

	};
	t1.prime(11);
	
	}

}
interface Tem {
	public void prime(int a);
}