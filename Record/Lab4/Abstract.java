abstract class Figure { 
	double dim1; double dim2; 
	Figure(double a, double b){
		dim1 = a; dim2 = b;
	} 
	abstract double area();
 } 

class Rectangle extends Figure { 
	Rectangle(double a, double b){ 
		super(a, b);
	}
	double area(){ 
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}  
} 

class Triangle extends Figure {
	Triangle(double a, double b){ 
		super(a, b);
	}
	double area(){ 
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class Circle extends Figure{
	Circle(double a, double b){
		super(a, b);
	}
	double area(){
		System.out.println("Inside Area for Circle.");
		return 3.14*dim1*dim1;
	}
}

class AbstractAreas{
	public static void main(String args[]){
		System.out.println("Akshat Basra 1BM23CS020");
		// Figure f = new Figure(10, 10); // illegal now 
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Circle c = new Circle(10, 10);
		Figure figref;
		figref = r; 
		System.out.println("Area is " + figref.area());
		figref = t; 
		System.out.println("Area is " + figref.area());
		figref = c; 
		System.out.println("Area is " + figref.area());
	}
}
