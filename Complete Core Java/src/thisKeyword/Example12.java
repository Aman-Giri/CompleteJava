package thisKeyword;

class Student3{
	int rollno;
	String name;
	float fee;
	
	Student3(int rollno,String name,float fee){
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	public void display() {
		System.out.println(this.rollno + " " + this.name + " "+ this.fee);
	}
}

public class Example12 {
	//Using this keyword to diff instance and the local variable
	public static void main(String[] args) {
		Student3 s1 = new Student3(222,"Aman",4500f);
		Student3 s2 = new Student3(333,"Karan",5000f);
		
		s1.display();
		s2.display();
	}
}
