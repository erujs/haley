package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Eru on 4/1/2016.
 */
public class Interface {

    public JFrame frmHaley;
    public JTextField tf_response;
    public JLabel lbl_screen;
    public TextArea ta_convo;
    private static Algo r;

    public void init() {
        frmHaley = new JFrame();
        frmHaley.setBounds(100, 100, 701, 700);
        frmHaley.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHaley.getContentPane().setLayout(null);
        frmHaley.setLocationRelativeTo(null);

        tf_response = new JTextField();
        tf_response.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
                    String response = tf_response.getText();
                    tf_response.setText("");
                    ta_convo.append("You: "+response+"\n");
                    r = new Algo();
                    r.reply(response);
                }
            }

        });
        tf_response.setBounds(31, 513, 375, 31);
        frmHaley.getContentPane().add(tf_response);
        tf_response.setColumns(10);

        ta_convo = new TextArea();
        ta_convo.setEditable(false);
        ta_convo.setBounds(31, 376, 375, 126);
        frmHaley.getContentPane().add(ta_convo);

        lbl_screen = new JLabel("");
        lbl_screen.setBounds(31, 24, 339, 339);
        frmHaley.getContentPane().add(lbl_screen);

        JLabel lbl_background = new JLabel("");
        lbl_background.setIcon(new ImageIcon(Main.class.getResource("/pics/Haley" + ".jpg")));
        lbl_background.setBounds(-17, 11, 775, 661);
        frmHaley.getContentPane().add(lbl_background);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmHaley.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
//    public void reply(String statement) {
//        String haley = statement;
//        haley = haley.toLowerCase();
//
//        if(haley.contains("tshirt")|| haley.contains("shirt")) {
//            ta_convo.append("Haley: A lifehack for you ;)\n");
//            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/examplePic.jpg"));
//            lbl_screen.setIcon(img1);
//        }
//        else{
//            ta_convo.append("Haley: I dont know what your talking about\n");
//            ImageIcon img1 = new ImageIcon(Main.class.getResource("/pics/blank.png"));
//            lbl_screen.setIcon(img1);
//        }
//    }
}
