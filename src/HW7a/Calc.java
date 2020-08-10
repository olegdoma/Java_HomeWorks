package HW7a;

import javax.swing.*;
import java.awt.*;



public class Calc extends JFrame {
    public Calc()  {
        setBounds(200,200,400,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Калькулятор");
        Font font = new Font("Times New Roman", Font.PLAIN, 20);
//        setLayout(new GridLayout());
        JTextArea display = new JTextArea();
        display.setFont(font);
        add(display, BorderLayout.NORTH);
//        JButton button1 = new JButton("1");
//        button1.addActionListener(e -> {display.append("1");});
//        button1.setFont(font);
//       add(button1);

        JPanel buttons = new JPanel(new GridLayout(5,3));

        JButton button1 = new JButton("1");
        button1.addActionListener(e -> {display.append("1");});
        button1.setFont(font);
        buttons.add(button1);

        JButton button2 = new JButton("2");
        button2.addActionListener(e -> {display.append("2");});
        button2.setFont(font);
        buttons.add(button2);

        JButton button3 = new JButton("3");
        button3.addActionListener(e -> {display.append("3");});
        button3.setFont(font);
        buttons.add(button3);

        JButton button4 = new JButton("4");
        button4.addActionListener(e -> {display.append("4");});
        button4.setFont(font);
        buttons.add(button4);

        JButton button5 = new JButton("5");
        button5.addActionListener(e -> {display.append("5");});
        button5.setFont(font);
        buttons.add(button5);

        JButton button6 = new JButton("6");
        button6.addActionListener(e -> {display.append("6");});
        button6.setFont(font);
        buttons.add(button6);

        JButton button7 = new JButton("7");
        button7.addActionListener(e -> {display.append("7");});
        button7.setFont(font);
        buttons.add(button7);

        JButton button8 = new JButton("8");
        button8.addActionListener(e -> {display.append("8");});
        button8.setFont(font);
        buttons.add(button8);

        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {display.append("9");});
        button9.setFont(font);
        buttons.add(button9);

        JButton button0 = new JButton("0");
        button0.addActionListener(e -> {display.append("0");});
        button0.setFont(font);
        buttons.add(button0);

        JButton buttonMult = new JButton("*");
        buttonMult.addActionListener(e -> {display.append("*");});
        buttonMult.setFont(font);
        buttons.add(buttonMult);

        JButton buttonDiv = new JButton("/");
        buttonDiv.addActionListener(e -> {display.append("/");});
        buttonDiv.setFont(font);
        buttons.add(buttonDiv);

        JButton buttonSumm = new JButton("+");
        buttonSumm.addActionListener(e -> {display.append("+");});
        buttonSumm.setFont(font);
        buttons.add(buttonSumm);

        JButton buttonSub = new JButton("-");
        buttonSub.addActionListener(e -> {display.append("-");});
        buttonSub.setFont(font);
        buttons.add(buttonSub);

        JButton buttonEq = new JButton("=");
        buttonEq.addActionListener(e -> {display.append("=");});
        buttonEq.setFont(font);
        buttons.add(buttonEq);
        add(buttons, BorderLayout.SOUTH);

        setVisible(true);
    }

}









