import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel jpanel;
    private JButton btnOrder;

    //    JCheckBox cbProgs[] = {cPizza, cBurger, cFries, cTea, cSoftDrinks, cSundae};
    // JRadioButton discountButton[] = {rbNone, rb5, rb10, rb15};



    public FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                if (cPizza.isSelected()){
                    total += 100;
                }
                if (cBurger.isSelected()){
                    total += 80;
                }
                if (cFries.isSelected()){
                    total += 65;
                }
                if (cSoftDrinks.isSelected()){
                    total += 55;
                }
                if (cTea.isSelected()){
                    total += 50;
                }
                if (cSundae.isSelected()){
                    total += 40;
                }

                if (rb5.isSelected()) {
                        total *= 0.95;
                    }

                if (rb10.isSelected()){
                        total *= 0.90;
                    }

                if (rb15.isSelected()){
                        total *= 0.85;
                    }

                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f,"The total price is Php" +  String.format("%.2f", total) );


            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);


    }
}
