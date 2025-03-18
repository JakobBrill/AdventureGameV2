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
        level2(player, loot);
        level3(player, loot);

    }

    public static int action(boolean right, boolean left, boolean straight, boolean attack, boolean loot) {
        System.out.println("---------------------------------Action---------------------------------------");
        if (right) {
            System.out.println("(1) go right");
        }
        if (left) {
            System.out.println("(2) go left");
        }
        if (straight) {
            System.out.println("(3) go straight");
        }
        if (attack) {
            System.out.println("(4) attack");
        }
        if (loot) {
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

        boolean lootBoolean = true;

        boolean enemyAlive = true;

        while (levelRunning) {
            if (bat.getHp() <= 0) {
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
                    in.nextLine();
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
                    in.nextLine();
                    player.takeDamage(3);
                    levelRunning = false;
                    break;
                }
                case 3: {
                    if (enemyAlive) {
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
                        in.nextLine();
                        levelRunning = false;
                        break;
                    }
                }
                case 4: {
                    if (enemyAlive) {
                        Combat combat1 = new Combat(player, bat);
                        combat1.combat();
                        break;
                    } else {
                        System.out.println("invalid input");
                        break;
                    }
                }
                case 5: {
                    if (lootBoolean && !enemyAlive) {
                        loot.loot(false, true, false, false, 1, 2, 3);
                        lootBoolean = false;
                        break;
                    } else if (enemyAlive) {
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
        Enemy woodGuardian = new Enemy("Wood Guardian", 50, 10, 1, 0, 1);
        Combat combat2 = new Combat(player, woodGuardian);
        Narrative.level2(player);
        combat2.surpriseAttack();
        combat2.combat();

        boolean levelRunning = true;
        boolean lootBoolean = true;
        boolean enemyAlive = true;

        while (levelRunning) {

            if (woodGuardian.getHp() <= 0) {
                enemyAlive = false;
            }
            switch (action(false, true, true, enemyAlive, lootBoolean)) {
                case 2: {
                    System.out.println();
                    System.out.println(player.getName() + " cautiously enters the Twisted Hollow, where roots and vines twist across the narrow path.");
                    System.out.println("The ground shifts unexpectedly, and " + player.getName() + " stumbles, scraping their leg against a jagged root.");
                    System.out.println("Pain shoots through their leg, and a sharp branch tears into their arm as they try to steady themselves.");
                    System.out.println(player.getName() + " pushes forward, hurt but determined to survive.");
                    player.takeDamage(7);
                    in.nextLine();
                    levelRunning = false;
                    break;
                }
                case 3: {
                    if (enemyAlive) {
                        System.out.println();
                        System.out.println(player.getName() + " approaches the Ancient Arch, its towering structure covered with glowing runes.");
                        System.out.println("The air grows heavy, and the ground trembles beneath " + player.getName() + "'s feet.");
                        System.out.println("From the shadows of the arch, a massive figure emerges, its body made of twisted roots and bark.");
                        System.out.println("The Wood Guardian steps forward, its glowing emerald eyes locked onto " + player.getName() + ".");
                        System.out.println("With a roar that echoes like snapping trees, it raises its massive arm and swings it toward " + player.getName() + "!");
                        System.out.println(player.getName() + " barely has time to react as the colossal creature attacks.");
                        combat2.combat();
                        break;
                    } else {
                        System.out.println();
                        System.out.println(player.getName() + " steps cautiously through the Ancient Arch, the glowing runes pulsing faintly.");
                        System.out.println("The forest seems to hold its breath as " + player.getName() + " passes beneath the archway.");
                        System.out.println("No creature emerges to block the path, and the runes dim as if acknowledging " + player.getName() + "'s presence.");
                        System.out.println(player.getName() + " emerges on the other side, unscathed and ready to face whatever lies ahead.");
                        in.nextLine();
                    }

                    levelRunning = false;
                    break;
                }
                case 4: {
                }
                if (enemyAlive) {
                    combat2.combat();
                    if (woodGuardian.getHp() <= 0) {
                        System.out.println("With a final roar, the Wood Guardian collapses, its massive form breaking into twisted roots and splinters.");
                        System.out.println("The ground shakes one last time, and as the dust settles, a faint glow catches " + player.getName() + "'s eye.");
                        System.out.println("Amid the shattered remains of the Guardian, a hidden cache of loot emerges, bathed in a soft green light.");
                        System.out.println(player.getName() + " carefully approaches, discovering valuable items left behind by the defeated foe.");
                        System.out.println("Victory is sweet, and the spoils of battle will aid in the journey ahead.");
                    }
                    break;
                } else {
                    System.out.println("invalid input");
                    break;
                }

                case 5: {
                    if (lootBoolean && !enemyAlive) {
                        loot.loot(false, false, false, true, 1, 2, 3);
                        lootBoolean = false;
                        break;
                    } else if (enemyAlive) {
                        System.out.println("Defeat enemy in order too loot");
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
                    Narrative.level2Map();
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }

    public static void level3(Player player, Loot loot) {
        Scanner in = new Scanner(System.in);
        Enemy Chimera = new Enemy("Chimera", 60, 18, 1, 20, 30);
        Combat combat3 = new Combat(player, Chimera);
        Narrative.level3(player);

        boolean levelRunning = true;
        boolean lootBoolean = true;
        boolean enemyAlive = true;
        while (levelRunning) {
            if (Chimera.getHp() <= 0) {
                enemyAlive = false;
            }
            switch (action(false, false, true, enemyAlive, lootBoolean)) {
                case 3: {
                    if(enemyAlive){
                        System.out.println(player.getName() + " steps cautiously through the crumbling entrance of the overgrown temple.");
                        System.out.println("The air grows still, and the faint sound of rustling leaves is replaced by a deep, guttural hiss.");
                        System.out.println("Ahead, in the shadows of the central chamber, a massive creature stirs.");
                        System.out.println("The Chimera emerges—a fearsome fusion of serpent and eagle, its scaled body coiled around a broken column.");
                        System.out.println("It spreads its enormous wings, filling the room as its sharp talons scrape against the stone floor.");
                        System.out.println("The creature's piercing eyes lock onto " + player.getName() + ", and it lets out a deafening screech.");
                        System.out.println("The Chimera lunges forward, its fanged maw snapping as" + player.getName() + "prepares to fight!");
                        combat3.combat();
                    } else {
                        System.out.println(player.getName() + " steps cautiously into the overgrown temple, the air thick with dampness and decay.");
                        System.out.println("Massive stone columns rise toward the ceiling, wrapped in ancient vines and moss.");
                        System.out.println("The faint glow of runes on the walls casts shifting shadows, as if the temple itself is alive.");
                        System.out.println(player.getName() + " moves deeper into the temple, the sound of their footsteps echoing through the vast, empty halls.");
                        System.out.println("The path ahead is shrouded in mystery, promising both danger and discovery.");
                        in.nextLine();
                    }
                    levelRunning = false;
                    break;
                }
                case 4: {
                    if (enemyAlive) {
                        combat3.combat();
                        break;
                    } else {
                        System.out.println("invalid input");
                        break;
                    }
                }
                case 5: {
                    if (lootBoolean) {
                        System.out.println();
                        System.out.println(player.getName() + " approaches the shattered statue, its form barely recognizable under layers of moss and vines.");
                        System.out.println("As " + player.getName() + " inspects the rubble, a faint glimmer catches their eye.");
                        System.out.println(player.getName() + " clears away the debris and discovers a hidden compartment within the statue's base.");
                        System.out.println("Inside lies an ancient bow, its wood intricately carved and surprisingly well-preserved.");
                        loot.loot(true, false, false, false, 1, 3, 8);
                        lootBoolean = false;
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
                    Narrative.level3Map();
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }
    public static void level4(Player player, Loot loot) {
        Scanner in = new Scanner(System.in);
        Enemy blank = new Enemy("", 20, 5, 1, 0, 20);

        Narrative.level1(player);

        boolean levelRunning = true;
        boolean lootBoolean = true;
        boolean enemyAlive = true;

        while (levelRunning) {



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
    boolean lootBoolean = true;
    boolean enemyAlive = true;
    while (levelRunning) {



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

