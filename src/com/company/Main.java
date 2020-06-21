package com.company;

import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        Heroe Jugador = new Heroe();
        Calabozos Cuartos = new Calabozos();
        Calabozos Dimension = new Calabozos();
        Calabozos Estado = new Calabozos();
        Enemigos Monstruos = new Enemigos();

        Pociones Curas = new Pociones();
        Pociones Salidas = new Pociones();
        boolean observar = true;
Saludyataqueenemigo EnemiHP = new Saludyataqueenemigo();



        System.out.println(                                "꧁BIENVENIDO A CALABOZOS Y DRAGONES꧂ ");
        System.out.println("<<<<<<<<<<<>>>>>>>>>>> ");


        System.out.println("has sido transportado al calabozo ");
        System.out.println(" y has ingresado al cuarto numero " + Cuartos);

        System.out.println("<<<<<<<<<<<>>>>>>>>>>> ");
        String [] Malos = Monstruos.Enemies;
        for (int i = 0 ; i < 5; i++)
        System.out.println("En ella se encuentran  "  +Malos[i]);


        System.out.println("<<<<<<<<<<<>>>>>>>>>>> ");
        System.out.println("Tu posees Actualmente  " + Jugador);
        System.out.println("<<<<<<<<<<<>>>>>>>>>>> ");
        System.out.println("que accion deseas Tomar?");
        System.out.println("<<<<<<<<<<<\uD83E\uDDDD>>>>>>>>>>> ");
        System.out.println("1.Mirar \uD83D\uDC40 ");
        System.out.println("2.avanzar ⬆ ");
        System.out.println("3.retroceder ⬇ ");
        System.out.println("4.ir por la derecha ⏩");
        System.out.println("5.ir por la izquierda ⏪");
        System.out.println("6.Atacar ⚔ ");
        System.out.println("7.Defender \uD83D\uDEE1 ");
        System.out.println("------------------------------------------------------------------------------------------");
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Has seleccionado Obserbar");
                System.out.println("el cuarto actual es :" + Cuartos + "en este cuarto hay " + Monstruos+" en este cuarto hay " + Curas + "");
                System.out.println("hay");
                System.out.println("Que Desea Hacer?");
                System.out.println("------------------------------------------------------------------------------------------");

                System.out.println("1.Atacar ⚔");
                System.out.println("2.Defender \uD83D\uDEE1 ");
                System.out.println("3.recoger ");
                System.out.println("4.Avanzar ⬆");
                System.out.println("5.Retroceder  ⬇");

                System.out.println("6.ir por la derecha ⏩");
                System.out.println("7.ir por la izquierda ⏪ ");
                System.out.println("------------------------------------------------------------------------------------------");
                int Accion = sc.nextInt();
                switch (Accion) {
                    case 1:
                System.out.println("--------------------------------------------------");
                        System.out.println("-------------Selecciona a quien atacaras ------------");

                        System.out.println("" + Monstruos);
                        int Ataqueaenemigo = sc.nextInt();
                        switch (Ataqueaenemigo) {
                            case 1:
                                System.out.println("has atacado al Dragon  \uD83D\uDC09 ");
                                System.out.println("Este Enemigo posee " +EnemiHP );
                                System.out.println("Has Realizado tu ataque" +EnemiHP );
                                String input = sc.nextLine();
                                if( input.equals("1")) {
                                    else
                                }






                        }


            }
            }
}}
