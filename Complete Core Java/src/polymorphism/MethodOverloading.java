package polymorphism;

class Adder{
	static int add(int a , int b) {
		return a+b;
	}
	
	static int add(int a ,int b,int c) {
		return a+b+c;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		//Method Overloading: changing no. of arguments
		System.out.println(Adder.add(3, 4));
		System.out.println(Adder.add(45, 5, 43));
	}
}
