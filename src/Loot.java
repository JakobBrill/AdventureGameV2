import java.util.Random;
import java.util.Scanner;

public class Loot {
    private Player player;
    private Weapon bow;
    private Weapon sword;

    public Loot(Player player) {
        this.player = player;
        this.bow = player.getBow();
        this.sword = player.getSword();
    }

    public void loot(boolean bow,boolean sword,boolean boots,boolean amor, int level,
                     int healthPotions, int arrows){
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int tmp = ran.nextInt(2)+1;
        //Shitty code
        String swordName = this.sword.getName();
        int swordDamage = this.sword.getDamage();
        int swordCounterattack = this.sword.getCounterattack();

        String bowName = this.bow.getName();
        int bowDamage = this.bow.getDamage();

        String bootsName = this.player.getBoots();
        int bootsAgility = this.player.getAgility();

        String armorName = this.player.getArmor();
        int armorDefense = this.player.getDefense();

        switch (level){
            case 1:{
                if(bow){
                    switch (tmp){
                        case 1:{
                            System.out.println("Hunter’s Arc: A simple bow, sturdy and reliable for small game.");
                            System.out.println("Damage: 3");

                            this.bow.setName("Hunter’s Arc");
                            this.bow.setDamage(3);
                            break;
                        }
                        case 2:{
                            System.out.println("Bramble Bow: A crude weapon made from twisted branches.");
                            System.out.println("Damage: 6");

                            this.bow.setName("Bramble Bow");
                            this.bow.setDamage(6);
                            break;
                        }
                        case 3:{
                            System.out.println("Splintershot: A fragile bow that can still shoot with surprising accuracy.");
                            System.out.println("Damage: 4");

                            this.bow.setName("Splintershot");
                            this.bow.setDamage(4);
                            break;
                        }
                    }
                }
                if(sword){
                    switch (tmp){
                        case 1:{
                            System.out.println("Iron Fang: A rough, weathered blade carried by novice adventurers.");
                            System.out.println("Damage: 8 | Counterattack: 20%");

                            this.sword.setName("Iron Fang");
                            this.sword.setDamage(8);
                            this.sword.setCounterattack(20);
                            break;
                        }
                        case 2:{
                            System.out.println("Woodcutter’s Edge: A simple sword, more suited for chopping branches than monsters.");
                            System.out.println("Damage: 15 | Counterattack: 10%");

                            this.sword.setName("Woodcutter’s Edge");
                            this.sword.setDamage(15);
                            this.sword.setCounterattack(10);
                            break;
                        }
                        case 3:{
                            System.out.println("Rustbite: An old, corroded weapon, but it still has its edge.");
                            System.out.println("Damage: 12 | Counterattack: 15%");

                            this.sword.setName("Rustbite");
                            this.sword.setDamage(12);
                            this.sword.setCounterattack(15);
                            break;
                        }
                    }
                }
                if(boots){
                    switch (tmp){
                        case 1:{
                            System.out.println("Traveler’s Treads: Lightweight leather boots built for long journeys, offering decent mobility.");
                            System.out.println("Agility: 20");

                            this.player.setBoots("Traveler’s Treads");
                            this.player.setAgility(20);
                            break;
                        }
                        case 2:{
                            System.out.println("Mudwalkers: Sturdy but flexible boots, designed to keep you nimble in difficult terrain.");
                            System.out.println("Agility: 15");

                            this.player.setBoots("Mudwalkers");
                            this.player.setAgility(15);
                            break;

                        }
                        case 3:{
                            System.out.println("Barkshoes: Simple, reinforced boots that allow quick movement on rough forest floors.");
                            System.out.println("Agility: 25");

                            this.player.setBoots("Barkshoes");
                            this.player.setAgility(25);
                            break;
                        }
                    }
                }
                if(amor){
                    switch (tmp){
                        case 1:{
                            System.out.println("Leather Jerkin: A basic leather chest piece offering minimal protection.");
                            System.out.println("Defense: 15");

                            this.player.setArmor("Leather Jerkin");
                            this.player.setDefense(15);
                            break;
                        }
                        case 2:{
                            System.out.println("Hunter’s Hide: Light armor crafted from tanned animal hides.");
                            System.out.println("Defense: 20");

                            this.player.setArmor("Hunter’s Hide");
                            this.player.setDefense(20);
                            break;
                        }
                        case 3:{
                            System.out.println("Rusted Plate: Old and dented metal armor, still functional but heavy.");
                            System.out.println("Defense: 25");

                            this.player.setArmor("Rusted Plate");
                            this.player.setDefense(25);
                            break;
                        }
                    }
                }
                break;
            }
            case 2:{
                if(bow){
                    switch (tmp){
                        case 1:{
                            System.out.println("Starlight String: A bow that glimmers faintly, its string said to be unbreakable.");
                            System.out.println("Damage: 10");

                            this.bow.setName("Starlight String");
                            this.bow.setDamage(10);
                            break;
                        }
                        case 2:{
                            System.out.println("Venomstrike: Infused with poison magic, its arrows weaken enemies.");
                            System.out.println("Damage: 12");

                            this.bow.setName("Venomstrike");
                            this.bow.setDamage(12);
                            break;
                        }
                        case 3:{
                            System.out.println("Silencer: A bow that fires without a sound, perfect for stealth.");
                            System.out.println("Damage: 9");

                            this.bow.setName("Silencer");
                            this.bow.setDamage(9);
                            break;
                        }
                    }
                }
                if(sword){
                    switch (tmp){
                        case 1:{
                            System.out.println("Moonlit Shard: A blade that glows faintly under the moonlight, said to guide its wielder.");
                            System.out.println("Damage: 25 | Counterattack: 40%");

                            this.sword.setName("Moonlit Shard");
                            this.sword.setDamage(25);
                            this.sword.setCounterattack(40);
                            break;
                        }
                        case 2:{
                            System.out.println("Venomfang: A sword with a greenish hue, rumored to poison its foes.");
                            System.out.println("Damage: 30 | Counterattack: 30%");

                            this.sword.setName("Venomfang");
                            this.sword.setDamage(30);
                            this.sword.setCounterattack(30);
                            break;
                        }
                        case 3:{
                            System.out.println("Whispersteel: A silent, lightweight blade that feels unnaturally cold.");
                            System.out.println("Damage: 15 | Counterattack: 75%");

                            this.sword.setName("Whispersteel");
                            this.sword.setDamage(15);
                            this.sword.setCounterattack(75);
                            break;
                        }
                    }
                }
                if(boots){
                    switch (tmp){
                        case 1:{
                            System.out.println("Miststep Boots: Enchanted to make each step lighter, allowing swift and silent movement.");
                            System.out.println("Agility: 35");

                            this.player.setBoots("Miststep Boots");
                            this.player.setAgility(35);
                            break;
                        }
                        case 2:{
                            System.out.println("Venomroot Striders: Agile boots that let you dart through poisonous terrain with ease.");
                            System.out.println("Agility: 40");

                            this.player.setBoots("Venomroot Striders");
                            this.player.setAgility(40);
                            break;

                        }
                        case 3:{
                            System.out.println("Moonlit Greaves: Designed for speed, these boots make you faster under the glow of the moon.");
                            System.out.println("Agility: 50");

                            this.player.setBoots("Moonlit Greaves");
                            this.player.setAgility(50);
                            break;
                        }
                    }
                }
                if(amor){
                    switch (tmp){
                        case 1:{
                            System.out.println("Mistweave Vest: An ethereal armor that seems to dissolve into mist, confusing enemies.");
                            System.out.println("Defense: 30");

                            this.player.setArmor("Mistweave Vest");
                            this.player.setDefense(30);
                            break;
                        }
                        case 2:{
                            System.out.println("Venomcarapace: Reinforced with scales, it provides resistance to poison.");
                            System.out.println("Defense: 40");

                            this.player.setArmor("Venomcarapace");
                            this.player.setDefense(40);
                            break;
                        }
                        case 3:{
                            System.out.println("Gleaming Barkplate: Enchanted wood armor that reflects faint light, blending into the forest.");
                            System.out.println("Defense: 50");

                            this.player.setArmor("Gleaming Barkplate");
                            this.player.setDefense(50);
                            break;
                        }
                    }
                }
                break;
            }
            case 3:{
                if(bow){
                    switch (tmp){
                        case 1:{
                            System.out.println("Warden’s Call: A bow said to summon nature’s wrath with each arrow.");
                            System.out.println("Damage: 20");

                            this.bow.setName("Warden’s Call");
                            this.bow.setDamage(20);
                            break;
                        }
                        case 2:{
                            System.out.println("Fangstring: Its string is said to be made from the serpent’s sinew, capable of piercing any armor.");
                            System.out.println("Damage: 25");

                            this.bow.setName("Fangstring");
                            this.bow.setDamage(25);
                            break;
                        }
                        case 3:{
                            System.out.println("Eclipsing Recurve: A weapon of unmatched precision, able to blot out the light of day with its arrows.");
                            System.out.println("Damage: 30");

                            this.bow.setName("Eclipsing Recurve");
                            this.bow.setDamage(30);
                            break;
                        }
                    }
                }
                if(sword){
                    switch (tmp){
                        case 1:{
                            System.out.println("Soulpiercer: A mystical sword that burns with ethereal energy, said to sever the soul.");
                            System.out.println("Damage: 40 | Counterattack: 60%");

                            this.sword.setName("Soulpiercer");
                            this.sword.setDamage(40);
                            this.sword.setCounterattack(60);
                            break;
                        }
                        case 2:{
                            System.out.println("Shadowbane: A blade forged to cut through darkness and fear.");
                            System.out.println("Damage: 100 | Counterattack: 0%");

                            this.sword.setName("Shadowbane");
                            this.sword.setDamage(100);
                            this.sword.setCounterattack(0);
                            break;
                        }
                        case 3:{
                            System.out.println("Fang of Solwood: Crafted from the scales of the legendary serpent itself, imbued with immense power.");
                            System.out.println("Damage: 80 | Counterattack: 90%");

                            this.sword.setName("Fang of Solwood");
                            this.sword.setDamage(80);
                            this.sword.setCounterattack(90);
                            break;
                        }
                    }
                }
                if(boots){
                    switch (tmp){
                        case 1:{
                            System.out.println("Shadowstriders: Legendary boots that let the wearer move like a shadow, unseen and unhindered.");
                            System.out.println("Agility: 75");

                            this.player.setBoots("Shadowstriders");
                            this.player.setAgility(75);
                            break;
                        }
                        case 2:{
                            System.out.println("Wings of Solwood: So light they feel like feathers, these boots grant incredible agility and brief flight.");
                            System.out.println("Agility: 85");

                            this.player.setBoots("Wings of Solwood");
                            this.player.setAgility(85);
                            break;

                        }
                        case 3:{
                            System.out.println("Verdant Pathfinders: Boots that enhance your reflexes, letting you dart through the forest as if it clears the way for you.");
                            System.out.println("Agility: 95%");

                            this.player.setBoots("Verdant Pathfinders");
                            this.player.setAgility(95);
                            break;
                        }
                    }
                }
                if(amor){
                    switch (tmp){
                        case 1:{
                            System.out.println("Solwood Scales: Armor forged from the fallen scales of the serpent, unyielding and powerful.");
                            System.out.println("Defense: 85");

                            this.player.setArmor("Solwood Scales");
                            this.player.setDefense(85);
                            break;
                        }
                        case 2:{
                            System.out.println("Warden’s Embrace: Armor said to connect the wearer to the life force of the forest.");
                            System.out.println("Defense: 80");

                            this.player.setArmor("Warden’s Embrace");
                            this.player.setDefense(80);
                            break;
                        }
                        case 3:{
                            System.out.println("Eclipse Aegis: A legendary chest plate that radiates an aura of invincibility, shielding its wearer from harm.");
                            System.out.println("Defense: 100");

                            this.player.setArmor("Eclipse Aegis");
                            this.player.setDefense(100);
                            break;
                        }
                    }
                }
                break;
            }
        }
        boolean invalidInput = true;
        while(invalidInput) {
            System.out.println("Do you wanna take it ? (Y/N)");
            char action = Character.toLowerCase(in.next().charAt(0));

            if (action == 'y') {
                invalidInput = false;
            } else if (action == 'n') {
                invalidInput = false;
                this.sword.setName(swordName);
                this.sword.setDamage(swordDamage);
                this.sword.setCounterattack(swordCounterattack);

                this.bow.setName(bowName);
                this.bow.setDamage(bowDamage);

                this.player.setArmor(armorName);
                this.player.setDefense(armorDefense);

                this.player.setBoots(bootsName);
                this.player.setAgility(bootsAgility);
            } else {
                System.out.println("Invalid input");
            }
        }
        in.nextLine();

        if (healthPotions != 0) {
            this.player.addHealthPotions(healthPotions);
            System.out.println(this.player.getName() + " found " + healthPotions + " health potions.");
        }
        in.nextLine();
        if (arrows != 0) {
            this.bow.addArrows(arrows);
            System.out.println(this.player.getName() + " found " + arrows + " arrows.");
        }
        in.nextLine();


        player.getStats();
    }



}


