package thisKeyword;

class A{
	A(){
		System.out.println("I am a non parameterised constructor");
	}
	
	A(int x){
		//Calling default constructor from parameterized constructor:
		this();
		System.out.println("I am a parameterised constructor and my value is : "+x);
		
		
	}
}

public class Example14 {
	public static void main(String[] args) {
		//invoking current class constructor by using this keyword
		A a = new A(10);
	}
}
