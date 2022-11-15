package Demo;

import java.util.Scanner;

public class Accept_input_from_user {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st number");
		int num1=scan.nextInt();
		// get enter 2nd number
		System.out.println("enter 2nd nmber");
		int num2=scan.nextInt();
		System.out.println(num1+num2);

	}

}
