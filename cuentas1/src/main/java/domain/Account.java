package domain;

public class Account {
    
    private double Balance;
    private double StartingAmount;
    private double MinimunAmount;
    private int InterestPercentage;
    private int NoAccount;

    public double getBalance() {
        return this.Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getStartingAmount() {
        return this.StartingAmount;
    }

    public void setStartingAmount(double StartingAmount) {
        this.StartingAmount = StartingAmount;
    }

    public double getMinimunAmount() {
        return this.MinimunAmount;
    }

    public void setMinimunAmount(double MinimunAmount) {
        this.MinimunAmount = MinimunAmount;
    }

    public int getInterestPercentage() {
        return this.InterestPercentage;
    }

    public void setInterestPercentage(int InterestPercentage) {
        this.InterestPercentage = InterestPercentage;
    }

    public int getNoAccount() {
        return this.NoAccount;
    }

    public void setNoAccount(int NoAccount) {
        this.NoAccount = NoAccount;
    }    

 
}