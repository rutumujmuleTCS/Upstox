package Practice;

public class if_else_ladder {

	public static void main(String[] args) {
		int mark=90;
		if(mark>=85) {
			System.out.println("passe with distinction");
		}
		else if(mark>=70) {
			System.out.println("passed with 2nd class");
			
		}
		else if(mark>=50) {
			System.out.println("passe");
		}
		else {
			System.out.println("fail");
		}
	}

}
