package homework3;

public class Player2 implements Runnable{
    GameProcess gameProcess;

    public Player2(GameProcess gameProcess) {
        this.gameProcess = gameProcess;
        new Thread(this, "Player2").start();
    }


    @Override
    public void run() {
        while(true) {
            gameProcess.pong();
        }
    }
}
