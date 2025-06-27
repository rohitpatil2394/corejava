package oopsjava.d4;

class Animal{
	void eat() {
		System.out.println("Aniaml is eating");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("Cat is meowing");
	}
	
}

public class hierarchicalInheritance {
	public static void main(String args[]) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		Cat c=new Cat();
		c.eat();
		c.meow();
	}

}
