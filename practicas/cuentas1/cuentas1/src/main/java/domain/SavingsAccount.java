package domain;


public class SavingsAccount extends Account {
    private double StartingAmount; //monto minimo deposito inicial
    private double MinimunAmount; //restricción de saldo minimo
    
    public SavingsAccount(){        
        this.StartingAmount=1000;
        this.MinimunAmount=500;
    }
    
    public SavingsAccount(double Balance, double InterestFactor, String NAccount, int Antique) {
        super.setAntique(Antique);
        super.setBalance(Balance*InterestFactor*Antique);
        super.setNAccount(NAccount);
        this.StartingAmount=1000;
        this.MinimunAmount=500;
        super.setInterestFactor(InterestFactor);    
    }

    public double getStartingAmount() {
        return this.StartingAmount;
    }
    
    public double getMinimunAmount() {
        return this.MinimunAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSavingsAccount{\nNo de cuenta: ").append(super.getNAccount());
        sb.append("\nAntiguedad de la cuenta: ").append(super.getAntique());
        sb.append("\nSaldo: ").append(super.getBalance());
        sb.append('}');
        return sb.toString();
    }

}
