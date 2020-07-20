package behavioralPatterns;

public class StatePatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PresentState presentState = new PresentState();
		MobileUnlocked mobileUnlocked= new MobileUnlocked();
		mobileUnlocked.doAction(presentState);
		System.out.println(presentState.getMobileState().toString());
		MobileLocked mobileLocked = new MobileLocked();
		mobileLocked.doAction(presentState);
		System.out.println(presentState.getMobileState().toString());

	}

}
