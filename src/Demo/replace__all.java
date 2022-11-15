package Demo;

import java.util.Scanner;

public class replace__all {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String name=scan.next();
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
		

	}

}
