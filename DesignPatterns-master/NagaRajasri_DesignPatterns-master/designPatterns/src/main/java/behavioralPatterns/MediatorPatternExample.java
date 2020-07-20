package behavioralPatterns;

public class MediatorPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilot kiran = new Pilot("Kiran");
		Pilot raju = new Pilot("Raju");
		kiran.sendMessage("Hi Raju! I am 10 km away from Singapore");
		raju.sendMessage("Hi Kiran! I am 40 km away from Singapore");
	}

}
