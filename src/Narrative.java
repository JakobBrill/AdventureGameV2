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
            System.out.println();
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
            in.nextLine();
            System.out.println("As " + player.getName() + " steps forward, a bat swoops down from the shadows!");
            System.out.println("Its red eyes gleam, and it dives straight toward " + player.getName() + ".");
            System.out.println();
            level1Map();
            in.nextLine();
        }

        public static void level1Map(){
            System.out.println("############################################################");
            System.out.println("#                    (3) Mossy Arch                        #");
            System.out.println("#                        (Corpse)                          #");
            System.out.println("#                          (Bat)                           #");
            System.out.println("#                            |                             #");
            System.out.println("Fallen Giant-(1)-----------[You]-------------(2)-Hollow Path");
            System.out.println("############################################################");
            System.out.println();
        }
}



