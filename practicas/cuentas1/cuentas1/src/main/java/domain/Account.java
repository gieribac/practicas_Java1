package domain;



public class Account {

    private double Balance; //saldo de la cuenta
    private double InterestFactor; //porcentaje anual de interes en fondos
    private String NAccount; //numero de cuenta
    private int Antique;

    public  double ToDeposit(double Deposit){
    
    return this.Balance=Balance+Deposit;
       
    }

    
    public  double ToWithdrawal(double Withdrawal){
    
    return this.Balance=Balance-Withdrawal;
       
    }
    
    public double getInterestFactor() {
        return this.InterestFactor;
    }

    public void setInterestFactor(double InterestFactor) {
        this.InterestFactor = InterestFactor;
    }

    public String getNAccount() {
        return this.NAccount;
    }

    public void setNAccount(String NAccount) {
        this.NAccount = NAccount;
    }    

    public double getBalance() {
        return this.Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public int getAntique() {
        return this.Antique;
    }

    public void setAntique(int Antique) {
        this.Antique = Antique;
    }

 
}