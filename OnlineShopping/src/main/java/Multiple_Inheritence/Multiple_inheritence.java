package Multiple_Inheritence;

interface i1{
	void show();
}
interface i2{
	void display();
}
public class Multiple_inheritence implements i1,i2{
	public void show() {
		System.out.println("1");
	}
	public void display() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		Multiple_inheritence m=new Multiple_inheritence();
		m.show();
		m.display();
	}
}
