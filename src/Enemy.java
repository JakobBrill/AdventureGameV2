import java.util.Random;

public class Enemy {
    private String name;
    private int hp;
    private int damage;
    private int level;
    private int defense;
    private int agility;

    public Enemy(String name, int hp, int damage, int level, int defense, int agility) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.level = level;
        this.defense = defense;
        this.agility = agility;
    }
    public void takeDamage(int damage) {
        this.hp -= (int) ((int) damage - ((double) damage*((double) this.defense / 100)));;
        System.out.println(this.name + " took " + damage + " damage");
    }
    public void defense(int damage, int playerAgility) {
        Random ran = new Random();
        int playerVsEnemyAgility = this.agility-playerAgility;
        int random100 = ran.nextInt(99) + 1;
        if (random100 <= playerVsEnemyAgility) {
            System.out.println(this.name + " dodged the attack");
        } else {
            takeDamage(damage);
        }
    }

    public void combatStats(){
        System.out.println(this.name + " | HP: " + this.hp + " | Damage: " + this.damage + " | Agility: "
                + this.agility + " | Defense: " + this.defense + " | Level: " + this.level);
    }
    public String getName() {return name;}
    public int getHp() {return hp;}
    public int getDamage() {return damage;}
    public int getAgility() {return agility;}
}
