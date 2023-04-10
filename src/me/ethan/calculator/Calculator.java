package me.ethan.calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JPanel topPanel;
    JPanel mainPanel;

    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton addButton;
    JButton minusButton;
    JButton multiButton;
    JButton divideButton;
    JButton negativeButton;
    JButton clearButton;
    JButton equalButton;

    ImageIcon icon;
    JTextField textField;

    public double num1 = 0;
    public double num2 = 0;
    public double result = 0;
    public char operator;

    Calculator(){

        //buttons
        button0 = new JButton("0");
        button0.addActionListener(this);
        button0.setBounds(82,230,71,71);
        button0.setBackground(Color.BLACK);
        button0.setFocusable(false);

        button1 = new JButton("1");
        button1.addActionListener(this);
        button1.setBounds(7,155,71,71);
        button1.setBackground(Color.BLACK);
        button1.setFocusable(false);

        button2 = new JButton("2");
        button2.addActionListener(this);
        button2.setBounds(82,155,71,71);
        button2.setBackground(Color.BLACK);
        button2.setFocusable(false);

        button3 = new JButton("3");
        button3.addActionListener(this);
        button3.setBounds(157,155,71,71);
        button3.setBackground(Color.BLACK);
        button3.setFocusable(false);

        button4 = new JButton("4");
        button4.addActionListener(this);
        button4.setBounds(7,80,71,71);
        button4.setBackground(Color.BLACK);
        button4.setFocusable(false);

        button5 = new JButton("5");
        button5.addActionListener(this);
        button5.setBounds(82,80,71,71);
        button5.setBackground(Color.BLACK);
        button5.setFocusable(false);

        button6 = new JButton("6");
        button6.addActionListener(this);
        button6.setBounds(157,80,71,71);
        button6.setBackground(Color.BLACK);
        button6.setFocusable(false);

        button7 = new JButton("7");
        button7.addActionListener(this);
        button7.setBounds(7,5,71,71);
        button7.setBackground(Color.BLACK);
        button7.setFocusable(false);

        button8 = new JButton("8");
        button8.addActionListener(this);
        button8.setBounds(82,5,71,71);
        button8.setBackground(Color.BLACK);
        button8.setFocusable(false);

        button9 = new JButton("9");
        button9.addActionListener(this);
        button9.setBounds(157,5,71,71);
        button9.setBackground(Color.BLACK);
        button9.setFocusable(false);

        addButton = new JButton("+");
        addButton.addActionListener(this);
        addButton.setBounds(232,5,71,71);
        addButton.setBackground(Color.BLACK);
        addButton.setFocusable(false);

        minusButton = new JButton("-");
        minusButton.addActionListener(this);
        minusButton.setBounds(232,80,71,71);
        minusButton.setBackground(Color.BLACK);
        minusButton.setFocusable(false);

        multiButton = new JButton("*");
        multiButton.addActionListener(this);
        multiButton.setBounds(232,155,71,71);
        multiButton.setBackground(Color.BLACK);
        multiButton.setFocusable(false);

        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        divideButton.setBounds(232,230,71,71);
        divideButton.setBackground(Color.BLACK);
        divideButton.setFocusable(false);

        negativeButton = new JButton("_");
        negativeButton.addActionListener(this);
        negativeButton.setBounds(7,230,71,71);
        negativeButton.setBackground(Color.BLACK);
        negativeButton.setFocusable(false);

        clearButton = new JButton("#");
        clearButton.addActionListener(this);
        clearButton.setBounds(157,230,71,71);
        clearButton.setBackground(Color.BLACK);
        clearButton.setFocusable(false);

        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        equalButton.setBounds(7,305,296,50);
        equalButton.setBackground(Color.BLACK);
        equalButton.setFocusable(false);

        // main
        textField = new JTextField();
        textField.setFocusable(false);
        textField.setBounds(10,10,290,50);
        textField.setBackground(Color.BLACK);
        textField.setFont(new Font("Roboto",Font.BOLD,25));
        textField.setBorder(new LineBorder(Color.WHITE));

        mainPanel = new JPanel();
        mainPanel.setBounds(0,70,325,416);
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setLayout(null);
        mainPanel.add(button0);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(button7);
        mainPanel.add(button8);
        mainPanel.add(button9);
        mainPanel.add(addButton);
        mainPanel.add(minusButton);
        mainPanel.add(multiButton);
        mainPanel.add(divideButton);
        mainPanel.add(negativeButton);
        mainPanel.add(clearButton);
        mainPanel.add(equalButton);

        topPanel = new JPanel();
        topPanel.setBounds(0,0,325,70);
        topPanel.setLayout(null);
        topPanel.setBackground(Color.DARK_GRAY);
        topPanel.add(textField);

        icon = new ImageIcon("icon.png");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Calculator");
        this.setIconImage(icon.getImage());
        this.setSize(325,470);
        this.setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(topPanel);
        this.add(mainPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button0){
           textField.setText(textField.getText()+"0");

            if(num1 == 0){
                num1 = num1 + 0;
            }else {
                num2 = num2 + 0;
            }
        }

        if(e.getSource()==button1){
            textField.setText(textField.getText()+"1");

            if(num1 == 0){
                num1 = num1 + 1;
            }else {
                num2 = num2 + 1;
            }
        }

        if (e.getSource()==button2){
            textField.setText(textField.getText()+"2");

            if(num1 == 0){
                num1 = num1 + 2;
            }else {
                num2 = num2 + 2;
            }
        }

        if(e.getSource()==button3){
            textField.setText(textField.getText()+"3");

            if(num1 == 0){
                num1 = num1 + 3;
            }else {
                num2 = num2 + 3;
            }
        }

        if(e.getSource()==button4){
            textField.setText(textField.getText()+"4");

            if(num1 == 0){
                num1 = num1 + 4;
            }else {
                num2 = num2 + 4;
            }
        }

        if(e.getSource()==button5){
            textField.setText(textField.getText()+"5");

            if(num1 == 0){
                num1 = num1 + 5;
            }else {
                num2 = num2 + 5;
            }
        }

        if(e.getSource()==button6){
            textField.setText(textField.getText()+"6");

            if(num1 == 0){
                num1 = num1 + 6;
            }else {
                num2 = num2 + 6;
            }
        }

        if(e.getSource()==button7){
            textField.setText(textField.getText()+"7");

            if(num1 == 0){
                num1 = num1 + 7;
            }else {
                num2 = num2 + 7;
            }
        }

        if(e.getSource()==button8){
            textField.setText(textField.getText()+"8");

            if(num1 == 0){
                num1 = num1 + 8;
            }else {
                num2 = num2 + 8;
            }
        }

        if(e.getSource()==button9){
            textField.setText(textField.getText()+"9");

            if(num1 == 0){
                num1 = num1 + 9;
            }else {
                num2 = num2 + 9;
            }
        }

        if(e.getSource()==addButton){
            textField.setText(textField.getText()+"+");
            operator = '+';
        }

        if(e.getSource()==minusButton){
            textField.setText(textField.getText()+"-");
            operator = '-';
        }

        if(e.getSource()==multiButton){
            textField.setText(textField.getText()+"*");
            operator = '*';
        }

        if(e.getSource()==divideButton){
            textField.setText(textField.getText()+"/");
            operator = '/';
        }

        if(e.getSource()==clearButton){
            textField.setText("");
            num1=0;
            num2=0;
            result=0;
        }

        if(e.getSource()==negativeButton){
            textField.setText("-" + textField.getText());
        }


        if(e.getSource()==equalButton) {

            if(textField.getText().contains("+")){
                result = num1 + num2;
            }

            if(textField.getText().contains("-")){
                result = num1 - num2;
            }

            if(textField.getText().contains("*")){
                result = num1*num2;
            }

            if(textField.getText().contains("/")){
                result = num1/num2;
            }
            textField.setText(String.valueOf(result));
            num1 =result;
            num2 = 0;
            result=0;
        }
    }
}