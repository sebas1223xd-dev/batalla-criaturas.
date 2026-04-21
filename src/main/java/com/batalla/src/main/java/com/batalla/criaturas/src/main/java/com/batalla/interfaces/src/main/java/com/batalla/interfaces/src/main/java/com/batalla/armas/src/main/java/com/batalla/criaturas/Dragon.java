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
public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        if (arma != null) daño += arma.getDañoAdicional();
        System.out.println(nombre + " ataca 🔥");
        objetivo.defender(daño);
    }

    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " vida: " + salud);
    }

    public void volar() {
        System.out.println(nombre + " vuela");
    }

    public void aterrizar() {
        System.out.println(nombre + " aterriza");
    }
}
