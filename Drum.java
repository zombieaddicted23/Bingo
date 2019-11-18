package Bingo;

public class Drum {

	public static final int BALL_NUM = 90;

	private int[] balls;

	public Drum() {
		balls = new int[BALL_NUM];
		for (int i = 0; i < BALL_NUM; i++) {
			balls[i] = i + 1;
		}
	}

	public int extractBall() {

		int extractedBall;
		int randomBall = (int) (Math.random() * BALL_NUM);

		if (checkBombo()) {

			while (balls[randomBall] == 0) {
				randomBall = (int) (Math.random() * BALL_NUM);
			}
			extractedBall = balls[randomBall];
			balls[randomBall] = 0;
			return extractedBall;
		} else {
			// Game do syso
			System.out.println("No balls");
			return 0;
		}

	}

	public boolean checkBombo() {
		boolean haveBalls = false;
		for (int i = 0; i < BALL_NUM; i++) {
			if (balls[i] != 0) {
				return true;
			}
		}
		return false;
	}

}
