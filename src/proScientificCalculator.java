import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class proScientificCalculator implements ActionListener {

    JFrame f;
    JTextField tf;
    JButton shift, deg, mode, mr, ms, mPlus;
    JButton hyp, sin, cos, tan, ln, log;
    JButton yPowX, sqrt, xSquare, percent, openP, closeP;
    JButton n7, n8, n9, del, ac;
    JButton n4, n5, n6, mult, div;
    JButton n1, n2, n3, add, sub;
    JButton n0, dot, exp, ans, equal;

    double num1 = 0,num2 = 0, result = 0;
    char operator;

    proScientificCalculator() {
        f = new JFrame("Scientific Calculator");
        f.getContentPane().setBackground(new Color(33, 43, 54));

        tf = new JTextField();
        tf.setBounds(20, 20, 350, 80);
        tf.setFont(new Font("Arial", Font.BOLD, 24));
        tf.setBackground(new Color(200, 200, 200));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setEditable(false);

        shift = createBtn("SHIFT", 20, 120, 55, 40, Color.ORANGE);
        deg = createBtn("DEG", 80, 120, 55, 40, Color.DARK_GRAY);
        mode = createBtn("MODE", 140, 120, 55, 40, Color.DARK_GRAY);
        mr = createBtn("MR", 200, 120, 55, 40, Color.DARK_GRAY);
        ms = createBtn("MS", 260, 120, 55, 40, Color.DARK_GRAY);
        mPlus = createBtn("M+", 320, 120, 55, 40, Color.DARK_GRAY);

        hyp = createBtn("hyp", 20, 170, 55, 40, Color.DARK_GRAY);
        sin = createBtn("sin", 80, 170, 55, 40, Color.DARK_GRAY);
        cos = createBtn("cos", 140, 170, 55, 40, Color.DARK_GRAY);
        tan = createBtn("tan", 200, 170, 55, 40, Color.DARK_GRAY);
        ln = createBtn("ln", 260, 170, 55, 40, Color.DARK_GRAY);
        log = createBtn("log", 320, 170, 55, 40, Color.DARK_GRAY);

        yPowX = createBtn("y^x", 20, 220, 55, 40, Color.DARK_GRAY);
        sqrt = createBtn("√", 80, 220, 55, 40, Color.DARK_GRAY);
        xSquare = createBtn("x²", 140, 220, 55, 40, Color.DARK_GRAY);
        percent = createBtn("%", 200, 220, 55, 40, Color.DARK_GRAY);
        openP = createBtn("(", 260, 220, 55, 40, Color.DARK_GRAY);
        closeP = createBtn(")", 320, 220, 55, 40, Color.DARK_GRAY);

        n7 = createBtn("7", 20, 280, 65, 50, Color.LIGHT_GRAY);
        n8 = createBtn("8", 95, 280, 65, 50, Color.LIGHT_GRAY);
        n9 = createBtn("9", 170, 280, 65, 50, Color.LIGHT_GRAY);
        del = createBtn("DEL", 245, 280, 65, 50, new Color(175, 50, 50));
        ac = createBtn("AC", 320, 280, 65, 50, new Color(175, 50, 50));

        n4 = createBtn("4", 20, 340, 65, 50, Color.LIGHT_GRAY);
        n5 = createBtn("5", 95, 340, 65, 50, Color.LIGHT_GRAY);
        n6 = createBtn("6", 170, 340, 65, 50, Color.LIGHT_GRAY);
        mult = createBtn("X", 245, 340, 65, 50, Color.GRAY);
        div = createBtn("÷", 320, 340, 65, 50, Color.GRAY);


        n1 = createBtn("1", 20, 400, 65, 50, Color.LIGHT_GRAY);
        n2 = createBtn("2", 95, 400, 65, 50, Color.LIGHT_GRAY);
        n3 = createBtn("3", 170, 400, 65, 50, Color.LIGHT_GRAY);
        add = createBtn("+", 245, 400, 65, 50, Color.GRAY);
        sub = createBtn("-", 320, 400, 65, 50, Color.GRAY);

        n0 = createBtn("0", 20, 460, 65, 50, Color.LIGHT_GRAY);
        dot = createBtn(".", 95, 460, 65, 50, Color.LIGHT_GRAY);
        exp = createBtn("EXP", 170, 460, 65, 50, Color.LIGHT_GRAY);
        ans = createBtn("Ans", 245, 460, 65, 50, Color.LIGHT_GRAY);
        equal = createBtn("=", 320, 460, 65, 50, Color.GRAY);

        f.add(tf);
        f.setSize(410, 580);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton createBtn(String text, int x, int y, int w, int h, Color bg) {
        JButton b = new JButton(text);
        b.setBounds(x, y, w, h);
        b.setBackground(bg);
        b.setForeground(text.equals("SHIFT") ? Color.BLACK : Color.WHITE);
        b.setFocusable(false);
        b.addActionListener(this);
        f.add(b);
        return b;
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("0123456789.".contains(cmd)) {
            tf.setText(tf.getText() + cmd);
        } else if (cmd.equals("AC")) {
            tf.setText("");
        } else if (cmd.equals("DEL")) {
            String str = tf.getText();
            if (!str.isEmpty()) tf.setText(str.substring(0, str.length() - 1));
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                case '^':
                    result = Math.pow(num1, num2);
            }
            tf.setText(String.valueOf(result));
        }else if (cmd.equals("sin")) {
            tf.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(tf.getText())))));
        }

    }

    public static void main(String[] args) {
        new proScientificCalculator();
    }
}