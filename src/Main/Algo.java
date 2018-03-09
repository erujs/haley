package Main;

import javax.swing.*;
import java.awt.*;

public class Algo {
    private TextArea ta_convo;
    private JLabel lbl_screen;

    public void reply(String say){

        Interface newObj = new Interface();
        newObj.initialize();

        String haley = say;
        haley=haley.toLowerCase();

        if(haley.contains("tshirt")|| haley.contains("shirt")){
            ta_convo.append("Halley: A lifehack for you ;)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
            lbl_screen.setIcon(img1);
        }
        else if(haley.contains("what is your name")|| haley.contains("goodbye")|| haley.contains("what's your name")|| haley.contains("whats your name")){
            ta_convo.append("Halley: I'm Halley, your personal lifehacks adviser. Want to learn about lifehacks?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }  else if(haley.contains("no")||haley.contains("i dont like")||haley.contains("i don't like")||haley.contains("i do not like")){
            ta_convo.append("Halley: Life hacks can be a great help on your daily living. I'm sure you want to know atleast one\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        } else if(haley.contains("what is your age") || haley.contains("how old are you")|| haley.contains("what's your age")|| haley.contains("whats your age")){
            ta_convo.append("Halley: I am already 23 meaning I am able to tell you some lifehacks. Wanana give it a try?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bye")|| haley.contains("goodbye")){
            ta_convo.append("Halley: Awww, I will miss you..See yah!\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("what is lifehack")|| haley.contains("definition")|| haley.contains("what is life hack")||haley.contains("meaning of life hack")||haley.contains("meaning of lifehack")){
            ta_convo.append("Halley: Lifehacks are strategy or techniques adopted in order to manage one's time and daily activities in a more efficient way. Do want to know more?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }
        else if(haley.contains("how are you")|| haley.contains("how do you do" )){
            ta_convo.append("Halley: I'm good thank you.  Want to learn about lifehacks?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }
        else if(haley.contains("teach me") || haley.contains("technique")|| haley.contains("help")){
            ta_convo.append("Halley: What specific lifehack do you want to know?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("what lifehack you know") || haley.contains("vocabulary") || haley.contains("category")){
            ta_convo.append("Halley: Many things, for example I can help you use your personalize items into more useful thing");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("have a nice day") || haley.contains("you're beautiful") || haley.contains("you're amazing")){
            ta_convo.append("Halley: Thank you. Want to learn about lifehacks?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("thank you") || haley.contains("thanks") || haley.contains("tnx")){
            ta_convo.append("Halley: You are very welcome");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("example")|| haley.contains("prefer")||haley.contains("tell me more")){
            ta_convo.append("Halley: Here is an example :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
            lbl_screen.setIcon(img1);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        }else if(haley.contains("luggage")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (1).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("door") || haley.contains("rubber")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (2).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("aircon")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (3).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("earphone")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (30).jpg"));
            lbl_screen.setIcon(img1);
        }
        else if(haley.contains("smartphone")||haley.contains("sunglasses")||haley.contains("android")||haley.contains("movie")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (4).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("waterproof")||haley.contains("shoes")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (5).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("card")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (6).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("iron")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (7).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("newspaper")||haley.contains("trash")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (8).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("lace")||haley.contains("washing machine")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (9).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("wallet")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (10).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("christmas")||haley.contains("decoration")){
            ta_convo.append("Halley: Here. Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (11).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("soap")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (12).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("milk")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (13).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("car")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (14).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("selfie")||haley.contains("smile")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (15).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bathroom")||haley.contains("dustpan")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (16).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cook")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (17).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("phone")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (18).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("charger")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (19).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("speaker")||haley.contains("iphone")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (20).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("keyboard")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (21).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("beverage")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (22).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("strawberry")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (23).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bedsheet")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (24).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("alarm")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (25).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("paint")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (26).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("spoon")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (27).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("slipper")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (28).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("forget")||haley.contains("forgot")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (29).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("lost")||haley.contains("stocking")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (31).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bottle") || haley.contains("water")||haley.contains("tumblr")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (32).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("can opener")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (33).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("sandwich")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (34).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("taco")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (35).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("grocery")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (36).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bacon")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (37).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("egg")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (38).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cupcake")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (39).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("collar")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (40).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("clothes")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (41).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cookie")||haley.contains("summer")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (42).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("blender")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (43).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("popsicle")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (44).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("wire")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (45).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("vinegar")||haley.contains("stain")||haley.contains("shower")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (46).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("hair clip")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (47).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("sponge")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (48).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("pencil")||haley.contains("zipper")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (49).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("closet")||haley.contains("hanger")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (50).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("lemon")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (51).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("math")||haley.contains("number")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (52).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("wine")||haley.contains("hammer")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (53).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("walnut")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (54).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bed")||haley.contains("kids")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (55).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("toothpaste")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (56).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("shovel")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (57).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("pizza")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (58).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("soda")||haley.contains("softdrink")||haley.contains("straw")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (59).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("oreo")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (60).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("remote")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (61).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("money")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (62).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("tape")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (63).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("usb")||haley.contains("television")||haley.contains("tv")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (64).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("document")||haley.contains("bag")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (65).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("beer")||haley.contains("drink")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (66).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("garbage")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (67).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("password")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (68).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("vacuum")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (69).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("lock")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (70).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("food")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (71).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("candle")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (72).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("microwave")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (73).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("screw")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (74).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("garage")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (75).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("case")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (76).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("clothespin")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (77).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bread")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (78).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("refrigerator")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (79).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("fridge")||haley.contains("ice")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (80).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("junkfood")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (81).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("plug")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (82).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("banana")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (83).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("sugar")||haley.contains("tongue")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (84).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("laptop")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (85).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("garden")|| haley.contains("plant")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (86).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("security")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (87).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("seat")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (88).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("sleep")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (89).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("rug")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (90).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("map")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (91).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("open can")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (92).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("study")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (93).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("energy drink")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (94).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("fries")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (95).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cereal")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (96).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("mallow")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (97).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cake")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (98).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cabinet")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (99).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("vomit")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (100).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("paper clip")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (101).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("spices")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (102).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bin")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (103).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("hard drive")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (104).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("magnet")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (105).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("box")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (106).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cook")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (107).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("corn")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (108).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bowl")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (109).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("omelet")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (110).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("birthday")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (111).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("beer trick")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (112).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("key")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (113).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("loop")||haley.contains("twist")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (114).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cd")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (115).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("dental floss")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (116).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("velcro strip")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (117).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("soap trick")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (118).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("screwdriver")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (119).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("email")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (120).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("keyring")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (121).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("biscuit")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (122).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("tissue")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (123).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bead")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (124).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("dvd")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (125).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("glass")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (126).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("highway")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (127).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("popcorn")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (128).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("dining kit")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (129).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("travel")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (130).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("tennis ball")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (131).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cupholder")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (132).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("brownie")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (133).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("lost way")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (134).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cat")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (135).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("book")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (136).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("accident")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (137).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("chair")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (138).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("jock")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (139).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("pringles")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (140).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("seal")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (141).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("pen")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (142).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("extension")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (143).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bake")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (144).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("comb")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (145).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("clean")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (146).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("aloe vera")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (147).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("vanilla")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (148).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("xerox")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (149).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("board")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (150).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("fruit")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (151).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("dove")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (152).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("ripe")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (153).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("doritos")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (154).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("wound")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (155).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("vlc")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (156).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("toys")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (157).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("loaf")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (158).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("breakfast")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (159).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("jeans")||haley.contains("short")||haley.contains("pants")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (160).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("flour")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (161).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("leak")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (162).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("boil")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (163).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("topping")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (164).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("coin")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (165).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("nail")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (166).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("time")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (167).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("bullet")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (168).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("opener")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (169).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("apple")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (170).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("steamer")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (171).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("toilet")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (172).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("design")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (173).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("sock")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (174).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("squeeze")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (175).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("aluminum")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (176).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("cheese")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (177).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("binder")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (178).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("polish")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (179).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("odor")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (180).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("airplane")){
            ta_convo.append("Halley: Okay here is a lifehack for your certain need :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (181).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("Frisbee")){
            ta_convo.append("Halley: Oh, so here's the tip :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (182).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("elevator")){
            ta_convo.append("Halley: Hmm I hope this will help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (183).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("wrinkle")){
            ta_convo.append("Halley: So here's the tecnique for you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (184).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("paper")){
            ta_convo.append("Halley: Oh I've got something for you. Here :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (185).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("window")){
            ta_convo.append("Halley: Sure, here's for your convinient :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (186).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("table")||haley.contains("desk")){
            ta_convo.append("Halley: This information can help you :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (187).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("fan")){
            ta_convo.append("Halley: Oh I know this is very useful :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (188).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("hair")){
            ta_convo.append("Halley: Well try these, you wont regret it :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (189).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("light")){
            ta_convo.append("Halley: This, give it a try :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (190).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("teacher")){
            ta_convo.append("Halley: Dont have a second thought to do this :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (191).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("student")){
            ta_convo.append("Halley: I really think this will help you a lot :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/pic (192).jpg"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("fuck") || haley.contains("shut up") || haley.contains("bitch")|| haley.contains("ass")|| haley.contains("sex")|| haley.contains("stfu")|| haley.contains("stupid")|| haley.contains("dumb")|| haley.contains("noob")|| haley.contains("ride")|| haley.contains("motel")|| haley.contains("condom")|| haley.contains("pussy")|| haley.contains("suck")|| haley.contains("cock")|| haley.contains("tits")|| haley.contains("boobs")|| haley.contains("vigina")|| haley.contains("penis")|| haley.contains("butt")|| haley.contains("leg")|| haley.contains("lick")|| haley.contains("squirt")|| haley.contains("dick")|| haley.contains("bullshit")|| haley.contains("shit")|| haley.contains("idiot")|| haley.contains("crazy")){
            ta_convo.append("Halley: Shut up, dont be rude, Stop saying those words \n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }
        else if(haley.contains("hi") || haley.contains("hello")|| haley.contains("greetings")|| haley.contains("hey")){
            ta_convo.append("Halley: Hey\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }else if(haley.contains("ok")){
            ta_convo.append("Halley: Okay :)\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }
        else if(haley.contains("yes")||haley.contains("sure")||haley.contains("ofcourse")||haley.contains("okay")||haley.contains("ok")){
            ta_convo.append("Halley: What specific lifehack do you want to know?\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }
        else{
            ta_convo.append("Halley: I dont know what your talking about\n");
            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
            lbl_screen.setIcon(img1);
        }
    }
}
