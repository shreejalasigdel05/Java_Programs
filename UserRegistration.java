import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserRegistration extends JFrame implements ActionListener {
    JLabel fn,ln,email,username,phone,password;
    JTextField fntext,lntext,etext,usertext,phonetext;
    JPasswordField passtext;
    JButton register;
    UserRegistration(){
        fn= new JLabel("First name: ");
        ln=new JLabel("Last name: ");
        username=new JLabel("User Name: ");
        email=new JLabel("Email: ");
        phone=new JLabel("Phone no: ");
        password=new JLabel("Password: ");

        fntext=new JTextField();
        lntext=new JTextField();
        usertext=new JTextField();
        etext=new JTextField();
        phonetext=new JTextField();

        passtext=new JPasswordField();

        register=new JButton("Register");

        register.addActionListener(this);

        setLayout(new GridLayout(7,2,10,10));

        add(fn);
        add(fntext);

        add(ln);
        add(lntext);

        add(username);
        add(usertext);

        add(email);
        add(etext);

        add(phone);
        add(phonetext);

        add(password);
        add(passtext);

        add(register);

        setTitle("User Registration Form");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==register){
            JFrame resultframe= new JFrame("User Information ");
            resultframe.setSize(300,200);
            resultframe.setLayout(new GridLayout(6,1));

            JLabel Name=new JLabel("Name: "+fntext.getText()+" "+ln.getText());
            JLabel Username=new JLabel("Username "+usertext.getText());
            JLabel Email=new JLabel("Email: "+etext.getText());
            JLabel Phoneno=new JLabel("Phone No: "+phonetext.getText());

            resultframe.add(Name);
            resultframe.add(Username);
            resultframe.add(Email);
            resultframe.add(Phoneno);

            resultframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            resultframe.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new UserRegistration();
    }
}
