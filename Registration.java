import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Registration extends JFrame implements ActionListener {
    JLabel name, roll, faculty;
    JTextField txtname, txtroll, txtfaculty;
    JButton register,clear;
    Registration(){
        name=new JLabel("Name: ");
        roll=new JLabel("Roll no: ");
        faculty=new JLabel("Faculty: ");

        txtname=new JTextField();
        txtroll=new JTextField();
        txtfaculty=new JTextField();

        register=new JButton("Register");
        clear=new JButton("Clear");

        register.addActionListener(this);
        clear.addActionListener(this);
        
        setLayout(new GridLayout(4,2,10,10));

        add(name);
        add(txtname);

        add(roll);
        add(txtroll);

        add(faculty);
        add(txtfaculty);

        add(register);
        add(clear);

        setTitle("Registration Form");
        setSize(320,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==register){
            JFrame resultframe= new JFrame("Student Information: ");
            resultframe.setSize(300,200);
            resultframe.setLayout(new GridLayout(3,1));

            JLabel Name=new JLabel("Name: "+txtname.getText());
            JLabel Roll=new JLabel("Roll no: "+txtroll.getText());
            JLabel Faculty=new JLabel("Faculty: "+txtfaculty.getText());

            resultframe.add(Name);
            resultframe.add(Roll);
            resultframe.add(Faculty);

            resultframe.setVisible(true);
        }
        if(e.getSource()==clear){
            txtname.setText("");
            txtroll.setText("");
            txtfaculty.setText("");
        }
    }
    public static void main(String[] args){
        new Registration();
    }
}
