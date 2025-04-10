import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField principalField, rateField, timeField, compoundField;
    private JLabel resultLabel;

    public GUI() {
        setTitle("Interest Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Creating UI Components
        add(new JLabel("Principal Amount:"));
        principalField = new JTextField();
        add(principalField);
        add(new JLabel("Rate of Interest (% per year):"));
        rateField = new JTextField();
        add(rateField);
        add(new JLabel("Time (years):"));
        timeField = new JTextField();
        add(timeField);
        add(new JLabel("Compounded per Year (Enter 1 for Simple Interest):"));
        compoundField = new JTextField();
        add(compoundField);

        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);

        resultLabel = new JLabel("Result will be shown here.");
        add(resultLabel);

        // Action Listener for Button Click
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateInterest();
            }
        });

        setVisible(true);
    }

    private void calculateInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());
            int n = Integer.parseInt(compoundField.getText());

            double simpleInterest = (principal * rate * time) / 100;
            double compoundInterest = principal * Math.pow((1 + (rate / (100 * n))), n * time) - principal;

            resultLabel.setText("<html>Simple Interest: " + simpleInterest + "<br>Compound Interest: " + compoundInterest + "</html>");
        } catch (Exception ex) {
            resultLabel.setText("Invalid input. Please enter numeric values.");
        }
    }
    public static void main(String[] args) {
        new GUI();
    }
}


