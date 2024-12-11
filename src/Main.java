import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Narrative.intro();

        System.out.println("Enter your Heroes Name: ");
        String playerName = new Scanner(System.in).nextLine();
        Player player = new Player(playerName);
        Loot loot = new Loot(player);
        player.getStats();

        level1(player, loot);


    }

    public static int action(boolean right, boolean left, boolean straight, boolean attack, boolean loot) {
        System.out.println("---------------------------------Action---------------------------------------");
        if(right){
            System.out.println("(1) go right");
        }
        if(left){
            System.out.println("(2) go left");
        }
        if(straight){
            System.out.println("(3) go straight");
        }
        if(attack){
            System.out.println("(4) attack");
        }
        if(loot){
            System.out.println("(5) loot");
        }
        System.out.println("(6) use Health potion");
        System.out.println("(7) get stats");
        System.out.println("(8) Map");
        System.out.println("-----------------------------------------------------------------------------");

        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void level1(Player player, Loot loot) {
        Scanner in = new Scanner(System.in);
        Enemy bat = new Enemy("Bat", 20, 5, 1, 0, 20);

        Narrative.level1(player);

        boolean levelRunning = true;

        while (levelRunning) {

            boolean lootBoolean = true;
            boolean enemyAlive = true;

            if(bat.getHp() <= 0){
                enemyAlive = false;
            }
            switch (action(true, true, true, enemyAlive, lootBoolean)) {
                case 1: {
                    System.out.println("The narrow trail is lined with jagged rocks. The air grows cold, and whispers grow louder as");
                    System.out.println("the path darkens ahead.");
                    System.out.println();
                    in.nextLine();
                    System.out.println(player.getName() + " cautiously enters the Whispering Hollow.");
                    System.out.println("The rocky path is narrow, and the whispers grow louder.");
                    System.out.println(player.getName() + " feels uneasy but remains unharmed.");
                    levelRunning = false;
                    break;
                }
                case 2: {
                    System.out.println("The massive fallen tree blocks your path. Its bark is claw-marked, and whispers echo as you");
                    System.out.println("climb over it cautiously.");
                    System.out.println();
                    in.nextLine();
                    System.out.println(player.getName() + " climbs over the Fallen Giant.");
                    System.out.println("The moss-covered trunk is slick, and " + player.getName() + " loses their footing.");
                    System.out.println(player.getName() + " falls, scraping their arm badly.");
                    System.out.println(player.getName() + " is hurt, but they manage to press on.");
                    player.takeDamage(3);
                    levelRunning = false;
                    break;
                }
                case 3: {
                    if(enemyAlive) {
                        System.out.println("You approach the glowing, moss-covered arch. The air thickens, and shadows loom as a bat");
                        System.out.println("swoops toward you, shrieking.");
                        Combat combat1 = new Combat(player, bat);
                        combat1.combat();
                        break;
                    } else {
                        System.out.println("You approach the glowing, moss-covered arch. The air is thick and still, and the arch");
                        System.out.println("hums faintly, as if alive, urging you forward.");
                        System.out.println();
                        in.nextLine();
                        System.out.println(player.getName() + " ventures through the Mossy Arch.");
                        System.out.println("The path is calm, and " + player.getName() + " feels a strange energy pass through them.");
                        System.out.println(player.getName() + " proceeds unharmed.");
                        levelRunning = false;
                        break;
                    }
                }
                case 4: {
                    if(enemyAlive) {
                        Combat combat1 = new Combat(player, bat);
                        combat1.combat();
                        break;
                    } else {
                        System.out.println("invalid input");
                        break;
                    }
                }
                case 5: {
                    if(lootBoolean && !enemyAlive) {
                        loot.loot(false, true, false, false, 1, 2, 3);
                        
                        break;
                    } else if(enemyAlive) {
                        System.out.println(player.getName() + " steps cautiously toward the corpse, the forest eerily silent.");
                        System.out.println("Suddenly, a piercing screech breaks the stillness!");
                        System.out.println("A bat dives from the shadows, its claws slashing wildly at " + player.getName() + "!");
                        Combat combat1 = new Combat(player, bat);
                        combat1.combat();
                        break;
                    } else {
                        System.out.println("Invalid input");
                        break;
                    }
                }
                case 6: {
                    player.useHealthPotions();
                    break;
                }
                case 7: {
                    player.getStats();
                    break;
                }
                case 8: {
                    Narrative.level1Map();
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }

    public static void level2(Player player, Loot loot) {
        Scanner in = new Scanner(System.in);
        Enemy blank = new Enemy("", 20, 5, 1, 0, 20);

        Narrative.level1(player);

        boolean levelRunning = true;

        while (levelRunning) {

            boolean lootBoolean = true;
            boolean enemyAlive = true;

            if(blank.getHp() <= 0){
                enemyAlive = false;
            }
            switch (action(true, true, true, enemyAlive, lootBoolean)) {
                case 1: {
                    levelRunning = false;
                    break;
                }
                case 2: {
                    levelRunning = false;
                    break;
                }
                case 3: {
                        levelRunning = false;
                        break;
                    }
                }
                case 4: {
                    if(enemyAlive) {
                        Combat combat1 = new Combat(player, blank);
                        combat1.combat();
                        break;
                    } else {
                        System.out.println("invalid input");
                        break;
                    }
                }
                case 5: {
                    if(lootBoolean) {
                        loot.loot(false, true, false, false, 1, 2, 3);

                        break;
                    } else {
                        System.out.println("Invalid input");
                        break;
                    }
                }
                case 6: {
                    player.useHealthPotions();
                    break;
                }
                case 7: {
                    player.getStats();
                    break;
                }
                case 8: {
                    Narrative.level1Map();
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }

}
    /*
    public static void bluePrintLevel(Player player, Loot loot) {
    Scanner in = new Scanner(System.in);
    Enemy blank = new Enemy("", 20, 5, 1, 0, 20);

    Narrative.level1(player);

    boolean levelRunning = true;

    while (levelRunning) {

        boolean lootBoolean = true;
        boolean enemyAlive = true;

        if(blank.getHp() <= 0){
            enemyAlive = false;
        }
        switch (action(true, true, true, enemyAlive, lootBoolean)) {
            case 1: {
                levelRunning = false;
                break;
            }
            case 2: {
                levelRunning = false;
                break;
            }
            case 3: {
                levelRunning = false;
                break;
            }
        }
        case 4: {
            if(enemyAlive) {
                Combat combat1 = new Combat(player, blank);
                combat1.combat();
                break;
            } else {
                System.out.println("invalid input");
                break;
            }
        }
        case 5: {
            if(lootBoolean) {
                loot.loot(false, true, false, false, 1, 2, 3);

                break;
            } else {
                System.out.println("Invalid input");
                break;
            }
        }
        case 6: {
            player.useHealthPotions();
            break;
        }
        case 7: {
            player.getStats();
            break;
        }
        case 8: {
            Narrative.level1Map();
            break;
        }
        default: {
            System.out.println("Invalid input");
            break;
        }
    }
}

     */

