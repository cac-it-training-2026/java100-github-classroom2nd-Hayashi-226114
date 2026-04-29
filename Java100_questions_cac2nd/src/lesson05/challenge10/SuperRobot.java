package lesson05.challenge10;

class Robot {
	String makeLuxuryDish(int meatNum, int potatoNum, int carrotNum, int curryNum) {

		String menu = null;

		if (meatNum >= 1 && potatoNum >= 2 && carrotNum >= 1 && curryNum >= 1) {
			menu = "カレー";
		} else {
			menu = "作れません";
		}

		return menu;
	}
}

public class SuperRobot {

	public static void main(String[] args) {

		Robot robot = new Robot();
		String result = robot.makeLuxuryDish(2, 3, 1, 1);
		System.out.println(result);
	}

}
