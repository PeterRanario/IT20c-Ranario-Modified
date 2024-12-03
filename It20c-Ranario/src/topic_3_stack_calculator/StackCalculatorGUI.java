/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_stack_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

/**
 *
 * @author Peter
 */
public class StackCalculatorGUI extends JFrame implements ActionListener {
    private Stack<Integer> numberStack = new Stack<>();
    private JTextArea displayArea;

    public StackCalculatorGUI() {
        
         setTitle("Stack Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);
        
        JLabel headerLabel = new JLabel("Stack Calculator", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(headerLabel, BorderLayout.NORTH);

    }
}
