package domain;

public class Investor extends Client {
    
/*  private String Name;
    private String NoAccount;
    private String IdRetiro;
    private String NDoc;  */
    
    private String invpass; //clave para casa inversionista
    public Investor(){}
    public Investor(String Name, String NoAccount, String IdRetiro, String NDoc, String invpass) {
        super(Name, NoAccount, IdRetiro, NDoc);
        this.invpass=invpass;
    }

    public String getInvpass() {
        return invpass;
    }

    public void setInvpass(String invpass) {
        this.invpass = invpass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Investor{\nClave casa inversora: ").append(invpass);
        sb.append("\nNombre: ").append(super.getName());
        sb.append("\nNo. de documento: ").append(super.getNDoc());
        sb.append("\nNo. de cuenta: ").append(super.getNoAccount());
        sb.append("\nId de retiro: ").append(super.getIdRetiro());
        sb.append('}');
        return sb.toString();
    }
  
}
