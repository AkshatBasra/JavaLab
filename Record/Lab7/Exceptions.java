class NegativeAgeError extends Exception {
	int a;
	public NegativeAgeError(int a) {
		this.a = a;
	}
	public String toString() {
		return "Negative Age: " + a;
	}
}

class InvalidAgeError extends Exception {
	int a, b;
	public InvalidAgeError(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "Invalid Age: " + a + " is less than " + b;
	}
}

class Father {
	String name;
	int age;
	Father(String name, int age) {
		try {
			if(age < 0) {
				throw new NegativeAgeError(age);
			}
			this.name = name;
			this.age = age;
		}
		catch(NegativeAgeError e) {
			this.age = 20;
			System.out.println(e);
		}
	}
}

class Son extends Father {
	String sonName;
	int sonAge;
	Son(String sonName, int sonAge, String fatherName, int fatherAge) {
		super(fatherName, fatherAge);
		this.sonName = sonName;
		try {
			if(sonAge < 0) {
				throw new NegativeAgeError(sonAge);
			}
			if(sonAge >= fatherAge){
				throw new InvalidAgeError(sonAge, fatherAge);
			}
			this.sonAge = sonAge;
		}
		catch(NegativeAgeError e) {
			this.sonAge = 20;
			System.out.println(e);
		}
		catch(InvalidAgeError e) {
			this.sonAge = 10;
			System.out.println(e);
		}
	}
}

class Exceptions {
	public static void main(String[] args){
		System.out.println("Akshat Basra 1BM23CS020");
		Son a1 = new Son("A", 10, "B", 5);
		System.out.println("Age: " + a1.sonAge);
		Son a2 = new Son("C", -10, "D", -5);
		System.out.println("Age: " + a2.sonAge);
	}
}
