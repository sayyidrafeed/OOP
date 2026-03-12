class GameConstants {
    public static final int MAX_LIVES = 10;
    public static final int MAX_LEVEL = 100;
}

class Player {
    private int lives = GameConstants.MAX_LIVES;
    private int level = 23;

    public void levelUp() {
        if (level < GameConstants.MAX_LEVEL) {
            level++;
            System.out.println("Level kamu naik! Sekarang Levelmu: " + level);
        }
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println("Kamu kehilangan nyawa! Nyawa yang tersisa: " + lives);
        }
    }
}

public class GameApp {
    public static void main(String[] args) {
        Player p = new Player();
        p.loseLife();
        p.levelUp();
    }
}