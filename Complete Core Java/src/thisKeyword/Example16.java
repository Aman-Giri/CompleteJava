package thisKeyword;

class Data {
	int age;
	String name;
	String course;
	float fee;
	
	Data(int age,String name,String course){
		this.age = age;
		this.name = name;
		this.course = course;
	}
	Data(int age,String name,String course,float fee){
		//note : reuse the constructor first other it will give the CT error
		this(age,name,course); //reusing constructor - by this keyword 
		this.fee = fee;
	}
	
	void display() {
		System.out.println(age +" "+name+" "+course+" "+fee);
	}
}

public class Example16 {
	//reusing the constructor : this is called constructor chaining
	public static void main(String[] args) {
		Data d = new Data(24,"Aman Giri","Computer Science");
		Data d2 = new Data(24,"Karan Sanwal","BCA",4000f);
		d.display();
		d2.display();
	}
}
