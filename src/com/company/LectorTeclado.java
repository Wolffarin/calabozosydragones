package com.company;

import java.util.Scanner;

public class LectorTeclado {
    // Patron de diseño Singleton.
    private static LectorTeclado instance;
    private Scanner m_SC;

    public static LectorTeclado getInstance()
    {
        if(instance == null)
        {
            instance = new LectorTeclado();
        }
        return instance;
    }

    LectorTeclado()
    {
        m_SC = new Scanner(System.in);
    }

    public int obtenerEntero(int valorPorDefecto, String mensaje)
    {
        int retval = valorPorDefecto;

        try
        {
            retval = m_SC.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(mensaje);
        }

        return retval;
    }

    public int obtenerEnteroValidado(String mensajeReintento)
    {
        int retval = 0;

        while (!m_SC.hasNextInt())
        {
            m_SC.next();
            System.out.println(mensajeReintento);
        }

        retval = m_SC.nextInt();
        return retval;
    }

    public double obtenerDoubleValidado(String mensajeReintento)
    {
        double retval = 0;

        while (!m_SC.hasNextDouble())
        {
            m_SC.next();
            System.out.println(mensajeReintento);
        }

        retval = m_SC.nextDouble();
        return retval;
    }

}

