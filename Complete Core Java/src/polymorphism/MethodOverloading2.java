package polymorphism;

class Adder1{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		//Method Overloading: changing data type of arguments
		System.out.println(Adder1.add(23, 43));
		System.out.println(Adder1.add(23.43, 34.54));
	}

}
