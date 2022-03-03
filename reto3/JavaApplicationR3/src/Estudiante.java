
import java.util.Scanner;

public class Estudiante extends Persona {

    private int codigoEstudiante;

    private String carrera;

    private String universidad;

    public Estudiante() {
        super();
    }
    
    public void MostrarDato() {
        System.out.println("\nDatos estudiante "+this.getNombre()+" "+this.getApellido()+ " identificado con documento No. "+this.getDocumento());
        System.out.println("Codigo: "+this.getCodigoEstudiante()+" \nCarrera: "+this.getCarrera()+" \nUniversidad: "+this.getUniversidad());
    }
 
    public void PedirDatoEstudiante(Estudiante objEstudiante) {  
        Scanner in=new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DEL ESTUDIANTE");
        System.out.print("Ingrese el nombre del estudiante: ");
        objEstudiante.setNombre(in.next());
        System.out.print("Ingrese el apellido del estudiante: ");
        objEstudiante.setApellido(in.next());
        System.out.print("Ingrese el No. de documento del estudiante: ");
        objEstudiante.setDocumento(in.nextInt());
        System.out.print("Ingrese la carrera del estudiante: ");
        objEstudiante.setCarrera(in.next());
        System.out.print("Ingrese la universidad del estudiante: ");
        objEstudiante.setUniversidad(in.next());
        System.out.print("Ingrese el codigo numerico del estudiante: ");
        objEstudiante.setCodigoEstudiante(in.nextInt());
    }
    
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
