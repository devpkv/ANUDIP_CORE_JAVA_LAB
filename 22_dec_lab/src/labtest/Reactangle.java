package labtest;

public class Reactangle {

	private double length;
	private double breadth;
	
	public Reactangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public double area()
	{
		return this.length * this.breadth;
	}
	
	public double perimeter()
	{
		return 2 * ( this.length + this.breadth );
	}
	
	
	
}
