package atmproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 class Numbers extends JFrame {
    JLabel Menu=new JLabel("Enter Amount:");
    JButton zero= new JButton("0");
    JButton one= new JButton("1");
    JButton two= new JButton("2");
    JButton three= new JButton("3");
    JButton four= new JButton("4");
    JButton five= new JButton("5");
    JButton six= new JButton("6");
    JButton seven= new JButton("7");
    JButton eight= new JButton("8");
    JButton nine= new JButton("9");
    JButton Done= new JButton("Done");
    JTextField Amount= new JTextField(50);
 public Numbers(){
    setLayout(null);
        add(zero);
        zero.setBounds(60,60,50, 50);
        add(one);
        one.setBounds(115, 60, 50, 50);
        add(two);
        two.setBounds(170, 60, 50, 50);
         add(three);
        three.setBounds(60, 115, 50, 50);
        add(four);
        four.setBounds(115, 115, 50, 50);
         add(five);
        five.setBounds(170,115,50, 50);
        add(six);
        six.setBounds(60, 170, 50, 50);
        add(seven);
        seven.setBounds(115, 170, 50, 50);
         add(eight);
        eight.setBounds(170, 170, 50, 50);
        add(nine);
        nine.setBounds(60, 225, 50, 50);
        add(Done);
        Done.setBounds(115, 225, 105, 50);
        add(Menu);
        Menu.setBounds(30, 30, 100, 20);
        add(Amount);
        Amount.setBounds(250, 140, 100, 20);
         zero.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           String text = zero.getText();
                Amount.setText(text);
        }
     });
          one.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             String text = one.getText();
                Amount.setText(text);
        }
     });
           two.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = two.getText();
                Amount.setText(text);
        }
     });
            three.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           String text = three.getText();
                Amount.setText(text);
        }
     });
         four.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          String text = four.getText();
                Amount.setText(text);
        }
     });
              five.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           String text = five.getText();
                Amount.setText(text);
        }
     });
               six.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = six.getText();
                Amount.setText(text);
        }
     });
                seven.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             String text = seven.getText();
                Amount.setText(text);
        }
     });
                 eight.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             String text = eight.getText();
                Amount.setText(text);
        }
     });
                 nine.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             String text = nine.getText();
                Amount.setText(text);
        }
     });
                  Done.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }
     });
  }
 }
 
