package domain;




public class InvestmentAccount extends Account {
    private double StartingAmount; //monto minimo deposito inicial
    private double MinimunAmount; //restricción de saldo minimo
    private String spass; // clave de casa inversionista
    public InvestmentAccount(){
        StartingAmount=25000;
        MinimunAmount=10000;
    }
    
    public InvestmentAccount(double Balance, double InterestFactor, String NAccount, int Antique, String spass) {
        super.setAntique(Antique);
        super.setBalance(Balance*InterestFactor*Antique);
        super.setNAccount(NAccount);
        super.setInterestFactor(InterestFactor);  
        this.spass=spass;
        StartingAmount=25000;
        MinimunAmount=10000;
    }
    
    public double getStartingAmount() {
        return this.StartingAmount;
    }
    
    public double getMinimunAmount() {
        return this.MinimunAmount;
    }

    public String getSpass() {
        return this.spass;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nInvestmentAccount{\nNo de cuenta: ").append(super.getNAccount());
        sb.append("\nAntiguedad de la cuenta: ").append(super.getAntique());
        sb.append("\nSaldo: ").append(super.getBalance());
        sb.append('}');
        return sb.toString();
    }

    
}