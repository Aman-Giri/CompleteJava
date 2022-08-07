package variables;

public class Example1 {
	
	static int m = 100; //static variable
	int data = 200; // instance variable
	
	public void function() {
		int t = 900; // local variable
		System.out.println(t);
	}
	public static void main(String[] args) {
		Example1 obj = new Example1();
		System.out.println(obj.data);
		System.out.println(m);
		obj.data = 500;
		System.out.println(obj.data);
		
		Example1 obj1 = new Example1();
		System.out.println(obj1.data); //instance specific : means it will print 
									   //initially declared instance variable
		
		
		obj.function();
		
	}
}
