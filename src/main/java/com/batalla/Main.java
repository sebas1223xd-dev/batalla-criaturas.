package com.batalla;

import com.batalla.batalla.Batalla;
import com.batalla.criaturas.*;

public class Main {
    public static void main(String[] args) {
        Dragon d = new Dragon("Smaug", 100, 20);
        Mago m = new Mago("Gandalf", 80, 15);

        Batalla.simular(d, m);
    }
}
public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon("Smaug", 100, 20);
        Guerrero guerrero = new Guerrero("Aragorn", 90, 15);
        Mago mago = new Mago("Gandalf", 80, 18);

        guerrero.equiparArma(new Arma(5));

        dragon.volar();          // uso interfaz
        mago.lanzarHechizo();   // uso interfaz

        Batalla.pelear(dragon, guerrero);
    }
}
// cambio 1
cambio 1
cambio 2
cambio 3
cambio 4
cambio 5
cambio 6
