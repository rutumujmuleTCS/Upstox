package Demo;

import java.util.Scanner;

public class even_odd__ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("user enter number");
		int num=scan.nextInt();
		if(num%2== 0){
			System.out.println("given num is even");
			
		}
		else {
			System.out.println("odd");
		}
		

	}

}
