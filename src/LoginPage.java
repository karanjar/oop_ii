
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");

        JPanel panel = new JPanel();
        panel.setBackground(Color.black);

        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        ImageIcon loginIcon = new ImageIcon("images (9).jpeg");
        Image scaledImage = loginIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        ImageIcon finalIcon = new ImageIcon(scaledImage);
        JButton loginButton = new JButton(finalIcon);

        panel.add(new JLabel("Username: "));
        panel.add(usernameField);


        panel.add(new JLabel("Password: "));
        panel.add(passwordField);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {

                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {

                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });
// adding the elements to the frame

        frame.add(panel);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
