package creationalPatterns;

public class ShapeFactory {
	public Shape drawShape(String shapeName) {
		if(shapeName.equalsIgnoreCase("roundedRectangle"))
			return new RoundedRectangle();
		if(shapeName.equalsIgnoreCase("roundedSquare"))
			return new RoundedSquare();
		if(shapeName.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		if(shapeName.equalsIgnoreCase("square"))
			return new Square();
		return null;
	}
}
