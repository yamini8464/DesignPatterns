package behavioralPatterns;

public class Pilot {
	private String name;
	public Pilot(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sendMessage(String msg) {
		chatRoom.showMessage(this, msg);
	}
}
