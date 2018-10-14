package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Eru on 4/1/2016.
 */
public class Interface {

    public JTextField message;
    public JLabel pic;
    public TextArea convo;

//    private static final long serialVersionUID = 1L;
//    public static final int WIDTH = 320;
//    public static final int HEIGHT = WIDTH / 12 * 9;
//    public static final int SCALE = 2;
    public JFrame frame;

    public void init() {
//        ui.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
//        ui.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
//        ui.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        JFrame frame = new JFrame("");
//        frame.add(ui);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setBounds(100, 100, 700, 702);

        Algo a = new Algo();
        message = new JTextField();
        message.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent arg0) {
                if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
                    String response = message.getText();
                    convo.append("You: " + response + "\n");
                    convo.append(a.reply(response));
                }
            }
        });
        message.setBounds(31, 513, 375, 31);
        frame.getContentPane().add(message);
        message.setColumns(10);

        //  Conversation History
        convo = new TextArea("Haley: Hello World!\n", 4 , 99 , TextArea.SCROLLBARS_NONE);
        convo.setFocusable(false);
        convo.setEditable(false);
        convo.setBounds(31, 376, 375, 126);
        frame.getContentPane().add(convo);

        //  Set Life Hack Picture
        pic = new JLabel();
        pic.setBounds(31, 24, 339, 339);
        Icon img = a.img(1);
        pic.setIcon(img);
        frame.getContentPane().add(pic);

        //  Set Background Picture
        JLabel bennett = new JLabel();
        bennett.setIcon(new ImageIcon(Main.class.getResource("/pics/Haley" + ".jpg")));
        frame.getContentPane().add(bennett);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}