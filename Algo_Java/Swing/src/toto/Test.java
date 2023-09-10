package toto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test extends JFrame {
	private static final long serialVersionUID = 3760732939152718913L;
	private int x = 0;
    private JLabel label;

    public Test() {
        // Configure la JFrame
        setTitle("Variable Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // Crée un JLabel pour afficher la variable x
        label = new JLabel("x = " + x);
        add(label);

        // Crée un JButton pour incrémenter x
        JButton incrementButton = new JButton("+");
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x++;
                label.setText("x = " + x);
            }
        });
        add(incrementButton);

        // Crée un JButton pour décrémenter x
        JButton decrementButton = new JButton("-");
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x--;
                label.setText("x = " + x);
            }
        });
        add(decrementButton);

        // Affiche la JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test();
            }
        });
    }
}