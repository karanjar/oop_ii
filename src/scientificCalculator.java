import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class scientificCalculator implements ActionListener {

    JTextField tf;
    JButton  ob1,ob2,ob4,ob5,ob6,ob7,ob8,ob9,ob10,ob11,ob12,ob13,ob14,ob15,ob16;
    JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    scientificCalculator(){
        JFrame f = new JFrame("scientifcCalculator");

        tf = new JTextField();
        tf.setBounds(60,60,340,40);

        ob1 = new JButton("+");
        ob1.setBounds(270,360,60,60);

        ob2 = new JButton("-");
        ob2.setBounds(270,280,60,60);

        ob4 = new JButton("*");
        ob4.setBounds(270,200,60,60);

        ob5 = new JButton("/");
        ob5.setBounds(270,120,60,60);

        ob6 = new JButton("%");
        ob6.setBounds(130,440,60,60);

        ob7 = new JButton("sqrt");
        ob7.setBounds(130,120,60,60);

        ob8 = new JButton("sin");
        ob8.setBounds(200,120,60,60);

        ob9 = new JButton("C");
        ob9.setBounds(60,120,60,60);
        ob9.setBackground(Color.ORANGE);

        ob10 = new JButton("=");
        ob10.setBounds(340,440,60,60);

        ob11 = new JButton("X");
        ob11.setBounds(200,440,60,60);

        ob12 = new JButton("x^2");
        ob12.setBounds(340,120,60,60);

        ob13 = new JButton("^");
        ob13.setBounds(340,200,60,60);

        ob14 = new JButton("log");
        ob14.setBounds(340,280,60,60);

        ob15 = new JButton("π");
        ob15.setBounds(340,360,60,60);

        ob16 = new JButton("exp");
        ob16.setBounds(270,440,60,60);

        n1 = new JButton("1");
        n1.setBounds(60,360,60,60);

        n2 = new JButton("2");
        n2.setBounds(130,360,60,60);

        n3 = new JButton("3");
        n3.setBounds(200,360,60,60);

        n4= new JButton("4");
        n4.setBounds(60,280,60,60);

        n5 = new JButton("5");
        n5.setBounds(130,280,60,60);

        n6 = new JButton("6");
        n6.setBounds(200,280,60,60);

        n7 = new JButton("7");
        n7.setBounds(60,200,60,60);

        n8 = new JButton("8");
        n8.setBounds(130,200,60,60);

        n9 = new JButton("9");
        n9.setBounds(200,200,60,60);

        n10 = new JButton("0");
        n10.setBounds(60,440,60,60);


        ob1.addActionListener(this);
        ob2.addActionListener(this);
        ob4.addActionListener(this);
        ob5.addActionListener(this);
        ob6.addActionListener(this);
        ob7.addActionListener(this);
        ob8.addActionListener(this);
        ob9.addActionListener(this);
        ob10.addActionListener(this);
        ob11.addActionListener(this);
        ob12.addActionListener(this);
        ob13.addActionListener(this);
        ob14.addActionListener(this);
        ob15.addActionListener(this);
        ob16.addActionListener(this);

        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n10.addActionListener(this);

        ob10.setBackground(Color.cyan);

        f.add(tf);
        f.add(ob1);f.add(ob2);;f.add(ob4);f.add(ob5);f.add(ob6);f.add(ob7);f.add(ob8);f.add(ob9);f.add(ob10);f.add(ob11);f.add(ob12);f.add(ob13);f.add(ob14);f.add(ob15);f.add(ob16);

        f.add(n1); f.add(n2); f.add(n3); f.add(n4); f.add(n5); f.add(n6); f.add(n7); f.add(n8); f.add(n9); f.add(n10);
        f.setSize(420,500);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();

        if (cmd.charAt(0)>= '0' && cmd.charAt(0) <='9'){
            tf.setText(tf.getText() + cmd);
        } else if (cmd.equals("C")) {
            tf.setText("");
        } else if (cmd.equals("sqrt")) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(Math.sqrt(num1)));
        } else if (cmd.equals("x^2")) {
            Double val = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(val * val));
        } else if (cmd.equals("log")) {
            Double val = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(Math.log10(val)));
        } else if (cmd.equals("exp")) {
            tf.setText(String.valueOf(Math.E));
        } else if (cmd.equals("sin")) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(Math.sin(Math.toRadians(num1))));
        } else if (cmd.equals("π")) {
            tf.setText(String.valueOf(Math.PI));
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (operator){
                case '+': result = num1 + num2;break;
                case '-': result = num1 - num2;break;
                case '*': result = num1 * num2;break;
                case '/': result = num1 / num2;break;
                case '%': result = num1 % num2;break;
                case '^': result = Math.pow(num1,num2);
            }
            tf.setText(String.valueOf(result));
        } else if (cmd.equals("X")) {
            String currentText = tf.getText();

            if (!currentText.isEmpty()){
                String newText = currentText.substring(0,currentText.length() -1);
                tf.setText(newText);
            }
        } else {
            num1 = Double.parseDouble(tf.getText());
            operator = cmd.charAt(0);
            tf.setText("");
        }
    }
    public static void main(String[] args){
        new scientificCalculator();

    }
}