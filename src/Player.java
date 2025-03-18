import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int hp;
    private int defense;
    private String armor;
    private int agility;
    private String boots;
    private Weapon bow;
    private Weapon sword;
    private int healthPotions;
    private int level;


    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.defense = 10;
        this.armor = "Leather armor";
        this.agility = 10;
        this.boots = "Leather boots";
        this.bow = new Weapon("Wood Bow", 2, true,20);
        this.sword = new Weapon("Toothpick Sword", 5, 15);
        this.healthPotions = 0;
        this.level = 1;
    }

    public void useHealthPotions() {
        if (healthPotions > 0) {
            if (this.hp == 100) {
                System.out.println(this.name + " is already at 100 Hp");
            } else {
                this.healthPotions--;
                this.hp += 25;
                if (this.hp > 100) {
                    this.hp = 100;
                }
                System.out.println(this.name + " used a health potions and is now at " + this.hp + " Hp.");
            }
        } else {

            System.out.println(this.name + " doesnt has 0 health potion");
        }
    }

    public void calculateLevel() {
        this.level = (int)((sword.getCounterattack() / 3) + sword.getDamage() + this.agility + this.defense)/20;
        System.out.println(this.name + " level is now " + this.level);
    }

    public void getStats() {
        System.out.println("---------------------------------Stats---------------------------------------");
        System.out.println("Level: " + this.level);
        System.out.println("Hp: " + this.hp);
        System.out.println("Armor: " + this.armor + " (" + this.defense + "% damage reduction)");
        System.out.println("Boots: " + this.boots + " (" + this.agility + " agility)");
        System.out.println("Sword: " + this.sword.getName() + " (" + this.sword.getDamage() + " damage / "
                + this.sword.getCounterattack() + "% chance for a counterattack)");
        System.out.println("Bow: " + this.bow.getName() + " (" + this.bow.getDamage() + " damage / "
                + this.bow.getArrows() + " arrows)");
        System.out.println("Health Potions: " + this.healthPotions);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public void combatStats(){
        System.out.println(this.name + " | HP: " + this.hp + " | Damage (Sword): " + sword.getDamage() + " | Agility "
                + this.agility + " | Defense: " + this.defense);
    }

    public void takeDamage(int damage) {
        int calcDamage = (int) ((int) damage - ((double) damage*((double) this.defense / 100)));;
        this.hp -= calcDamage;
        System.out.println(this.name + " took " + calcDamage + " damage"+ " (Damage reduction: " + this.defense + "%))");
        if (this.hp <= 0) {
            System.out.println(this.name + " died");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }
    //returns true if counterattack hit
    public boolean defense(int damage, int enemyAgility) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);

        boolean invalidInput = true;

        while (invalidInput) {

            System.out.println("(1) Dodge");
            System.out.println("(2) Counterattack");

            int action = in.nextInt();
            switch (action) {
                case 1: {
                    //Better otts for Player more rewarding Gameplay
                    int playerVsEnemyAgility = this.agility - enemyAgility;
                    if (playerVsEnemyAgility <= 10) {
                        playerVsEnemyAgility = 10;
                    }
                    int random50 = ran.nextInt(39) + 1;
                    if (random50 < playerVsEnemyAgility) {
                        System.out.println(this.name + " dodged the attack");
                    } else {
                        System.out.println(this.name + " couldn't dodge the attack");
                        takeDamage(damage);
                    }
                    invalidInput = false;
                    return false;

                }
                case 2: {
                    int random100 = ran.nextInt(49) + 1;
                    if (random100 < sword.getCounterattack()) {
                        System.out.println(this.name + " counterattacked successfully");
                        return true;
                    } else {
                        System.out.println(this.name + " counterattacked unsuccessfully");
                        takeDamage(damage);
                        invalidInput = false;
                        return false;
                    }
                }
                default: {
                    System.out.println("invalid input");
                    invalidInput = true;
                    break;
                }
            }
        }
        return false;

    }

    public Weapon getBow() {return this.bow;}
    public Weapon getSword() {return sword;}
    public int getAgility() {return this.agility;}
    public int getHp() {return this.hp;}
    public String getName(){return this.name;}
    public String getArmor(){return this.armor;}
    public int getDefense() {return this.defense;}
    public String getBoots() {return this.boots;}
    public void setBoots(String name){
        this.boots = name;
    }
    public void setArmor(String name){
        this.armor = name;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    public void setAgility(int agility){
        this.agility = agility;
    }
    public void addHealthPotions(int healthPotions){
        this.healthPotions += healthPotions;
    }

}
