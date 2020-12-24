package homework3;

public class Player1 implements Runnable {
    GameProcess gameProcess;

    public Player1(GameProcess gameProcess) {
        this.gameProcess = gameProcess;
        new Thread(this, "Player1").start();
    }


    @Override
    public void run() {
        while(true) {
            gameProcess.ping();
        }
    }
}
