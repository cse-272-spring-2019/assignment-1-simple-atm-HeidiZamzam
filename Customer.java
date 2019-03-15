package atmproject;
public class Customer {
    private  String accNo;
    private  double Balance;
    public Transaction[] array=new Transaction[5];
    public int index=0;
    public int count = 0;
    public Customer(String accNo,double Balance) {
        this.accNo=accNo;
        this.Balance=Balance;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double bal){
        this.Balance= bal;
    }
    public String getAccno(){
        return accNo;
    }
    public void setAccNo(String accNo){
        this.accNo=accNo;
    }
}
