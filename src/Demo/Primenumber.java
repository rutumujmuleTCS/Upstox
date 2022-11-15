package Demo;

public class Primenumber {

	public static void main(String[] args) {
		int num=19;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("given string is prime");
		}
		else {
			System.out.println("given strine is not prime");
		}

	}

}
