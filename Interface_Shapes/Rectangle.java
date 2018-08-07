class Rectangle implements Shape
{
	protected double width, height;
	
	Rectangle() {
		this.width= this.height= 0.0;
	}
	Rectangle(double width, double height) {
		this.width= width; this.height= height;
	}
	public double getArea() {
		return (this.width*this.height);
	}
	public double getPerimeter() {
		return (2*(this.width+this.height));
	}
}