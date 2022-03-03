package domain;
public class Client {
//atributes    
    private String Name;
    private String NoAccount;
    private String IdRetiro;
    private String NDoc;
//contructors
    public Client(){}; //permite crear objetos de la clase sin inicuar sus atributos//permite crear objetos de la clase sin inicuar sus atributos
 
    public Client(String Name, String NoAccount, String IdRetiro, String NDoc) {
        this.Name = Name;
        this.NoAccount = NoAccount;
        this.IdRetiro = IdRetiro;
        this.NDoc = NDoc;
        
    }

    public String getNoAccount() {
        return this.NoAccount;
    }

    public void setNoAccount(String NoAccount) {
        this.NoAccount = NoAccount;
    }

    public String getNDoc() {
        return this.NDoc;
    }

    public void setNDoc(String NDoc) {
        this.NDoc = NDoc;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }   

    public String getIdRetiro() {
        return this.IdRetiro;
    }

    public void setIdRetiro(String IdRetiro) {
        this.IdRetiro = IdRetiro;
    }
    
}
