package Star_pattern;

public class Space_in_middle {

	public static void main(String[] args) {
		System.out.println("rutuja");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||i==3||j==1||j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
