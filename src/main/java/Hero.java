public class Hero {
    private String name;
    protected int hp;
    private int xp;
    protected int power;
    protected int armor;
    protected Speciality speciality;
    protected Rarety rarety;
    private int level;

    public Hero(String name, int hp, int xp, int power, int armor, Speciality speciality, Rarety rarety, int level) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.power = power;
        this.armor = armor;
        this.speciality = speciality;
        this.rarety = rarety;
        this.level = level;
    }
    public Hero(String name, Speciality speciality, Rarety rarety) {
        this.name = name;
        this.xp = 0;
        this.speciality = speciality;
        this.rarety = rarety;
        this.level = 1;
    }
}
