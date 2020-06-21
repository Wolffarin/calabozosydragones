package com.company;

public class Pociones {
   int  Pociones = (int)(Math.random()*1+0);
    int Salidas =  (int)(Math.random()*3+1);

    @Override
    public String toString() {
        return "Pociones= \uD83D\uDC8A" +
                "" + Pociones +
                ",y se encuentran " + Salidas +"  Salidas"
                ;
    }
}
