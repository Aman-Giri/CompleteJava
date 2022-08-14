package thisKeyword;

class Student1{
	int rollno;
	String name;
	float fee;
	
	Student1(int r , String n,float f){
		rollno = r;
		name = n;
		fee = f;
	}
	
	public void display() {
		System.out.println(rollno +" "+name+" "+fee);
	}
}

public class Example11 {
	public static void main(String[] args) {
		//Still without this keyword but different names 
		//of local and instance variable
		
		Student1 s1 = new Student1(12,"Aman",4300f);
		Student1 s2 = new Student1(13,"Karan",4000f);
		
		s1.display();
		s2.display();
	}
}
