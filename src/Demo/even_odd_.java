package Demo;

import java.util.Scanner;

public class even_odd_ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("give number");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
