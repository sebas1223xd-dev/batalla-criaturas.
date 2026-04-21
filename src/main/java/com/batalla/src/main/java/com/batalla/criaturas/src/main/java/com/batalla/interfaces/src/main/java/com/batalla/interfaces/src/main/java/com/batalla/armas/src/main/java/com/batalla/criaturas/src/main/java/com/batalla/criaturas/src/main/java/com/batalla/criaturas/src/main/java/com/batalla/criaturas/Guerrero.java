package com.batalla.criaturas;

public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) daño += arma.getDaño();

        System.out.println(nombre + " ataca con espada ⚔️");
        objetivo.defender(daño);
    }
}
public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) daño += arma.getDañoAdicional();
        System.out.println(nombre + " ataca ⚔️");
        objetivo.defender(daño);
    }

    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " vida: " + salud);
    }
}
