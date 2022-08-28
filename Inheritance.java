class Animal { // parent class
	int numberOfLegs;

	void eat() {
		System.out.println("Animal eats");
	}

	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Dog extends Animal { // child class
	String breed;
	void bark(){
		System.out.println("Dog barks");
	}
}

class cat extends Animal { // child class
	boolean isCute;
	void meow() {
		System.out.println("cat meows");
	}
}

public class Inheritance {
	public static void main(String args[]) {
	Dog d = new Dog();
	d.bark();
	d.sleep();
	}
}


class Account {
	int balance;
	int account_number;

	int deposit() {

	}

	int withdraw() {
	}

}

class SavingsAccount extends Account {

}

class currentAccount extends Account {
	
}





















