package Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eru on 4/1/2016.
 */
public class Algo extends Interface {
    public int img;
    //  brute force algorithm
    public String reply(String statement) {
        String h = "Haley: ";
//        h.setColor(ORANGE);
        String haley = statement;
        haley = haley.toLowerCase();
        String str = new String();

        if (haley.contains("lifehack") ||
                haley.contains("definition") ||
                haley.contains("life hack") ||
                haley.contains("")) {
            str = h + "Lifehacks are strategy or techniques adopted in order to manage one's time and daily activities in a more efficient way. \n";
            img = 1;
        } else {
            str = h + "?\n";
            img = 0;
        }
        return str;
    }
    //  returns life hack image
    public Icon img(String p) {

        if (p == "a") {
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
            return img1;
        } else {
            return null;
        }
    }
}