package Bingo;

public class Main {

	public static void main(String[] args) {
		Game game = new Game (1);
		System.out.println(game);
		while (!Game. isGameOver()) {		
		game.Tick("game");
		}
	}

}
