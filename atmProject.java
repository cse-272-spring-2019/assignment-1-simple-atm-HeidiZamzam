package atmproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
//import javax.swing.JTextField;
public class atmProject extends JFrame {
    JButton Validate = new JButton("Enter");
    JLabel Validation= new JLabel("Enter Account Number:");
    JPasswordField AccNo= new JPasswordField(50);
    Customer Client=new Customer("12345678",0.0);
    public atmProject(){
        setLayout(null);
        add(Validation);
        Validation.setBounds(30,30,150, 20);
        add(Validate);
        Validate.setBounds(170, 55, 150, 20);
        add(AccNo);
        AccNo.setBounds(170, 30, 150, 20);
        Validate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(AccNo.getText().equals(Client.getAccno())){
                 
                    MainWindow Menu=new MainWindow(Client);
                    Menu.setVisible(true);
                    Menu.setSize(500,400);
                    setVisible(false);
                }
                else 
                  JOptionPane.showMessageDialog(null,"Error!Renter Account Number");
            }
        });
    }
}