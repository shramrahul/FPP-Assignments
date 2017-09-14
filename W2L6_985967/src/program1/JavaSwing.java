package program1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaSwing {
    private JFrame frame;
    private TextField inputField;
    private TextField outputField;

    private JButton btnCountLetters;
    private JButton btnReverseLetters;
    private JButton btnRemoveDuplicates;

    private static final int BUTTON_WIDTH =200;
    private static final int BUTTON_HEIGHT =50;

    private static final int TEXT_FIELD_WIDTH =200;
    private static final int TEXT_FIELD_HEIGHT =50;




    JavaSwing(){
        frame=new JFrame();

      //  frame.pack();
        frame.setTitle("String Utility");
        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCountLetters =new JButton("Count Letters");
        btnCountLetters.setBounds(100,100, BUTTON_WIDTH, BUTTON_HEIGHT);


        btnRemoveDuplicates =new JButton("Remove Duplicates");
        btnRemoveDuplicates.setBounds(100,200, BUTTON_WIDTH, BUTTON_HEIGHT);


        btnReverseLetters =new JButton("Reverse Letters");
        btnReverseLetters.setBounds(100,300, BUTTON_WIDTH, BUTTON_HEIGHT);


        inputField=new TextField();
        inputField.setBounds(400,150, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);

        outputField=new TextField();
        outputField.setBounds(400,250, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);


        //adding components in the frame
        frame.add(btnCountLetters);
        frame.add(btnRemoveDuplicates);
        frame.add(btnReverseLetters);
        frame.add(inputField);
        frame.add(outputField);


        ButtonHandler btnHandler = new ButtonHandler();
        btnCountLetters.addActionListener(btnHandler);
        btnReverseLetters.addActionListener(btnHandler);
        btnRemoveDuplicates.addActionListener(btnHandler);

    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            String input= inputField.getText();
            JButton source = (JButton) event.getSource();

            if(source==btnCountLetters){
                int value=getLengthOfString(input);
                outputField.setText(String.valueOf(value));

            }else if(source==btnReverseLetters){
                outputField.setText(getReverseString(input));

            }else if(source==btnRemoveDuplicates){
                outputField.setText(removeDuplicatesfrom(input));

            }
        }
    }

    public static void main(String [] args){
    new JavaSwing();
    }

    public int getLengthOfString(String string){
        return string.length();
    }

    public String getReverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }

    public String removeDuplicatesfrom(String string){
        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }
}
