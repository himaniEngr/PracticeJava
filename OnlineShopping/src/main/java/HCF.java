
public class HCF {
	public int HCF(int a,int b){
		if(b==0){
		return a;
		}
		return HCF(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCF hcf=new HCF();
		int num=hcf.HCF(20,40);
		System.out.println(num);
	}

}
