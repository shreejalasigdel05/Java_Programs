import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Addition extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton add,clear;

    Addition(){
        l1=new JLabel("First number: ");
        l2=new JLabel("Second number: ");
        l3=new JLabel("Result: ");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        add=new JButton("Add");
        clear=new JButton("Clear");

        add.addActionListener(this);
        clear.addActionListener(this);

        setLayout(new GridLayout(4,2,10,10));

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(add);
        add(clear);

        setTitle("Addition using swing");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            int a= Integer.parseInt(t1.getText());
            int b= Integer.parseInt(t2.getText());
            int sum= a+b;
            t3.setText(String.valueOf(sum));
        }
        if(e.getSource()==clear){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
    public static void main(String[] args) {
        new Addition();
    }
}