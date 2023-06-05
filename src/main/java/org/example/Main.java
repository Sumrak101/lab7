package org.example;



import weapon.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
            System.out.println();
        int slot;


        for (int i = 0; i < Player.weaponSlots.length; i++) {
            System.out.println((i+1)+". "+Player.weaponSlots[i].toString());
        }
        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1
        while (true){

            slot = scanner.nextInt()-1;
            if (slot >= player.getSlotsCount()){
                System.out.println("Такого оружия не существует!");
                continue;
            }
            if(slot == -2 ){
                System.out.println("Game over!");
                break;
            }
            player.shotWithWeapon(slot);
        }








    }
}