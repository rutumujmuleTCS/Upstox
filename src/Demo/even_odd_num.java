package Demo;

import java.util.Scanner;

public class even_odd_num {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter valid number");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("given num is even");
		}
		else {
			System.out.println("given string is odd");
		}
	}

}
