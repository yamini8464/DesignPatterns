package behavioralPatterns;

public class PresentState {
	private MobileState mobileState;
	public PresentState() {
		this.mobileState = null;
	}

	public MobileState getMobileState() {
		return mobileState;
	}

	public void setMobileState(MobileState mobileState) {
		this.mobileState = mobileState;
	}
}
