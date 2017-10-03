package myproject.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class controller {

    @RequestMapping("/")
    public void initialize() {
        JFrame panel = new JFrame("Distance Monitoring");
        panel.setContentPane((new login().frame));
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.pack();
        //frame.setVisible(true);

    }
}
