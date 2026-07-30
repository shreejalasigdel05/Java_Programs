import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class multiplication extends JFrame implements ActionListener {
    JLabel num1, num2,result;
    JTextField num1t,num2t,resultt;
    JButton mul,exit;
    multiplication()
    {
        num1=new JLabel("Enter the first number: ");
        num2=new JLabel("Enter the second number: ");
        result=new JLabel("Result: ");

        num1t=new JTextField();
        num2t=new JTextField();
        resultt=new JTextField();

        mul=new JButton("mul");
        exit=new JButton("exit");

        mul.addActionListener(this);
        exit.addActionListener(this);

        setLayout(new GridLayout(4,2,10,10));

        add(num1);
        add(num1t);
        add(num2);
        add(num2t);
        add(result);
        add(resultt);
        add(mul);
        add(exit);

        setTitle("Multiplication");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mul){
            int a=Integer.parseInt(num1t.getText());
            int b=Integer.parseInt(num2t.getText());
            int mul=a*b;
            resultt.setText(String.valueOf(mul));
        }
        if(e.getSource()==exit){
            num1t.setText(" ");
            num2t.setText(" ");
            resultt.setText(" ");
        }
    }
    public static void main(String[] args) {
        new multiplication();
    }
}
