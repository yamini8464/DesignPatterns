package creationalPatterns;

public class Creational_Factory_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape roundedSquare = shapeFactory.drawShape("RoundedSquare");
		roundedSquare.draw();
		Shape roundedRectangle = shapeFactory.drawShape("RoundedRectangle");
		roundedRectangle.draw();
		Shape rectangle = shapeFactory.drawShape("Rectangle");
		rectangle.draw();
		Shape square = shapeFactory.drawShape("Square");
		square.draw();
	}
}
