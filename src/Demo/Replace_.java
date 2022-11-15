package Demo;

import java.util.Scanner;

public class Replace_ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String name=scan.next();
		String correctname=name.replace("*","R");
		System.out.println(correctname);
			

	}

}
