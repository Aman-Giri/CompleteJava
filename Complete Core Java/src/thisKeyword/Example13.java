package thisKeyword;

class Anotherclass{
	void m() {
		System.out.println("this is the m method called");
	}
	void n() {
		System.out.println("this is the n method called");
		this.m();
	}
}

public class Example13 {
	//Invoking current class method by using this keyword
	public static void main(String[] args) {
		Anotherclass obj = new Anotherclass();
		obj.n();
	}
}
