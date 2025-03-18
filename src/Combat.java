import java.util.Scanner;


public class Combat {
    private Player player;
    private Enemy enemy;


    public Combat(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void combat() {
        System.out.println(this.player.getName() + " is Attacking " + this.enemy.getName());
        enemy.combatStats();
        player.combatStats();

        Scanner in = new Scanner(System.in);
        boolean invalidInput = true;
        while(invalidInput) {
            System.out.println("(1) use Bow");
            System.out.println("(2) use Sword");

            int action1 = in.nextInt();
            switch (action1) {
                case 1: {
                    System.out.println("---------------------------------Combat---------------------------------------");
                    player.getBow().shootArrow();
                    this.enemy.takeDamage(player.getBow().getDamage());
                    invalidInput = false;
                    break;
                }
                case 2: {
                    System.out.println("---------------------------------Combat---------------------------------------");
                    swordCombat();
                    invalidInput = false;
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    invalidInput = true;
                    break;
                }

            }
        }
        boolean flee = false;
        while(checkIfPlayerAndEnemyAreAlive() && !flee) {
            enemy.combatStats();
            player.combatStats();
            System.out.println("(1) Attack");
            System.out.println("(2) Flee");
            int action2 = in.nextInt();
            switch (action2) {
                case 1:{
                    swordCombat();
                    break;
                }
                case 2:{
                    flee = true;
                    break;
                }
                default:{
                    System.out.println("Invalid input");
                    break;
                }
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
        if(!flee){
            this.enemy = null;
        }

    }

    public void surpriseAttack(){
        System.out.println(this.enemy.getName() + " is attacking !");
        boolean counterAttack = player.defense(this.enemy.getDamage(), this.enemy.getAgility());
        if (counterAttack) {
            enemy.takeDamage(this.player.getSword().getDamage());
        }
    }

    private void swordCombat(){
        this.enemy.defense(this.player.getSword().getDamage(), this.player.getAgility());
        if(!checkIfPlayerAndEnemyAreAlive()){} else {
            System.out.println(this.enemy.getName() + " is attacking !");
            boolean counterAttack = player.defense(this.enemy.getDamage(), this.enemy.getAgility());
            if (counterAttack) {
                enemy.takeDamage(this.player.getSword().getDamage());
            }
        }
    }

    private boolean checkIfPlayerAndEnemyAreAlive(){
        if (this.player.getHp() <= 0){
            System.out.println(this.player.getName() + " died");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        if (this.enemy.getHp() <= 0){
            System.out.println(this.enemy.getName() + " has been defeated");
            return false;
        } else {
            return true;
        }
    }


}
