package hcl;

public class Swapvalue_withoutusing_ThridVariable {
	public static void main(String[] args) {
		int a=12,b=24;
		System.out.println("Orignial Value");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap Value");
		System.out.println(a);
		System.out.println(b);
	}

}
