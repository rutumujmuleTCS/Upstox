package Demo;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 1st number");
	int num1=scan.nextInt();
	//check whether num is even or odd
	if(num1%2==0) {
		System.out.println("given num is even");
	}
	else {
		System.out.println("given num is odd");
	}
	}

}
