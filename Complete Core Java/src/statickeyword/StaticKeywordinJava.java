package statickeyword;


class Satudent{
	int rollno ;
	String name ;
	static String college = "BMCEM";
	
	Satudent(int r,String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno +" "+name+" " +college);
	}
}

public class StaticKeywordinJava {
	public static void main(String[] args) {
		//Example of the static variable : 
		Satudent s1 = new Satudent(23,"Aman");
		Satudent s2 = new Satudent(24,"Karan");
		
		s1.display();
		s2.display();
		
	}
}
