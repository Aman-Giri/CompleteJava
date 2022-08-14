package thisKeyword;

class B{
	B(){
		this(10);
		System.out.println("I am default constructor");
	}
	
	B(int x){
		System.out.println("I am paramterised constructor and my value is :" + x);
	}
}

public class Example15 {
	public static void main(String[] args) {
		//calling paramterised constructor from default constructor
		B b = new B();
	}
}
