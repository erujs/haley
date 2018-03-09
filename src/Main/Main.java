package Main;

import java.security.AlgorithmParameterGenerator;

/**
 * Created by Eru on 3/19/2016.
 */
public class Main {
    private static Interface ui;

    public static void main(String[] args) {
        ui = new Interface();
        ui.initialize();
    }
}