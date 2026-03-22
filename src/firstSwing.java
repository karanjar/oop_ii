import javax.swing.*;

public class firstSwing {
    public static void main(String[] args){
        JFrame f = new JFrame();

        JButton b = new JButton("click");
        JButton b1 = new JButton("exit");
        JButton b2 = new JButton("Reset");
        JButton b3 = new JButton("submit");

        b.setBounds(50,100,100,40);
        b1.setBounds(50,200,100,40);
        b2.setBounds(250,200,100,40);
        b3.setBounds(130,300,100,40);


        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);

    }
}

