package org.csystem.math.geometry;

public class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double a1, double b1, double a2, double b2) //İleride gizleyeceğiz
	{
		return new Complex(a1 + a2, b1 + b2);
	}
	
	public static Complex subtract(double a1, double b1, double a2, double b2) //İleride gizleyeceğiz
	{
		return add(a1, b1, -a2, -b2);
	}
	
	public static Complex multiply(double a1, double b1, double a2, double b2) //İleride gizleyeceğiz
	{
		return new Complex(a1 * a2 - b1 * b2, a1 * b2 + a2 * b1);		
	}
	
	public static Complex divide(double a1, double b1, double a2, double b2) //İleride gizleyeceğiz
	{
		double val = 1 / getNorm(a2, -b2);
		Complex z = multiply(a1, b1, a2, -b2);
		
		return multiply(val, z);		
	}
	
	public Complex()
	{
		
	}
	
	public Complex(double a)
	{
		real = a;
	}
	
	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}

	public static double getNorm(double a, double b) //İleride bunu gizleyeceğiz
	{
		return Math.sqrt(a * a + b * b);
	}
	
	public double getLength()
	{
		return getNorm();
	}
	
	public double getNorm()
	{
		return getNorm(real, imag);
	}
	
	public Complex getConjugate()
	{
		Complex z = new Complex();
		
		z.real = real;
		z.imag = -imag;
		
		return z;
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}

	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(real, imag, other.real, other.imag);
	}
	
	public Complex multiply(double val)
	{
		return multiply(real, imag, val, 0);
	}
	
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.real, z.imag);
	}

	public Complex divide(Complex other)
	{
		return divide(real, imag, other.real, other.imag);
	}
	
	public Complex divide(double val)
	{
		return divide(real, imag, val, 0);
	}
	
	public static Complex divide(double val, Complex z)
	{
		return divide(val, 0, z.real, z.imag);
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", real, imag);
	}
}