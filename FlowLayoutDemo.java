import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

public class FlowLayoutDemo extends JFrame{
    public FlowLayoutDemo()
    {
        setLayout(new FlowLayout());
        JLabel Name= new JLabel("Name: ");
        JTextField txtname=new JTextField(20);

        JButton submit=new JButton("submit");
        JButton clear=new JButton("clear");

        add(Name);
        add(txtname);
        add(submit);
        add(clear);

        setTitle("Flow Layout Demo");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
