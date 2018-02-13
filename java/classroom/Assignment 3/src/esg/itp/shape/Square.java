package esg.itp.shape;

public class Square implements Polygon {
	float side, area, perimeter;

	public Square(float side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = side * side;

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		perimeter = 4 * side;

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" Area of square :  " + area);
		System.out.println("Perimeter of square :  " + perimeter);
	}

}
