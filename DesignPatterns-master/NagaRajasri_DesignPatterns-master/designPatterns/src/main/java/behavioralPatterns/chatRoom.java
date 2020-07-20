package behavioralPatterns;

import java.util.Date;

public class chatRoom {
	public static void showMessage(Pilot pilot, String msg) {
	      System.out.println(new Date().toString() + " [" + pilot.getName() + "] : " + msg);
	}
}
