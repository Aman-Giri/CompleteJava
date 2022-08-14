package thisKeyword;

class Student{
	int rollno;
	String name;
	float fee;
	
	//No differentiation between between local and instance variable
	Student(int rollno,String name,float fee){
		rollno = rollno;
		name = name;
		fee = fee;
	}
	
	void display() {
		System.out.println(rollno + " "+name+" "+fee);
	}
}

public class Example10 {
	//Example without using the this keyword
	public static void main(String[] args) {
		Student s1 = new Student(111,"Aman" , 5000f);
		Student s2 = new Student(222,"Akash",4000f);
		
		s1.display();
		s2.display();
	}
}
