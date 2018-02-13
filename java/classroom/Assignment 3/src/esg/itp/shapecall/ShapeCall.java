package esg.itp.shapecall;

import esg.itp.shape.*;

public class ShapeCall {
	
	public static void main(String args[])
	{
		Square sq= new Square(3f);
		Rectangle r=new Rectangle(4,3);
		sq.calcArea();
		sq.calcPeri();
		sq.display();
		r.calcArea();
		r.calcPeri();
		r.display();
	}
	

}
