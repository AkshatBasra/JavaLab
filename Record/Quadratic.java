/*Develop a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, display a message stating that there are no real solutions.*/

import java.lang.Math;
import java.util.Scanner;

class Quadratic{
	int a, b, c;
	double r1, r2;
	Quadratic(){
		System.out.println("Enter a, b and c from quadratic equation: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	}
	double discriminant(){
		return b*b-4*a*c;
	}
	void compute(){
		if(discriminant() > 0){
			r1 = (-b + Math.sqrt(discriminant()))/(double)(2*a);
			r2 = (-b - Math.sqrt(discriminant()))/(double)(2*a);
			System.out.println("The roots are unique");
			System.out.println("First root: "+ r1);
			System.out.println("Second root: "+ r2);
		}
		else if(discriminant() == 0){
			r1 = -b/(2*a);
			System.out.println("The roots are equal");
			System.out.println("The root is: "+ r1);
		}
		else if(discriminant() < 0){
			r1 = -b/(2*a);
			r2 = (-b + Math.sqrt(-discriminant()))/(double)(2*a);
			System.out.println("The roots are Imaginary");
			System.out.println("First root: "+ r1 + "+i" + r2);
			System.out.println("Second root: "+ r1 + "-i" + r2);

		}
	}
}


class Run{
	public static void main(String[] args){
		Quadratic eq1 = new Quadratic();
		eq1.compute();
		Quadratic eq2 = new Quadratic();
		eq2.compute();
		Quadratic eq3 = new Quadratic();
		eq3.compute();
	}
}