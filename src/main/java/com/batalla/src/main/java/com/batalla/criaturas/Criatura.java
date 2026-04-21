package com.batalla.criaturas;

import com.batalla.armas.Arma;

public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);

    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " daño. Vida: " + salud);
    }

    public boolean estaViva() {
        return salud > 0;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }
}
public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);

    public boolean estaViva() {
        return salud > 0;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }
}
