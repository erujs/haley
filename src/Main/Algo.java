package Main;

import javax.swing.*;

/**
 * Created by Eru on 4/1/2016.
 */
public class Algo extends Interface {
    //  brute force algorithm
    public String reply(String statement) {
        String h = "Haley: ";
        String haley = statement;
        haley = haley.toLowerCase();
        String str = new String();

        if (haley.contains("lifehack") || haley.contains("life hack")) {
            str = h + "Lifehacks are strategy or techniques adopted in order to manage one's time and daily activities in a more efficient way. \n";
            img(1);
        } else {
            str = h + "?\n";
            img(0);
        }
        return str;
    }

    //  returns life hack image
    public Icon img(int p) {

        if (p == 1) {
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
            return img1;
        } else {
            return null;
        }
    }
}