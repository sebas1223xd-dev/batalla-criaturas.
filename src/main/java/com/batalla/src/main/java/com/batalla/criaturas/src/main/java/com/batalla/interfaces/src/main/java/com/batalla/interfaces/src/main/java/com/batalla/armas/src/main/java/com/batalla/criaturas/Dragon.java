package com.batalla.criaturas;

import com.batalla.interfaces.Volador;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        if (arma != null) daño += arma.getDaño();

        System.out.println(nombre + " lanza fuego 🔥");
        objetivo.defender(daño);
    }

    public void volar() {
        System.out.println(nombre + " vuela");
    }

    public void aterrizar() {
        System.out.println(nombre + " aterriza");
    }
}
