package Demo;

import java.util.Scanner;

public class replacestring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String name=scan.next();
		String correctname=name.replace("#","r");
		System.out.println(correctname);
	}

}
