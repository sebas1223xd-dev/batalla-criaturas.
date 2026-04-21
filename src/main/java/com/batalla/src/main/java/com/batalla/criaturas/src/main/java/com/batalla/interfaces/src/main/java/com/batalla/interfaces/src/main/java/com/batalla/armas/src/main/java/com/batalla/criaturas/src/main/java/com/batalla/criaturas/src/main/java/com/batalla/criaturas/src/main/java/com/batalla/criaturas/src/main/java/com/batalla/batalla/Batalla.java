package com.batalla.batalla;

import com.batalla.criaturas.Criatura;

public class Batalla {

    public static void simular(Criatura c1, Criatura c2) {
        System.out.println("INICIA BATALLA");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
        }

        if (c1.estaViva()) {
            System.out.println("Ganador: " + c1.nombre);
        } else {
            System.out.println("Ganador: " + c2.nombre);
        }
    }
}
