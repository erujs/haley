package Main;

import javax.swing.*;

/**
 * Created by Eru on 4/1/2016.
 */
public class Algo extends Interface {

    public ImageIcon img;

    //  brute force algorithm
    public String reply(String statement) {
        String h = "Haley: ";
//        String HD = "Good Day Master!";
        String haley = statement;
        haley = haley.toLowerCase();
        String str;

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
    Icon img(int p) {
        if (p == 1) {
            this.img = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
        }
        return null;
    }
    public Icon getImg(){
        return this.img;
    }
}