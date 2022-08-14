package inheritance;

//Hybrid Inheritance : 
//Hybrid means consist of more than one. 
//Hybrid inheritance is the combination of two or more types of inheritance.

class GrandFather{
	public void show1() {
		System.out.println("I am a grandfather");
	}
}

class Father extends GrandFather{
	public void show2() {
		System.out.println("I am a father");
	}
}

class Son extends Father{
	public void show3() {
		System.out.println("I am a son");
	}
}

class Daughter extends Father{
	public void show4() {
		System.out.println("I am a daughter");
	}
}

public class Hybrid {
	public static void main(String[] args) {
		Daughter obj = new Daughter();
		obj.show1();
		obj.show2();
		obj.show4();
	}
}
