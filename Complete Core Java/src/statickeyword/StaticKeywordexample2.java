package statickeyword;

class Counter{
	int count = 0; // will get memory each time when the instance is created  
	
	Counter(){
		count++;
		System.out.println(count);
	}
}

public class StaticKeywordexample2 {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
}
