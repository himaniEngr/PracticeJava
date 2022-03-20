import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(5);
		l.add("apple");
		System.out.println(l);
		l.add(1, "mango");
		System.out.println(l);
	}

}
