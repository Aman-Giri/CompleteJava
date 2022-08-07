package string;

public class Example7 {
	public static void main(String[] args) {
		//String concatenation : 
		String firstname = "Aman";
		String secondname = "Giri";
		
		String fullname = firstname + " " +  secondname;
		System.out.println(fullname);
		
		//length of the string :
		System.out.println(fullname.length());
		
		//Accessing characters of a string
		for(int i=0;i<fullname.length();i++) {
			System.out.print(fullname.charAt(i));
		}
	}
}
