package Demo;

import java.util.Scanner;

public class scanner_userinput {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter valid number");
		
		int num1=scan.nextInt()   ;
		
		System.out.println("enter 2nd number");
		int num2=scan.nextInt();
		System.out.println(num1+num2);

	}

}
