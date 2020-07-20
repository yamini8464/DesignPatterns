package creationalPatterns;

public class Creational_AbstractFactory_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstarctFactory factoryProducer = FactoryProducer.selectFactory(false);
		Shape rectangle = factoryProducer.drawShape("rectangle");
		rectangle.draw();
		Shape square = factoryProducer.drawShape("square");
		square.draw();
		AbstarctFactory factoryProducer1 = FactoryProducer.selectFactory(true);
		Shape roundedRectangle = factoryProducer1.drawShape("roundedRectangle");
		roundedRectangle.draw();
		Shape roundedSquare = factoryProducer1.drawShape("roundedSquare");
		roundedSquare.draw();
	}

}
