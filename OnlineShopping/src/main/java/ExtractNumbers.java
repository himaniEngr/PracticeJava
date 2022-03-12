
public class ExtractNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="404 Not found error";
		String s2="200 successfully connected";
		//extract numerical part from the string
		System.out.println(s1.replaceAll("[^0-9]", ""));
		System.out.println(s2.replaceAll("[^0-9]", ""));
		
	}

}
