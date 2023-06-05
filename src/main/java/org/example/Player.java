package org.example;

import weapon.*;

public class Player {
    public static Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока

        weaponSlots = new Weapon[]{

        new WaterGun("Водяной пистолет","22"),
                new Pistol("Пистолет", "300"),
                    new Slingshot("Рогатка", "10"),
                new Avtomat("Автомат","150"),
                new RPG("РПГ","2")
        // TODO заполнить слоты оружием
        // new BigGun(),
                // new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }

}


