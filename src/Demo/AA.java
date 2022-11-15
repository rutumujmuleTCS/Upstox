package Demo;

public class AA {

	public static void main(String[] args) {
		String name="A K S H U";
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
