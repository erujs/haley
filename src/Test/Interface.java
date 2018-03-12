package Test;

import javax.swing.*;
import java.awt.*;

public class Interface extends Canvas{

    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 320;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "";

    public void init() {
        Interface ui = new Interface();

        ui.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        ui.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        ui.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        JFrame frame = new JFrame(ui.TITLE);
        frame.add(ui);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
