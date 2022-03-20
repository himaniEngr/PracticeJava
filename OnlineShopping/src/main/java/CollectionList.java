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
		l.add(2,15);
		System.out.println(l);
		l.remove(3);
		l.iterator();
		System.out.println(l);
		
		List l1=new ArrayList();
		l1.addAll(l);
		System.out.println(l1);
		Boolean b=l1.contains("mango");
		System.out.println(b);
		l1.clear();
		System.out.println(l1);
		List l2=new ArrayList();
		Boolean b1=l1.equals(l2);
		System.out.println(b1);
	}

}
