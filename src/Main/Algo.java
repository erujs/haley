package Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eru on 4/1/2016.
 */
public class Algo extends Interface{

    public int img;

    public String reply(String statement) {
        String haley = statement;
        haley = haley.toLowerCase();
        String str = new String();

        if(haley.contains("tshirt")|| haley.contains("shirt")) {
            str = "Haley: A lifehack for you ;)\n";
            img = 1;
        } else{
            str = "Haley: ?\n";
            img = 0;
        }
        return str;
    }
//    public Icon img(int p) {
//
//        if (p == 1) {
//            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
//            return img1;
//        } else {
//            return null;
//        }
//    }

}

    /*public TextArea reply(String say){

        if(haley.contains("tshirt")|| haley.contains("shirt")){
            convohist.append("Haley: A lifehack for you ;)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
            lhpic.setIcon(img1);
        }
        /*
        else if(haley.contains("what is your name")|| haley.contains("goodbye")|| haley.contains("what's your name")|| haley.contains("whats your name")){
            convohist.append("Haley: I'm Haley, your personal lifehacks adviser. Want to learn about lifehacks?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }  else if(haley.contains("no")||haley.contains("i dont like")||haley.contains("i don't like")||haley.contains("i do not like")){
            convohist.append("Haley: Life hacks can be a great help on your daily living. I'm sure you want to know atleast one\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        } else if(haley.contains("what is your age") || haley.contains("how old are you")|| haley.contains("what's your age")|| haley.contains("whats your age")){
            convohist.append("Haley: I am already 23 meaning I am able to tell you some lifehacks. Wanana give it a try?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bye")|| haley.contains("goodbye")){
            convohist.append("Haley: Awww, I will miss you..See yah!\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("what is lifehack")|| haley.contains("definition")|| haley.contains("what is life hack")||haley.contains("meaning of life hack")||haley.contains("meaning of lifehack")){
            convohist.append("Haley: Lifehacks are strategy or techniques adopted in order to manage one's time and daily activities in a more efficient way. Do want to know more?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }
        else if(haley.contains("how are you")|| haley.contains("how do you do" )){
            convohist.append("Haley: I'm good thank you.  Want to learn about lifehacks?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }
        else if(haley.contains("teach me") || haley.contains("technique")|| haley.contains("help")){
            convohist.append("Haley: What specific lifehack do you want to know?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("what lifehack you know") || haley.contains("vocabulary") || haley.contains("category")){
            convohist.append("Haley: Many things, for example I can help you use your personalize items into more useful thing");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("have a nice day") || haley.contains("you're beautiful") || haley.contains("you're amazing")){
            convohist.append("Haley: Thank you. Want to learn about lifehacks?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("thank you") || haley.contains("thanks") || haley.contains("tnx")){
            convohist.append("Haley: You are very welcome");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("example")|| haley.contains("prefer")||haley.contains("tell me more")){
            convohist.append("Haley: Here is an example :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("luggage")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (1).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("door") || haley.contains("rubber")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (2).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("aircon")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (3).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("earphone")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (30).jpg"));
            lhpic.setIcon(img1);
        }
        else if(haley.contains("smartphone")||haley.contains("sunglasses")||haley.contains("android")||haley.contains("movie")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (4).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("waterproof")||haley.contains("shoes")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (5).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("card")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (6).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("iron")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (7).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("newspaper")||haley.contains("trash")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (8).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("lace")||haley.contains("washing machine")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (9).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("wallet")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (10).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("christmas")||haley.contains("decoration")){
            convohist.append("Haley: Here. Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (11).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("soap")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (12).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("milk")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (13).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("car")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (14).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("selfie")||haley.contains("smile")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (15).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bathroom")||haley.contains("dustpan")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (16).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cook")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (17).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("phone")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (18).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("charger")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (19).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("speaker")||haley.contains("iphone")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (20).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("keyboard")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (21).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("beverage")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (22).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("strawberry")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (23).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bedsheet")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (24).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("alarm")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (25).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("paint")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (26).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("spoon")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (27).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("slipper")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (28).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("forget")||haley.contains("forgot")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (29).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("lost")||haley.contains("stocking")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (31).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bottle") || haley.contains("water")||haley.contains("tumblr")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (32).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("can opener")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (33).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("sandwich")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (34).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("taco")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (35).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("grocery")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (36).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bacon")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (37).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("egg")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (38).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cupcake")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (39).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("collar")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (40).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("clothes")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (41).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cookie")||haley.contains("summer")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (42).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("blender")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (43).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("popsicle")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (44).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("wire")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (45).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("vinegar")||haley.contains("stain")||haley.contains("shower")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (46).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("hair clip")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (47).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("sponge")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (48).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("pencil")||haley.contains("zipper")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (49).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("closet")||haley.contains("hanger")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (50).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("lemon")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (51).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("math")||haley.contains("number")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (52).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("wine")||haley.contains("hammer")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (53).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("walnut")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (54).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bed")||haley.contains("kids")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (55).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("toothpaste")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (56).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("shovel")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (57).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("pizza")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (58).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("soda")||haley.contains("softdrink")||haley.contains("straw")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (59).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("oreo")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (60).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("remote")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (61).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("money")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (62).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("tape")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (63).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("usb")||haley.contains("television")||haley.contains("tv")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (64).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("document")||haley.contains("bag")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (65).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("beer")||haley.contains("drink")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (66).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("garbage")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (67).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("password")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (68).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("vacuum")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (69).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("lock")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (70).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("food")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (71).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("candle")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (72).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("microwave")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (73).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("screw")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (74).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("garage")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (75).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("case")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (76).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("clothespin")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (77).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bread")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (78).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("refrigerator")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (79).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("fridge")||haley.contains("ice")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (80).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("junkfood")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (81).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("plug")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (82).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("banana")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (83).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("sugar")||haley.contains("tongue")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (84).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("laptop")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (85).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("garden")|| haley.contains("plant")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (86).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("security")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (87).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("seat")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (88).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("sleep")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (89).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("rug")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (90).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("map")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (91).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("open can")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (92).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("study")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (93).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("energy drink")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (94).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("fries")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (95).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cereal")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (96).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("mallow")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (97).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cake")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (98).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cabinet")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (99).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("vomit")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (100).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("paper clip")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (101).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("spices")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (102).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bin")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (103).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("hard drive")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (104).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("magnet")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (105).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("box")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (106).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cook")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (107).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("corn")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (108).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bowl")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (109).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("omelet")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (110).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("birthday")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (111).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("beer trick")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (112).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("key")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (113).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("loop")||haley.contains("twist")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (114).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cd")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (115).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("dental floss")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (116).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("velcro strip")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (117).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("soap trick")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (118).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("screwdriver")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (119).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("email")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (120).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("keyring")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (121).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("biscuit")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (122).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("tissue")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (123).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bead")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (124).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("dvd")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (125).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("glass")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (126).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("highway")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (127).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("popcorn")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (128).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("dining kit")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (129).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("travel")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (130).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("tennis ball")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (131).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cupholder")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (132).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("brownie")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (133).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("lost way")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (134).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cat")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (135).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("book")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (136).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("accident")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (137).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("chair")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (138).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("jock")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (139).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("pringles")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (140).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("seal")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (141).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("pen")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (142).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("extension")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (143).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bake")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (144).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("comb")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (145).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("clean")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (146).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("aloe vera")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (147).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("vanilla")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (148).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("xerox")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (149).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("board")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (150).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("fruit")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (151).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("dove")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (152).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("ripe")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (153).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("doritos")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (154).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("wound")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (155).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("vlc")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (156).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("toys")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (157).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("loaf")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (158).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("breakfast")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (159).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("jeans")||haley.contains("short")||haley.contains("pants")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (160).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("flour")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (161).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("leak")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (162).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("boil")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (163).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("topping")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (164).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("coin")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (165).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("nail")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (166).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("time")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (167).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("bullet")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (168).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("opener")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (169).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("apple")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (170).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("steamer")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (171).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("toilet")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (172).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("design")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (173).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("sock")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (174).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("squeeze")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (175).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("aluminum")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (176).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("cheese")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (177).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("binder")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (178).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("polish")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (179).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("odor")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (180).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("airplane")){
            convohist.append("Haley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (181).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("Frisbee")){
            convohist.append("Haley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (182).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("elevator")){
            convohist.append("Haley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (183).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("wrinkle")){
            convohist.append("Haley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (184).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("paper")){
            convohist.append("Haley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (185).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("window")){
            convohist.append("Haley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (186).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("table")||haley.contains("desk")){
            convohist.append("Haley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (187).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("fan")){
            convohist.append("Haley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (188).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("hair")){
            convohist.append("Haley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (189).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("light")){
            convohist.append("Haley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (190).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("teacher")){
            convohist.append("Haley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (191).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("student")){
            convohist.append("Haley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (192).jpg"));
            lhpic.setIcon(img1);
        }else if(haley.contains("fuck") || haley.contains("shut up") || haley.contains("bitch")|| haley.contains("ass")|| haley.contains("sex")|| haley.contains("stfu")|| haley.contains("stupid")|| haley.contains("dumb")|| haley.contains("noob")|| haley.contains("ride")|| haley.contains("motel")|| haley.contains("condom")|| haley.contains("pussy")|| haley.contains("suck")|| haley.contains("cock")|| haley.contains("tits")|| haley.contains("boobs")|| haley.contains("vigina")|| haley.contains("penis")|| haley.contains("butt")|| haley.contains("leg")|| haley.contains("lick")|| haley.contains("squirt")|| haley.contains("dick")|| haley.contains("bullshit")|| haley.contains("shit")|| haley.contains("idiot")|| haley.contains("crazy")){
            convohist.append("Haley: Shut up, dont be rude, Stop saying those words \n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }
        else if(haley.contains("hi") || haley.contains("hello")|| haley.contains("greetings")|| haley.contains("hey")){
            convohist.append("Haley: Hey\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }else if(haley.contains("ok")){
            convohist.append("Haley: Okay :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }
        else if(haley.contains("yes")||haley.contains("sure")||haley.contains("ofcourse")||haley.contains("okay")||haley.contains("ok")){
            convohist.append("Haley: What specific lifehack do you want to know?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }
        else{
            convohist.append("Haley: I dont know what your talking about\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lhpic.setIcon(img1);
        }
    }*/
