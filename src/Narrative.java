import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Narrative {



public static void intro(){
    Scanner in = new Scanner(System.in);
    System.out.println();
    System.out.println("The village of Eldoria is dying. A deadly illness, the Withering Veil, spreads unchecked. The");
    System.out.println("cure lies in the venom of the Serpent of Solwood, a magical snake deep within the cursed");
    System.out.println("forest. Many have entered; none have returned. Armed with a blade and hope, you venture");
    System.out.println("into the woods to save your people.");
    in.nextLine();
}
public static void level1(Player player){
            Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------Level1---------------------------------------");
            System.out.println("Welcome to Solwood, the cursed forest.");
            System.out.println("The trees loom high, shrouded in mist, and eerie sounds echo all around.");
            System.out.println("Three paths lie ahead. Choose wisely, " + player.getName() + ".");
            System.out.println();
            in.nextLine();
            System.out.println("(1) Right (The Whispering Hollow):");
            System.out.println("   A narrow, rocky path whispers warnings, daring " + player.getName() + " to tread carefully.");
            System.out.println();
            in.nextLine();
            System.out.println("(2) Left (The Fallen Giant):");
            System.out.println("   A massive fallen tree blocks the path. Climbing over looks risky but possible.");
            System.out.println();
            in.nextLine();
            System.out.println("(3) Straight Ahead (The Mossy Arch):");
            System.out.println("   A glowing, moss-covered arch hums faintly, beckoning " + player.getName() + " forward.");
            System.out.println();
            in.nextLine();
            System.out.println("Nearby, " + player.getName() + " spots a corpse of a fallen adventurer.");
            System.out.println();
            System.out.println("As " + player.getName() + " steps forward, a bat swoops down from the shadows!");
            System.out.println("Its red eyes gleam, and it dives straight toward " + player.getName() + ".");
            System.out.println();
            level1Map();
        }

        public static void level1Map(){
            System.out.println("############################################################");
            System.out.println("#                    (3) Mossy Arch                        #");
            System.out.println("#                        (Corpse)                          #");
            System.out.println("#                          (Bat)                           #");
            System.out.println("#                            |                             #");
            System.out.println("Fallen Giant-(2)-----------[You]-------------(1)-Hollow Path");
            System.out.println("############################################################");
            System.out.println();
        }

        public static void level2(Player player){
            Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------Level2---------------------------------------");
            System.out.println(player.getName() + " ventures deeper into Solwood, where the trees grow older and more twisted.");
            System.out.println("The forest feels alive, its gnarled roots forming treacherous paths.");
            System.out.println("A faint green glow seeps through the dense canopy, casting shifting shadows.");
            System.out.println("The whispers from before are now louder, almost as if the forest itself is speaking to " + player.getName() + ".");
            System.out.println();
            in.nextLine();
            System.out.println("Ahead, the Ancient Arch looms, its surface covered with glowing runes.");
            System.out.println("To the left lies the Twisted Hollow, a narrow path tangled with roots and darkness.");
            System.out.println();
            System.out.println(player.getName() + " approaches the Ancient Arch, and the glowing runes flicker brighter with every step.");
            System.out.println("The ground trembles, and a towering Wood Guardian emerges from the shadows.");
            System.out.println("Its glowing emerald eyes fix on " + player.getName() + " as it raises its massive, root-covered arm.");
            System.out.println("With a deafening roar, the Wood Guardian swings toward " + player.getName() + "!");
            System.out.println();
        }

        public static void level2Map(){

            System.out.println("############################################################");
            System.out.println("#                      (3)  Ancient Arch                   #");
            System.out.println("#                       (Wood Guardian)                    #");
            System.out.println("#                              |                           #");
            System.out.println("#                              |                           #");
            System.out.println("#(2)Twisted Hollow-----------[You]                         #");
            System.out.println("#                              |                           #");
            System.out.println("############################################################");
            System.out.println();
        }

        public static void level3(Player player){
        Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------Level3---------------------------------------");
            System.out.println();
            System.out.println(player.getName() + " arrives at the entrance of a massive, overgrown temple.");
            System.out.println("Thick vines coil around the ancient stone walls, and the faint glow of sunlight filters through the dense canopy above.");
            System.out.println("Inside, broken columns and shattered statues speak of a forgotten age.");
            System.out.println("As " + player.getName() + " steps deeper into the temple, a chilling hiss echoes through the chamber.");
            System.out.println("The Chimera, a monstrous hybrid of serpent and eagle, unfurls its massive wings and fixes its piercing eyes on " + player.getName() + ".");
            System.out.println("The creature blocks the path forward. There is no escape—only a fight for survival.");
            in.nextLine();
            level3Map();
        }

        public static void level3Map() {
            System.out.println("############################################################");
            System.out.println("#                       Overgrown Temple                   #");
            System.out.println("#                            (Chimera)                    #");
            System.out.println("#                              |                          #");
            System.out.println("#                              |                          #");
            System.out.println("#                        Crumbling Statues                #");
            System.out.println("#                              |                          #");
            System.out.println("#                        [You] (Temple Entrance)          #");
            System.out.println("############################################################");
            System.out.println();
        }

        public static void level4(Player player){
            Scanner in = new Scanner(System.in);
            System.out.println(player.getName() + " steps into a grand chamber, the air heavy with the scent of blood and ash.");
            System.out.println("At the center of the room lies a massive dragon, its body battered and broken.");
            System.out.println("The dragon’s golden scales are dull and stained with blood, its breathing shallow.");
            System.out.println("The wounded beast lifts its head weakly, its glowing eyes locking onto " + player.getName() + ".");
            System.out.println("It lets out a low growl, but it is too weak to rise. The choice of what to do next rests with " + player.getName() + ".");
            in.nextLine();
        }

        public static void level4Map(){
            System.out.println("############################################################");
            System.out.println("#                       Dragon’s Rest                      #");
            System.out.println("#                    (Wounded Dragon)                      #");
            System.out.println("#                              |                           #");
            System.out.println("#                              |                           #");
            System.out.println("#                              |                           #");
            System.out.println("#                          [You]                          #");
            System.out.println("############################################################");
        }

}





