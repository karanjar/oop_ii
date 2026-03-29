import javax.swing.*;
import java.awt.event.*;

public class checkBoxExample extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cj1,cj2,cj3;
    JButton b;
    checkBoxExample(){
        l = new JLabel("food ordering");
        l.setBounds(50,50,300,20);

        cj1 = new JCheckBox("pizza @ 100");
        cj1.setBounds(100,100,150,20);

        cj2 = new JCheckBox("burger @ 30");
        cj2.setBounds(100,150,150,20);

        cj3 = new JCheckBox("tea @ 20");
        cj3.setBounds(100,200,150,20);

        b = new JButton("order");
        b. setBounds(100,250,80,20);
        b.addActionListener(this);

        add(l);add(cj1);add(cj2);add(cj3);add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        float amount = 0;
        String msg = "";
        if(cj1.isSelected()){
            amount += 100;
            msg = "pizza:100\n";
        }if (cj2.isSelected()) {
            amount += 30;
            msg = "burger:20\n";
        }if (cj3.isSelected()) {
            amount += 20;
            msg = "tea:20\n";

        }
        msg +="____________________\n";
        JOptionPane.showMessageDialog(this,msg+"total: " + amount);
    }
    public static void main (String[] args){
        new checkBoxExample();
    }
}
