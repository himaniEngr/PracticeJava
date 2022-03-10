package abcd;

public class Sample {
	 void add(int a, int b) {
		System.out.println(a+b);
	}
	 public int sub(int a,int b) {
		 return a-b;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj =new Sample();
		obj.add(199,120);
		System.out.println(obj.sub(199, 120));
	}

}
