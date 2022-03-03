
import java.util.Scanner;

public class Empleado extends Persona {

    private int codigoEmpleado;

    private String empresa;

    private double salario;

    public Empleado() {
        super();
    }
    
    public void MostrarDato() {
        System.out.println("\nDatos empleado "+this.getNombre()+" "+this.getApellido()+ " identificado con documento No. "+this.getDocumento());
        System.out.println("Codigo: "+this.getCodigoEmpleado()+" \nEmpresa: "+this.getEmpresa()+" \nSalario: "+this.getSalario());
    }
    public void PedirDatoEmpleado(Empleado objEmpleado) {  
        Scanner in=new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DEL EMPLEADO");
        System.out.print("Ingrese el nombre del empleado: ");
        objEmpleado.setNombre(in.next());
        System.out.print("Ingrese el apellido del empleado: ");
        objEmpleado.setApellido(in.next());
        System.out.print("Ingrese el No. de documento del empleado: ");
        objEmpleado.setDocumento(in.nextInt());
        System.out.print("Ingrese el salario del empleado: ");
        objEmpleado.setSalario(in.nextDouble());
        System.out.print("Ingrese la empresa del empleado: ");
        objEmpleado.setEmpresa(in.next());
        System.out.print("Ingrese el codigo numerico del empleado: ");
        objEmpleado.setCodigoEmpleado(in.nextInt());
    }
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
