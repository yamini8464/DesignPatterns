package creationalPatterns;

public class ShapeForNormalShapes extends AbstarctFactory {

	@Override
	Shape drawShape(String shapeName) {
		// TODO Auto-generated method stub
		if(shapeName.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		if(shapeName.equalsIgnoreCase("square"))
			return new Square();
		return null;
	}

}
