package homework3;

public class Game {
    public static void main(String[] args) {
        GameProcess gameProcess = new GameProcess();
        new Player1(gameProcess);
        new Player2(gameProcess);
    }
}

