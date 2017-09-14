package program2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameColors {
         private static final int BUTTON_WIDTH= 100;
         private static final int BUTTON_HEIGHT= 400;
         private JButton btnRed;
         private JButton btnGreen;
         private JButton btnYellow;
         private JButton btnBlue;
         private JButton btnIndigo;
         private JButton btnViolet;
         private JButton btnOrange;

         private JFrame frame;

    FrameColors(){
         frame=new JFrame();
         frame.pack();
         frame.setTitle("Rainbow Color Frame");
         frame.setSize(800,500);
         frame.setLayout(new FlowLayout(FlowLayout.LEFT));
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         btnBlue=new JButton();
         btnBlue.setBackground(Color.BLUE);
         btnBlue.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
         //btnBlue.setBounds(0,0,100,400);

         btnRed=new JButton();
         btnRed.setBackground(Color.RED);
         btnRed.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));

         btnGreen=new JButton();
         btnGreen.setBackground(Color.GREEN);
         btnGreen.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));

         btnYellow=new JButton();
         btnYellow.setBackground(Color.YELLOW);
         btnYellow.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));

         btnOrange=new JButton();
         btnOrange.setBackground(Color.ORANGE);
         btnOrange.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));

         btnViolet=new JButton();
         btnViolet.setBackground(Color.getHSBColor(300, 45, 93));
         btnViolet.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));

         btnIndigo=new JButton();
         btnIndigo.setBackground(Color.getHSBColor(232, 100, 78));
         btnIndigo.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));

         frame.add(btnRed);
         frame.add(btnOrange);
         frame.add(btnYellow);
         frame.add(btnGreen);
         frame.add(btnBlue);
         frame.add(btnIndigo);
         frame.add(btnViolet);

         //Event handling for buttons
        ButtonHandler btnHandler = new ButtonHandler();
        btnBlue.addActionListener(btnHandler);
        btnRed.addActionListener(btnHandler);
        btnGreen.addActionListener(btnHandler);
        btnYellow.addActionListener(btnHandler);
        btnOrange.addActionListener(btnHandler);
        btnIndigo.addActionListener(btnHandler);
        btnViolet.addActionListener(btnHandler);
    }

    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();

            if(source==btnBlue){
                JOptionPane.showMessageDialog(source, source.getText()
                        + "Blue represents Spirituality and Divinity.");
            }else if(source==btnRed){
                JOptionPane.showMessageDialog(source, source.getText()
                        + "Red signifies passion, vitality, enthusiasm and security.");
            }else if(source==btnYellow){
                JOptionPane.showMessageDialog(source, source.getText()
                        + "Yellow represents clarity of thought, wisdom, orderliness and energy.");
            }else if(source==btnGreen){
                JOptionPane.showMessageDialog(source, source.getText()
                        + "Green represents fertility, growth, balance, health and wealth.");
            }else if(source==btnViolet){
                JOptionPane.showMessageDialog(source, source.getText()
                        + "Violet represents denote high spiritual mastery.");
            }else if(source==btnOrange){
                JOptionPane.showMessageDialog(source, source.getText()
                        + " Orange represents creativity, practicality, playfulness as well as equilibrium or control.");
            }
            else{
                JOptionPane.showMessageDialog(source, source.getText()
                        + "Indigo represents spiritual attainment, psychic abilities, self awareness and enhancement of Intuition.");
            }
        }
    }

    public static  void main(String [] args){
        new FrameColors();
    }
}
