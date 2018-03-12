package Test;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Interface ui = new Interface();
        ui.init();
        Engine e = new Engine();
        e.start();
    }
}
