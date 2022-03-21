
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Software Testing";
		String output="";
		for(int i=input.length()-1; i>=0;i--) {
			output+=input.charAt(i);
		}
		System.out.println(output);

	}

}
