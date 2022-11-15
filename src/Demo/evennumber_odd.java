package Demo;

import java.util.Scanner;

public class evennumber_odd {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter number");
	int num=scan.nextInt();
	if(num%2==0) {
		System.out.println("num is even");
		
	}
	else {
		System.out.println("num is odd");
	}
}
}
