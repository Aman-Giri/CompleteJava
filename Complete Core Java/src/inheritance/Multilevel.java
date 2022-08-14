package inheritance;

class Animalss{
	void eat() {
		System.out.println("Eating..");
	}
}
	class Dog1 extends Animalss{
		void bark() {
			System.out.println("barking...");
		}
	}
	class BabyDog extends Dog1{
		void weep() {
			System.out.println("weeping...");
		}
	}


public class Multilevel {
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.weep();
		
	}
}
