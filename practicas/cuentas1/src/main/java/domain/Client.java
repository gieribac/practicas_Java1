package domain;
public class Client {
//atributes    
    private String Name;
    private String IdUser;
    private String IdRetiro;
    private String NDoc;
//contructors
    public Client(){}; //permite crear objetos de la clase sin inicuar sus atributos//permite crear objetos de la clase sin inicuar sus atributos
 
    public Client(String Name, String IdUser, String IdRetiro, String NDoc) {
        this.Name = Name;
        this.IdUser = IdUser;
        this.IdRetiro = IdRetiro;
        this.NDoc = NDoc;
        
    }

    public String getIdUser() {
        return this.IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
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
