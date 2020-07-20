package creationalPatterns;

public class FactoryProducer {
	public static AbstarctFactory selectFactory(boolean rounded) {
		if(rounded)
			return new RoundedShapesFactory();
		return new ShapeForNormalShapes();
	}
}