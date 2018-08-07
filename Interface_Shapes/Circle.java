class Circle implements Shape
{
	protected double radius;
	
	Circle() {
		this.radius= 0.0;
	}
	Circle(double radius) {
		this.radius= radius;
	}
	public double getArea() {
		return (3.1415*this.radius*this.radius);
	}
	public double getPerimeter() {
		return (2*3.1415*this.radius);
	}
}