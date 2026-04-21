package com.batalla.criaturas;

import com.batalla.interfaces.Magico;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) daño += arma.getDaño();

        System.out.println(nombre + " usa magia ✨");
        objetivo.defender(daño);
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza hechizo");
    }

    public void aprenderHechizo() {
        System.out.println(nombre + " aprende hechizo");
    }
}
public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) daño += arma.getDañoAdicional();
        lanzarHechizo();
        objetivo.defender(daño);
    }

    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " vida: " + salud);
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza hechizo ✨");
    }

    public void aprenderHechizo(String h) {}
}
