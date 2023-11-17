package SimpleCalculator;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.black;

public class SimpleCalculator extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResultText;
    private JPanel jpanel;
    private JLabel lblResult;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Border blackline = BorderFactory.createLineBorder(Color.BLACK);
                lblResult.setBorder(blackline);

                try {
                    int num1 = Integer.parseInt(tfNumber1.getText());
                    int num2 = Integer.parseInt(tfNumber2.getText());

                    if (cbOperations.getSelectedIndex() == 0) {
                        int result = num1 + num2;
                        lblResult.setText(String.valueOf(result));
                    }

                    if (cbOperations.getSelectedIndex() == 1) {
                        int result = num1 - num2;
                        lblResult.setText(String.valueOf(result));
                    }

                    if (cbOperations.getSelectedIndex() == 2) {
                        int result = num1 * num2;
                        lblResult.setText(String.valueOf(result));
                    }

                    if (cbOperations.getSelectedIndex() == 3) {
                        try {
                            int result = num1 / num2;
                            lblResult.setText(String.valueOf(result));
                        } catch (Exception d) {
                            JFrame f = new JFrame();
                            JOptionPane.showMessageDialog(f, "2nd number must not be zero.");
                            System.out.println("2nd number must not be zero");
                        }

                    }
                }
                catch (Exception r){
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Invalid Input.");
                    System.out.println("Invalid Input");
                }
            }

        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);

    }



}
