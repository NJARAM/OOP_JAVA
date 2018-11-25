/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author MOSES
 */
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    private static class NumericHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            double secondOperand;
            String whichButton;
            secondOperand
                    = Double.valueOf(inputField.getText()).doubleValue();
            whichButton = event.getActionCommand();
            if (whichButton.equals("add")) {
                result = result + secondOperand;
            } else {
                result = result-secondOperand; 
            }
            
            register.setText("" + result);
            inputField.setText("");
        }
    }

    private static class ClearHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            result = 0.0;
            register.setText("0.0");
            inputField.setText("");
        }
    }
    private static TextField inputField;
    private static Label register;
    private static Frame calcFrame;
    private static double result;

    public static void main(String[] args) {
        NumericHandler operation;
        ClearHandler clearOperation;
        Label resultLabel;
        Label entryLabel;
        Button add;
        Button subtract;
        Button clear;
        operation = new NumericHandler();
        clearOperation = new ClearHandler();
        result = 0.0;
        resultLabel = new Label("Result:");
        register = new Label("0.0", Label.RIGHT);
        entryLabel = new Label("Enter #:");
        inputField = new TextField("", 10);
        add = new Button("+");
        subtract = new Button("-");
        clear = new Button("Clear");
        add.setActionCommand("add");
        subtract.setActionCommand("subtract");
        clear.setActionCommand("clear");
        add.addActionListener(operation);
        subtract.addActionListener(operation);
        clear.addActionListener(clearOperation);
        calcFrame = new Frame();
        calcFrame.setLayout(new GridLayout(4, 2));
        calcFrame.add(resultLabel);
        calcFrame.add(register);
        calcFrame.add(entryLabel);
        calcFrame.add(inputField);
        calcFrame.add(add);

        calcFrame.add(subtract);
        calcFrame.add(clear);
        calcFrame.pack();
        calcFrame.show();
        calcFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                calcFrame.dispose();
                System.exit(0);
            }
        });
    }
}
