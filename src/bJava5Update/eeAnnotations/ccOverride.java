package bJava5Update.eeAnnotations;

class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	/* Dengan menggunakan @Override kita memberitahukan java compiler bahwa kita berniat mengoverride method eatSomething(),
	   dan jika terdapat kesalahan dalam proses overridenya, 
	   compiler akan memberikan peringatan “method does not override or implement a method from a supertype ”.*/
	
	@Override
	void eatSomething() {
		System.out.println("eating foods");
	}// should be eatSomething
}

class ccOverride {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.eatSomething();
	}
}