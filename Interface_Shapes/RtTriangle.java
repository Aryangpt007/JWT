class RtTriangle implements Shape
{
	protected double width, height, hypotenus;
	
	RtTriangle() {
		this.width= this.height= this.hypotenus= 0.0;
	}
	RtTriangle(double width, double height) {
		this.width= width; this.height= height;
		this.hypotenus= Math.sqrt( this.width*this.width + this.height*this.height );
	}
	public double getArea() {
		return (0.5*this.width*this.height);
	}
	public double getPerimeter() {
		return (this.width+this.height+this.hypotenus);
	}
}