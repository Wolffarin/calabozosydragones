package com.company;

public class Heroe {
     private int Salud = 100 ,Ataque = 10 ,Pociones = 3;


        int Cantidaddecuradepocion = 20;
        int probabilidaddecaidapociondesalud = 50;




    public int getSalud() {
        return Salud;
    }

    public void setSalud(int salud) {
        Salud = salud;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }



    public int getPociones() {
        return Pociones;
    }

    public void setPociones(int pociones) {
        Pociones = pociones;
    }

    public Heroe Curacion (Heroe b){
        return new Heroe();
    }

    public Heroe(int salud) {
        Salud = 100;
    }

    @Override
    public String toString() {
        return
                "Salud ❤ =" + Salud +
                ", Ataque ⚔ =️" + Ataque +
                ", Posiones  \uD83D\uDC8A =" + Pociones +
                '}';
    }
}

