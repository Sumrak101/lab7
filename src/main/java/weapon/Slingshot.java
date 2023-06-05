package weapon;

public class Slingshot extends Weapon{

    private String name;
    private String ammo;

    public Slingshot(String name, String ammo){
        this.name = name;
        this.ammo = ammo;
    }
    public void shot(){
        System.out.println("бам-бам");
    }
    public String toString(){
        return "Название: "+this.name+" Патроны: "+this.ammo;
    }
}
