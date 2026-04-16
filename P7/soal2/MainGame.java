class Character {
    String name;
    int hp, attackPower;

    public Character(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower; 
    }

    public void attack(Character target) {
        System.out.println(this.name + " menyerang " + target.name + "!");
        target.receiveDamage(this.attackPower); 
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0; 
    }

    public void displayStatus() {
        System.out.println(name + " - HP: " + hp); 
    }
}

public class MainGame {
    public static void main(String[] args) {
        Character hero = new Character("Arthur", 100, 20);
        Character monster = new Character("Orc", 50, 10);

        hero.displayStatus();
        monster.displayStatus();
        
        hero.attack(monster); 
        monster.displayStatus();
    }
}