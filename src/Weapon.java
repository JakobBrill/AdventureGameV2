public class Weapon {
    private String name;
    private int damage;
    private boolean canShoot;
    private int arrows;
    private int counterattack;


    public Weapon(String name, int damage, int counterattack) {
        this.name = name;
        this.damage = damage;
        this.counterattack = counterattack;
    }
    public Weapon(String name, int damage, boolean canShoot, int arrows) {
        this.name = name;
        this.damage = damage;
        this.canShoot = canShoot;
        this.arrows = arrows;
    }
    public void shootArrow(){
        if(this.arrows>0) {
            this.arrows--;
            System.out.println(this.arrows + " Arrows Left");
        } else {
            System.out.println("0 Arrows left");
        }
    }
    public int getCounterattack() {
        return counterattack;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
    public int getArrows() {
        return arrows;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setCounterattack(int counterattack) {
        this.counterattack = counterattack;
    }
    public void addArrows(int arrows) {
        this.arrows += arrows;
    }
}

