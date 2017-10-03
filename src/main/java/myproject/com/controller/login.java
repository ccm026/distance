package myproject.com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@RestController
public class login {
    private JPanel frame;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField user;
    private JPasswordField pass;
    private JButton OKButton;


    @RequestMapping ("/")
    public void initialize() {
        JFrame panel = new JFrame("Distance Monitoring");
        panel.setContentPane((new login().frame));
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.pack();
        frame.setVisible(true);
         }

    private login() {
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
