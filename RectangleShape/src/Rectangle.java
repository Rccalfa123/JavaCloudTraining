//Rectangle properties and Behaviours
public class Rectangle {
  
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth)
	{
		if(length>0 && breadth>0)
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double area()
	{
		double area = length * breadth;
		return area;
	}
	
}
