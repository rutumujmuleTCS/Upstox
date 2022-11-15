package Demo;

public class Starr {
public static void main(String[] args) {
int space=3;
int star=1;
	for(int i=1;i<=4;i++){
		for(int j=1;i<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;i<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
	
}
}
}
