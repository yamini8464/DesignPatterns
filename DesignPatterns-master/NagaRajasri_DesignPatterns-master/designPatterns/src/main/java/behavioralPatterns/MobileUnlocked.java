package behavioralPatterns;

public class MobileUnlocked implements MobileState {

	public void doAction(PresentState presentState) {
		// TODO Auto-generated method stub
		System.out.println("Keys are working");
		presentState.setMobileState(this);
	}

	@Override
	public String toString() {
		return "MobileUnlocked";
	}
	
	
}
