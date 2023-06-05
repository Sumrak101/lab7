package weapon;

public class Avtomat extends Weapon{
    private String name;
    private String ammo;

    public Avtomat(String name, String ammo){
        this.name = name;
        this.ammo = ammo;
    }
    public void shot(){
        System.out.println("тртртр");
    }
    public String toString(){
        return "Название: "+this.name+" Патроны: "+this.ammo;
    }
}
