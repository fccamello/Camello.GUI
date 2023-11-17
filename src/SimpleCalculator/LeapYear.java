package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public LeapYear() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame f = null;
                    int year = Integer.parseInt(tfYear.getText());

                    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                        f = new JFrame();
                        JOptionPane.showMessageDialog(f, "Leap year");
                    } else {
                        f = new JFrame();
                        JOptionPane.showMessageDialog(f, "Not a Leap year");
                    }
                }
                catch (Exception d){
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Invalid Input.");
                    System.out.println("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);

    }


}

