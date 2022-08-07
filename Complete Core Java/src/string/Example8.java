package string;

public class Example8 {
	
	//COMPARISON OF STRINGS USING DIFFERENT OPERATORS
	public static void main(String[] args) {
		String name1 = "Aman";
		String name2 = "Aman";
		
		//comparison based on ascii value
		//Like hello > cello
		//1. s1>s2 : +ve value
		//2. s1==s2 : 0;
		//3. s1<s2 : -ve value
		
		//Using comparison operator :
		if(name1.compareTo(name2) == 0) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("String are not equal ");
		}
		
		//Using == operator (it will not check ascii character)
		 //DO NOT USE == to check for string equality
	       //Gives correct answer here
	       if(name1 == name2) {
	           System.out.println("They are the same string");
	       } else {
	           System.out.println("They are different strings");
	       }

	     //Gives incorrect answer here
	       if(new String("Aman") == new String("Aman")) {
	           System.out.println("They are the same string");
	       } else {
	           System.out.println("They are different strings");
	       }

	}
}
