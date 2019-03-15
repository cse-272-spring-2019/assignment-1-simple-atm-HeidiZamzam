package atmproject;
import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.in;
import java.lang.Object;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class MainWindow extends JFrame {
    JLabel Menu=new JLabel("Main Menu:");
    JButton Withdraw= new JButton("Withdraw Funds");
    JButton Deposit= new JButton("Deposit Funds");
    JButton Inquery= new JButton("Balance Inquery");
    JButton Prev= new JButton("History,Previous Transaction");
    JButton Next= new JButton("History,Next Transaction");
    JButton Done= new JButton("Done");
    JTextField Display= new JTextField(50);
    Customer Client; 
    public MainWindow(Customer Client){
        setLayout(null);
        add(Withdraw);
        Withdraw.setBounds(80,90,200, 20);
        add(Deposit);
        Deposit.setBounds(80, 115, 200, 20);
        add(Inquery);
        Inquery.setBounds(80, 140, 200, 20);
         add(Prev);
        Prev.setBounds(80, 165, 200, 20);
        add(Next);
        Next.setBounds(80, 190, 200, 20);
        add(Menu);
        Menu.setBounds(30, 30, 100, 20);
        add(Display);
        Display.setBounds(300, 140, 120, 20);
        add(Done);
        Done.setBounds(80, 215, 200, 20);
       Withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              double x;
               do{
               String Entered= JOptionPane.showInputDialog("Enter Amount:");
               x = Double.parseDouble(Entered);
               }while(x<0);
               AtmFunctional draw=new AtmFunctional(Client);
               draw.withdraw(x);
              
               String Current=String.valueOf(Client.getBalance());
             
            }
         }); 
       Deposit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               double x;
               /*do{
                String in= JOptionPane.showInputDialog("Enter Amount:");      
              
               }while(!(StringUtils.isNumeric(in)));
               */
               do{
               String Entered= JOptionPane.showInputDialog("Enter Amount:");
               x = Double.parseDouble(Entered);
               }while(x<0);
               AtmFunctional dep=new AtmFunctional(Client);
               dep.deposit(x);
               String Current=String.valueOf(Client.getBalance());
               //Display.setText(Current);
            }
           /* private boolean isNumeric(InputStream in) {
                return in.matches("[-+]?\\d*\\.?\\d+") && in != null;
            }*/
        } );  

        Inquery.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AtmFunctional Inq=new AtmFunctional(Client);
               Inq.getCurrentBalance();
               String Current=String.valueOf(Client.getBalance());
               Display.setText("$"+Current);
            }
        } );
        Prev.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 AtmFunctional previous=new AtmFunctional(Client);
                 String op = previous.prev();
                 Display.setText(op);
            }
        } );
        Next.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                 AtmFunctional Next=new AtmFunctional(Client);
                 String op =Next.next();
                 Display.setText(op);
            }
        } );
         Done.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }
        });
        
    }
}
