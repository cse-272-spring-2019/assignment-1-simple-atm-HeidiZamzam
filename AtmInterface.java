package atmproject;
public interface AtmInterface {
    public String getCurrentBalance();
    public void withdraw(double amount);
    public void deposit(double amount);
    public String prev();
    public String next();
}
