package weapon;

public class WaterGun extends Weapon{
    private String name;
    private String ammo;

    public WaterGun(String name, String ammo){
        this.name = name;
        this.ammo = ammo;
    }
    public void shot(){
        System.out.println("пш-пш");
    }
    public String toString(){
        return "Название: "+this.name+" Патроны: "+this.ammo;
    }
}
