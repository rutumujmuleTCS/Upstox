package Demo;

import java.util.Scanner;

public class replace_string {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String name=scan.next();
		String correctname=name.replace("%", "R");
		System.out.println(correctname);
	}

}
