package esg.itp.shape;

public class Rectangle implements Polygon {

	float length,breadth, area, perimeter;
	public Rectangle(int len,int bre) {
		// TODO Auto-generated constructor stub
		length=len;
		breadth=bre;
	}
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area =length * breadth;
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		perimeter = 2 * (length+breadth);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" Area of rectangle :  " + area);
		System.out.println("Perimeter of rectangle :  " + perimeter);
	}

}
