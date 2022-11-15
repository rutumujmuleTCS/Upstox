package Demo;

public class Remove_white_spaces {

	public static void main(String[] args) {
		String name="R U T U J A";
		int count=0;
		for(int i=0;i<=name.length()-1;i++) {
			char v=name.charAt(i);
			if(v== ' ') {
			count++;
			}
			}
		System.out.println(count);

	}

}
