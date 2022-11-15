package Demo;

import java.util.Scanner;

public class replace_char {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num1");
		String name=scan.next();
		String correct6name=name.replace("@","R");
		System.out.println(correct6name);
	}

}
