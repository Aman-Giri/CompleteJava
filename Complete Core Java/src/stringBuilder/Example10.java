package stringBuilder;

public class Example10 {
	public static void main(String[] args) {
		//Declaration of the String builder
		StringBuilder sb = new StringBuilder("Aman");
		System.out.println(sb);
		
		//Get a character from the index
		System.out.println(sb.charAt(0));
		
		//Set a char at Index
		sb.setCharAt(0, 'B');
		System.out.println(sb);
		
		//Insert a character at some Index
		sb.insert(0, 'A');
		System.out.println(sb);
		
		//Delete char at some Index
		sb.delete(0, 1);
		System.out.println(sb);
		
		//Append a char - append means adding something
		sb.append(" Giri");
		System.out.println(sb);
		
		//Length of a String
		System.out.println(sb.length());
		
		
				
	}
}
