package statickeyword;

class Sattudent{
	int rollno ;
	String name;
	static String college = "HMR";
	
	static void change() {
		college = "BMCEM";
	}
	
	Sattudent(int r , String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class StaticKeywordExample4 {
	public static void main(String[] args) {
		Sattudent.change();
		Sattudent s1 = new Sattudent(23,"Aman Giri");
		Sattudent s2 = new Sattudent(24,"Karan");
		
		s1.display();
		s2.display();
	}
}
