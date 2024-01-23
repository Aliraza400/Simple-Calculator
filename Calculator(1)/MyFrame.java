import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private Container c;

    private JLabel l1, l2;

    private JTextField t1, t2;

    private JButton add, sub, mul,div;

    private JLabel result;

    MyFrame() {

        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");

        c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("Enter First Number: ");
        l1.setBounds(50, 50,200,30);
        c.add(l1);

        l2 = new JLabel("Enter Second Number: ");
        l2.setBounds(50, 100,200,30);
        c.add(l2);


        t1 = new JTextField();
        t1.setBounds(190,55,120,25);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(190,105,120,25);
        c.add(t2);

        add = new JButton("+");
        add.setBounds(50,140, 60,30);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(140,140, 60,30);
        c.add(sub);

        mul = new JButton("*");
        mul.setBounds(220,140, 60,30);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(300,140, 60,30);
        c.add(div);

        result = new JLabel("Result: ");
        result.setBounds(50, 180, 200,40);
        c.add(result);
        setVisible(true);

        add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        div.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        add.addActionListener(this);

        sub.addActionListener(this);

        mul.addActionListener(this);

        div.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        try {


            if (e.getSource() == add) {

                int a = Integer.parseInt((t1.getText()));

                int b = Integer.parseInt((t2.getText()));

                int c = a + b;

                result.setText("Result: " + c);
            } else if (e.getSource() == sub) {

                int a = Integer.parseInt((t1.getText()));

                int b = Integer.parseInt((t2.getText()));

                int c = a - b;

                result.setText(("Result: " + c));
            } else if (e.getSource() == mul) {

                int a = Integer.parseInt((t1.getText()));

                int b = Integer.parseInt((t2.getText()));

                int c = a * b;

                result.setText("Result: " + c);
            } else if (e.getSource() == div) {

                int a = Integer.parseInt((t1.getText()));

                int b = Integer.parseInt((t2.getText()));

                int c = a / b;

                result.setText("Result: " + c);
            }

        } catch (NumberFormatException i) {

            result.setText("Input an Integer");
        } catch (ArithmeticException i2) {

            result.setText("Cannot Divide by zero");
        }
    }
}

class calc {

    public static void main(String[] args) {

        MyFrame f = new MyFrame();
    }
}
