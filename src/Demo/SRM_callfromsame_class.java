package Demo;

public class SRM_callfromsame_class {

	public static void main(String[] args) {
		System.out.println("main method open");
		m1();
		m2();
		
		
		System.out.println("main method close");

	}
public static void m1() {
	System.out.println("I am from same class");
}
public static void m2() {
	System.out.println("I am from same class m1");
}
}
