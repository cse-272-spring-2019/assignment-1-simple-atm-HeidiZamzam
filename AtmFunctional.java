package atmproject;

import javax.swing.JOptionPane;

public class AtmFunctional implements AtmInterface {

    Customer Client;
    
    public AtmFunctional(Customer Client) {
        this.Client = Client;
    }

    @Override
    public String getCurrentBalance() {
        return Client.getBalance() + "";
    }

    @Override
    public void withdraw(double amount) {
        if (Client.getBalance() > amount) {
            double initial = Client.getBalance();
            Client.setBalance(initial -= amount);
            Transaction draw = new Transaction("Withdrawl", amount);
            int i;
            for (i = 4; i > 0; i--) {
                Client.array[i] = Client.array[i - 1];
            }
            Client.array[0] = draw;
            Client.index =0;
            Client.count++;
            Client.count%=6;
        } else {
            JOptionPane.showMessageDialog(null, "Error!Not enough funds");
        }
    }

    @Override
    public void deposit(double amount) {
        double initial = Client.getBalance();
        Client.setBalance(initial += amount);
        Transaction dep = new Transaction("Deposit", amount);
        int i;
        for (i = 4; i > 0; i--) {
            Client.array[i] = Client.array[i - 1];
        }
        Client.array[0] = dep;
        Client.index = 0;
        Client.count++;
        Client.count%=6;
    }

    @Override
    public String prev() {
        if (Client.count-Client.index>1) {
             Transaction Prev = Client.array[++Client.index];
        String Tran=Prev.getType()+" $"+Prev.getAmount();
        return Tran;
        }
        else 
           JOptionPane.showMessageDialog(null, "No more transactions!");
            return "No Transaction";
       

    }

    @Override
    public String next() {
        if (Client.index == 0) {
            JOptionPane.showMessageDialog(null, "No more transactions!");
           // else if(count-Client.index<1)  
            return "No Transaction";
        }

        Transaction next = Client.array[--Client.index];
        String Tran=next.getType()+" $"+next.getAmount();
        
        return Tran;
    }

}
