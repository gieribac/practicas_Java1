
import java.util.Scanner;


/**
 * @author GIOVANNI
 */
public class A1Main {


    public static void main(String[] args) {
        //ingreso datos 
        Estudiante objEstudiante = new Estudiante();
        objEstudiante.PedirDatoEstudiante(objEstudiante);
        Empleado objEmpleado = new Empleado();
        objEmpleado.PedirDatoEmpleado(objEmpleado);
        Carnivoro objCarnivoro = new Carnivoro();
        objCarnivoro.PedirDatoCarnivoro(objCarnivoro);
        Hervivoro objHervivoro = new Hervivoro();
        objHervivoro.PedirDatoHervivoro(objHervivoro);
        //mostrar objetos creados
        objEstudiante.MostrarDato();
        objEmpleado.MostrarDato();
        objCarnivoro.MonstrarDato();
        objHervivoro.MonstrarDato();
        //acciones
        objEstudiante.Hablar();
        objEstudiante.Bailar();
        objEstudiante.Trabajar();
        objEstudiante.Cantar();
        objEstudiante.Caminar();
        objEstudiante.Correr();
        objEmpleado.Hablar();
        objEmpleado.Bailar();
        objEmpleado.Trabajar();
        objEmpleado.Cantar();
        objEmpleado.Caminar();
        objEmpleado.Correr();
        objCarnivoro.Cantar();
        objCarnivoro.Caminar();
        objCarnivoro.Correr();
        objHervivoro.Cantar();
        objHervivoro.Caminar();
        objHervivoro.Correr();
        
        
        
    }
    

    
}
