// Enemy.java
abstract class Enemy {
    public abstract void attack();
}

// Zombie.java
class Zombie extends Enemy {
    @Override
    public void attack() {
        System.out.println("Zombie menyerang dengan menggigit!");
    }
}

// Pocong.java
class Pocong extends Enemy {
    @Override
    public void attack() {
        System.out.println("Pocong menyerang dengan menyemburuit!");
    }
}

// Burung.java
class Burung extends Enemy {
    @Override
    public void attack() {
        System.out.println("Burung menyerang dengan mencakar!");
    }
}

// MainGame.java
public class MainGame {
    public static void main(String[] args) {
        // Create array of enemies
        Enemy[] musuh = {
            new Zombie(),
            new Pocong(),
            new Burung(),
            new Zombie() // Adding another zombie for variety
        };
        
        // Loop through enemies and call attack method
        System.out.println("Serangan musuh:");
        for (Enemy e : musuh) {
            e.attack();
        }
    }
}