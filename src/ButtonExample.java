import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Button Example");

        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);

        final JTextField tf1 = new JTextField();
        tf1.setBounds(50,100,150,20);

        JButton b = new JButton("click here");
        JButton b1 = new JButton("reset");

        b.setBounds(200,150,95,30);
        b1.setBounds(50,150,95,30);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                tf.setText("welcome to javapoint");
                tf1.setText("i love java");
            }
        });
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                tf.setText("");
                tf1.setText("");
            }
        });
        ;

        f.add(b);
        f.add(tf);
        f.add(tf1);
        f.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);



    }
}