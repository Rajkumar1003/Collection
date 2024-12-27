package Task3;

//import java.util.Arrays;

public class UseFindSpecialCharacter {

	public static void main(String[] args) {		
		
		String a = "@123&";
		a.chars().filter(ch-> !Character.isLetterOrDigit(ch)).mapToObj(ch-> (char) ch).forEach(ch->System.out.println(ch));

	}

}
