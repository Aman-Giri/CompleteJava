package inheritance;

class Animalsss{
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog2 extends Animalsss{
	void bark() {
		System.out.println("barking...");
	}
}
class Cat extends Animalsss{
	void meow() {
		System.out.println("meowing...");
	}
}

public class Heirarchical {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
	}
}
