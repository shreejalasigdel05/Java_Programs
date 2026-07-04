import javax.swing.*;
public class Loginform extends JFrame {
    JLabel user,pass;
    JTextField usertext;
    JPasswordField passtext;
    JButton login;

    Loginform(){
        user= new JLabel("Username: ");
        pass= new JLabel("Password: ");

        usertext=new JTextField();
        passtext=new JPasswordField();

        login= new JButton("Login");

        user.setBounds(40, 40, 80, 25);
        usertext.setBounds(130, 40, 150, 25);

        pass.setBounds(40, 80, 80, 25);
        passtext.setBounds(130, 80, 150, 25);

        login.setBounds(120, 130, 100, 30);

        add(user);
        add(usertext);
        add(pass);
        add(passtext);
        add(login);
        setTitle("Login Form");
        setSize(350,220);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Loginform();
    }
}
