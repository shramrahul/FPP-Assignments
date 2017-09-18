package program2;

import javax.swing.*;
import java.awt.*;

public class MetricConversionAssistant {
    private JFrame frame;

    private static final int TEXT_BOX_WIDTH=200;
    private static final int TEXT_BOX_HEIGHT=50;

    private JLabel LabelForInputMileToKilometer;
    private JLabel LabelForInputPoundToKilogram;
    private JLabel LabelForInputGallonToLiters;
    private JLabel LabelForInputFahrenheitToCentigrades;
    private JLabel LabelForOutputMileToKilometer;
    private JLabel LabelForOutputPoundToKilogram;
    private JLabel LabelForOutputGallonToLiters;
    private JLabel LabelForOutputFahrenheitToCentigrades;

    private TextField inputMileToKilometer;
    private TextField inputPoundToKilogram;
    private TextField inputGallonToLiters;
    private TextField inputFahrenheitToCentigrades;

    private TextField outputMileToKilometer;
    private TextField outputPoundToKilogram;
    private TextField outputGallonToLiters;
    private TextField outputFahrenheitToCentigrades;

    private JButton btnConverter;


    MetricConversionAssistant(){
        frame= new JFrame();

        frame.setTitle("String Utility");
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LabelForInputMileToKilometer=new JLabel();
        LabelForInputMileToKilometer.setText("Miles: ");
        LabelForInputMileToKilometer.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForInputMileToKilometer.setBounds(100,50,100,50);
        frame.add(LabelForInputMileToKilometer);

        inputMileToKilometer = new TextField();
        inputMileToKilometer.setBounds(200,50, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
        frame.add(inputMileToKilometer);

        LabelForInputFahrenheitToCentigrades=new JLabel();
        LabelForInputFahrenheitToCentigrades.setText("Fahrenheit:  ");
        LabelForInputFahrenheitToCentigrades.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForInputFahrenheitToCentigrades.setBounds(100,125,100,50);
        frame.add(LabelForInputFahrenheitToCentigrades);

        inputFahrenheitToCentigrades= new TextField();
        inputFahrenheitToCentigrades.setBounds(200,125,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(inputFahrenheitToCentigrades);

        LabelForInputGallonToLiters=new JLabel();
        LabelForInputGallonToLiters.setText("Gallon: ");
        LabelForInputGallonToLiters.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForInputGallonToLiters.setBounds(100,200,100,50);
        frame.add(LabelForInputGallonToLiters);

        inputGallonToLiters= new TextField();
        inputGallonToLiters.setBounds(200,200,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(inputGallonToLiters);

        LabelForInputPoundToKilogram=new JLabel();
        LabelForInputPoundToKilogram.setText("Pound: ");
        LabelForInputPoundToKilogram.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForInputPoundToKilogram.setBounds(100,275,100,50);
        frame.add(LabelForInputPoundToKilogram);

        inputPoundToKilogram= new TextField();
        inputPoundToKilogram.setBounds(200,275,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(inputPoundToKilogram);

        LabelForOutputMileToKilometer=new JLabel();
        LabelForOutputMileToKilometer.setText("KiloMeter: ");
        LabelForOutputMileToKilometer.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForOutputMileToKilometer.setBounds(500,50,100,50);
        frame.add(LabelForOutputMileToKilometer);

        outputMileToKilometer = new TextField();
        outputMileToKilometer.setBounds(600,275, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
        frame.add(outputMileToKilometer);

        LabelForOutputFahrenheitToCentigrades=new JLabel();
        LabelForOutputFahrenheitToCentigrades.setText("Centigrates:  ");
        LabelForOutputFahrenheitToCentigrades.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForOutputFahrenheitToCentigrades.setBounds(500,125,100,50);
        frame.add(LabelForOutputFahrenheitToCentigrades);

        outputFahrenheitToCentigrades= new TextField();
        outputFahrenheitToCentigrades.setBounds(600,125,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(outputFahrenheitToCentigrades);

        LabelForOutputGallonToLiters=new JLabel();
        LabelForOutputGallonToLiters.setText("Gallon: ");
        LabelForOutputGallonToLiters.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForOutputGallonToLiters.setBounds(500,200,100,50);
        frame.add(LabelForOutputGallonToLiters);

        outputGallonToLiters= new TextField();
        outputGallonToLiters.setBounds(600,200,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(outputGallonToLiters);

        LabelForOutputPoundToKilogram=new JLabel();
        LabelForOutputPoundToKilogram.setText("Kilogram:");
        LabelForOutputPoundToKilogram.setHorizontalAlignment(SwingConstants.RIGHT);
        LabelForOutputPoundToKilogram.setBounds(500,275,100,50);
        frame.add(LabelForOutputPoundToKilogram);

        outputPoundToKilogram= new TextField();
        outputPoundToKilogram.setBounds(600,50,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(outputPoundToKilogram);

        btnConverter=new JButton();
        btnConverter.setText("Converter");
        btnConverter.setBounds(400,350,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT);
        frame.add(btnConverter);

        btnConverter.addActionListener(evt->{
            String strMile=inputMileToKilometer.getText();
            String strPound=inputPoundToKilogram.getText();
            String strGallon=inputGallonToLiters.getText();
            String strFh=inputFahrenheitToCentigrades.getText();

            Double output=0.0;

            try {
                Double mile=Double.valueOf(strPound);
                if (mile == 0) {
                    outputMileToKilometer.setText("0");
                } else {
                    output = mile * 1.60934;
                    outputMileToKilometer.setText(output.toString());
                }
            }catch(Exception ex){
                outputMileToKilometer.setText("invalid");
            }

            try {
                Double pound=Double.valueOf(strMile);
                if (pound == 0) {
                    outputPoundToKilogram.setText("0");
                } else {
                    output=pound*0.453592;
                    outputPoundToKilogram.setText(output.toString());
                }
            }catch(Exception ex){
                outputPoundToKilogram.setText("invalid");
            }

            try {
                Double gallon=Double.valueOf(strGallon);
                if (gallon == 0) {
                    outputGallonToLiters.setText("0");
                } else {
                    output=gallon*3.78541;
                    outputGallonToLiters.setText(output.toString());
                }
            }catch(Exception ex){
                outputGallonToLiters.setText("invalid");
            }

            try {
                Double fh =Double.valueOf(strFh);
                if (fh == 0) {
                    outputFahrenheitToCentigrades.setText("0");
                } else {
                    output=fh*1.8+32;
                    outputFahrenheitToCentigrades.setText(output.toString());
                }
            }catch(Exception ex){
                outputFahrenheitToCentigrades.setText("invalid");
            }

        });
    }

    public static void main(String [] args){
        new MetricConversionAssistant();
    }
}
