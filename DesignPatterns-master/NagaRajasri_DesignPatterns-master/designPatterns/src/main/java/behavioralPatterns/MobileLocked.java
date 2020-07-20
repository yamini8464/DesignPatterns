package behavioralPatterns;

public class MobileLocked implements MobileState{
	
	public void doAction(PresentState presentState) {
		// TODO Auto-generated method stub
		System.out.println("Keys will not work");
		presentState.setMobileState(this);
	}

	@Override
	public String toString() {
		return "MobileLocked";
	}
	
}
