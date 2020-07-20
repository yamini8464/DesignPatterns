package creationalPatterns;

public class RoundedShapesFactory extends AbstarctFactory {

	@Override
	Shape drawShape(String shapeName) {
		// TODO Auto-generated method stub
		if(shapeName.equalsIgnoreCase("roundedRectangle"))
			return new RoundedRectangle();
		if(shapeName.equalsIgnoreCase("roundedSquare"))
			return new RoundedSquare();
		return null;
	}

}
