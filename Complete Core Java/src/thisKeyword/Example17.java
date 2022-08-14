package thisKeyword;

class C{
	void m(C obj) {
		System.out.println("method is invoked");
	}
	void p() {
		m(this);
	}
}

public class Example17 {
	//this : to pass the argument in the method : 
	public static void main(String[] args) {
		C obj1 = new C();
		obj1.p();
	}
}
