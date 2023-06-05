package weapon;

public class Pistol extends Weapon{

    private String name;
    private String ammo;

    public Pistol(String name, String ammo){
        this.name = name;
        this.ammo = ammo;
    }
    public void shot(){
        System.out.println("пау-пау");
    }
    public String toString(){
        return "Название: "+this.name+" Патроны: "+this.ammo;
    }
}
