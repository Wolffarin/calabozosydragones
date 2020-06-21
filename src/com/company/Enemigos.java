package com.company;

import java.util.Arrays;

public class Enemigos {


    int  CantEnemi = (int)(Math.random()*5+1);




        public String[] Enemies = {"1.Dragon \uD83D\uDC09 : " +(int) (Math.random() * 1 + 0)    , "2.Esqueletos \uD83D\uDC80 : " +(int) (Math.random() * 2 + 0), "3.Asesino \uD83D\uDE08 : "+(int) (Math.random() * 2 + 0), "4.Guerrero  \uD83D\uDD7A \uD83D\uDDE1 : "+(int) (Math.random() * 1 + 0), "5.Zombie \uD83E\uDDDF : "+(int) (Math.random() * 1 + 0) };



private String AllEnemies;


    static private int Salud, Ataque, AtaqueMagico;
    static private String Rojo, Azul, Verde;

    public void Enemigos (String[] enemies ) {
        this.Enemies = enemies;
    }




    public static int getSalud() {
        return Salud;
    }

    public static void setSalud(int salud) {
        Salud = salud;
    }

    public static int getAtaque() {
        return Ataque;
    }

    public static void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public static int getAtaqueMagico() {
        return AtaqueMagico;
    }

    public static void setAtaqueMagico(int ataqueMagico) {
        AtaqueMagico = ataqueMagico;
    }
    public String[] getEnemies(String Enemies) {
        return this.Enemies;
    }

    public void setEnemies(String[] enemies) {
       this.Enemies = Enemies;
    }

    @Override
    public String toString() {
        return "Enemigos=" +
                "" + Arrays.toString(Enemies) +
                '}';
    }



}






