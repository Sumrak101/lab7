package weapon;

public class RPG extends Weapon{
    private String name;
    private String ammo;

    public RPG(String name, String ammo){
        this.name = name;
        this.ammo = ammo;
    }
    public void shot(){
        System.out.println("BOOM");
    }
    public String toString(){
        return "Название: "+this.name+" Патроны: "+this.ammo;
    }
}
