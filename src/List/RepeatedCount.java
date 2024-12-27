package List;

public class RepeatedCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "rajkumar";
		char []arr = name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]='$';
					count++;
				}
				
			}
			if(arr[i]!='$') {
				System.out.println(arr[i]+" "+count);
			}
		}
		

	}

}
