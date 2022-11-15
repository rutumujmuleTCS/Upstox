package Demo;

public class swapping {

	public static void main(String[] args) {
		//int a=10;
		//int b=20;
		//without using 3rd variable
		System.out.println("before swapping");
	/*	a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:"+a+"and+"+b);*/
		//with using 3rd variable
		int a=10;
		int b=20;
		int c=a;
		a=b;
		b=c;
		System.out.println("after swapping:"+a+"and"+b);
	}

}
