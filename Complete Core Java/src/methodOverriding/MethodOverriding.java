package methodOverriding;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Vehicle is running safely"); //overriding
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();

	}

}
