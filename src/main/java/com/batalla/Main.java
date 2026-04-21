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
