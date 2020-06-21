package com.company;

public class Saludyataqueenemigo {
    public int getSaludmaximaenemigos() {
        return Saludmaximaenemigos;
    }

    public void setSaludmaximaenemigos(int saludmaximaenemigos) {
        Saludmaximaenemigos = saludmaximaenemigos;
    }

    public int getDañoataqueenemigo() {
        return dañoataqueenemigo;
    }

    public void setDañoataqueenemigo(int dañoataqueenemigo) {
        this.dañoataqueenemigo = dañoataqueenemigo;
    }

    int Saludmaximaenemigos = (int) (Math.random() * 20 + 10);
    int dañoataqueenemigo = (int) (Math.random() * 10 + 2);


    public Saludyataqueenemigo() {
        int saludmaximaenemigos = (int) (Math.random() * 20 + 10);
        Saludmaximaenemigos = saludmaximaenemigos;
        this.dañoataqueenemigo = dañoataqueenemigo;
    }

    @Override
    public String toString() {
        return "DRAGON  " +
                "Salud=" + Saludmaximaenemigos +
                ", Ataque =" + dañoataqueenemigo
                ;
    }
}
