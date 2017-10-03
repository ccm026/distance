package myproject.com.controller;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public JPanel frame;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField user;
    private JPasswordField pass;
    private JButton OKButton;



    public login() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = pass.getText();
                String username = user.getText();

                if (password.contains("admin") && username.contains("password")) {
                    pass.setText(null);
                    user.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Login error", JOptionPane.ERROR_MESSAGE);
                    pass.setText(null);
                    user.setText(null);
                }
            }

        });

    }
}
