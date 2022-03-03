public class Persona implements AccionEspecialzada, AccionBasica {

    private int documento;

    private String apellido;

    private String nombre;

    public void MostrarNombre() {
    }
    
    public void Hablar() {
        System.out.println("persona "+this.nombre+" hablando");
    }
    
    public void Bailar() {
        System.out.println("persona "+this.nombre+" bailando");
    }
    
    public void Trabajar() {
        System.out.println("persona "+this.nombre+" trabajando");
    }
    
    public void Cantar() {
        System.out.println("persona "+this.nombre+" cantando");
    }
    
    public void Caminar() {
        System.out.println("persona "+this.nombre+" caminando");
    }
    
    public void Correr() {
        System.out.println("persona "+this.nombre+" corriendo");
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    
}
