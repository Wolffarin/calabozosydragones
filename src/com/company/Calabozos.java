package com.company;

public class  Calabozos {

    private int Cuartos;
    private String Dimension;
    private String Estado;


    public Calabozos() {
        Cuartos = (int)(Math.random()*40+1);;
        int azar = (int)(Math.random()*4+1);
        if (azar == 1)
            Dimension = "  Grande";
        else
            Dimension = "Pequeño";;
        int Clima = (int)(Math.random()*4+1);
        if (Clima == 1)
            Estado = "  Caliente";
        else if (Clima == 2)
            Estado = "Humedo";
        else if (Clima == 3)
            Estado = "Seco";
             else if (Clima == 4)
            Estado = "Congelado";



    }

    public static String[] Dimension(int Dimension) {
        String[] Tamaño = new String[Dimension];
        String [] Area ={" Alto", "Bajo", "Angosto", "Sumergido"};
         for (int i = 0; i < Dimension; i++) { Tamaño[i] = Area [(int) Math.floor(Math.random()* ((Area.length-1)-0+1)+0)];
         }
       return Tamaño;
    }


    @Override
    public String toString() {
        return
                "" + Cuartos +
                ", el cuarto es'" + Dimension + '\'' +
                ", y esta'" + Estado + '\'' +
                "";
    }
}
