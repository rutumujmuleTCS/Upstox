package Demo;

import java.util.Scanner;

public class replaceall {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("user enter name");
		String name=scan.next();
		
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
			

	}

}
