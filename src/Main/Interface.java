package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Interface {

    public JFrame frmHalley;
    public JTextField tf_response;
    private JLabel lbl_screen;
    private TextArea ta_convo;

    public void initialize() {
        frmHalley = new JFrame();
        frmHalley.setTitle("Haley Lifehack Support");
        frmHalley.setBounds(100, 100, 701, 700);
        frmHalley.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHalley.getContentPane().setLayout(null);
        frmHalley.setLocationRelativeTo(null);

        tf_response = new JTextField();
        tf_response.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                if(arg0.getKeyCode()==KeyEvent.VK_ENTER){

                    String response = tf_response.getText();


                    tf_response.setText("");
                    ta_convo.append("You: "+response+"\n");
                    Algo reply = new Algo();
                    reply.Algo();
                    r(response);

                }
            }

        });
        tf_response.setBounds(31, 513, 375, 31);
        frmHalley.getContentPane().add(tf_response);
        tf_response.setColumns(10);

        ta_convo = new TextArea();
        ta_convo.setEditable(false);
        ta_convo.setBounds(31, 376, 375, 126);
        frmHalley.getContentPane().add(ta_convo);

        lbl_screen = new JLabel("");
        lbl_screen.setBounds(31, 24, 339, 339);
        frmHalley.getContentPane().add(lbl_screen);

        JLabel lbl_background = new JLabel("");
        lbl_background.setIcon(new ImageIcon(Main.class.getResource("/pics/Halley.jpg")));
        lbl_background.setBounds(-17, 11, 775, 661);
        frmHalley.getContentPane().add(lbl_background);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmHalley.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
