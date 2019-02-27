
import java.util.Scanner;

public class Week7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first complex number: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		Complex c1 = new Complex(a, b);

		System.out.print("Enter the second complex number: ");
		double c = input.nextDouble();
		double d = input.nextDouble();
		Complex c2 = new Complex(c, d);

		System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
		System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
		System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
		System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
		System.out.println("|" + c1 + "| = " + c1.abs());

		Complex c3 = (Complex) c1.clone();
		System.out.println(c1 == c3);
		System.out.println(c3.getRealPart());
		System.out.println(c3.getImaginaryPart());
		Complex c4 = new Complex(4, -0.5);
		Complex[] list = {c1, c2, c3, c4};
		java.util.Arrays.sort(list);
		System.out.println(java.util.Arrays.toString(list));
	}
}

class Complex extends Number implements Comparable<Complex>, Cloneable {

	private double rp;
	private double ip;

	public Complex() {
		rp = 0;
		ip = 0;
	}

	public Complex(double a, double b) {
		rp = a;
		ip = b;
	}

	public Complex(double a) {
		rp = a;
		ip = 0;
	}

	public Complex add(Complex c2) {
		double a, b;
		a = rp + c2.rp;
		b = ip + c2.ip;
		return new Complex(a, b);
	}

	public Complex subtract(Complex c2) {
		double a, b;
		a = rp - c2.rp;
		b = ip - c2.ip;
		return new Complex(a, b);
	}

	public Complex multiply(Complex c2) {
		double a, b;
		a = (rp*c2.rp) - (ip * c2.ip);
		b = (ip *c2.rp) + (rp * c2.ip);
		return new Complex(a,b);
	}

	public Complex divide(Complex c2) {
		double a, b, c;
		c = (c2.rp * c2.rp) + (c2.ip * c2.ip);
		a = ((rp*c2.rp) + (ip * c2.ip)) / c;
		b = ((ip*c2.rp) - (rp * c2.ip)) / c;
		return new Complex(a,b);
	}

	public double abs() {
		return Math.sqrt((rp * rp) + (ip * ip));
	}

	public double getRealPart() {
		return rp;
	}

	public double getImaginaryPart() {
		return ip;
	}

	@Override
	public int compareTo(Complex c2) {
		if (abs() < c2.abs()) {
			return -1;
		} else if (abs() > c2.abs()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		if (ip != 0) {
			return rp + " + " + ip + "i";
		}
		else {
			return rp + "";
		}
	}
	
	public Complex clone(){
		return new Complex(rp, ip);
	}
	
	@Override
	public double doubleValue(){
		return abs();
	}
	
    @Override // Implement the abstract intValue method in Number 
    public int intValue() {
	return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number 
    public float floatValue() {
	return (float) doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
	return (long) doubleValue();
	}
	
}
