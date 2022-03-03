package javareto2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * uso de objeto dentro de objeto y HashMAP
 * @author GIOVANNI
 */
public class JavaReto2 {

    public static void main(String[] args) {
        //RF1
        String m;
        Boolean b;
        int n=0, keymap, indice_=0;
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAMA PARA REGISTRAR ASISTENCIA DE TRIPULANTES");
        System.out.println("Ingrese la cantidad de tripulantes para registrar:");
        m = in.next();
        Pattern pat = Pattern.compile("^0[1-9]|[1-9]([0-9])*$");
        Matcher mat = pat.matcher(m);
        b = mat.matches();
        while (!b) {
            System.out.println("Cantidad erronea, ingrese cantidad de nuevo:");
            m = in.next();
            Matcher matp = pat.matcher(m);
            b = matp.matches();
        } 
        n = Integer.parseInt(m);
        Tripulante[] objTripulante = new Tripulante[n+1];
        Tripulante objT = new Tripulante();
        objTripulante[0]=objT;
        for (int k=1; k<=n; k++){
            Tripulante objTp = new Tripulante();
            System.out.println("Ingrese el nombre del tripulante "+k+":");
            objTp.setName(in.next());
            System.out.println("Ingrese el apellido del tripulante "+k+":");
            objTp.setLastname(in.next());
            System.out.println("Ingrese el documento del tripulante "+k+":");
            objTp.setDoc(in.next());
            System.out.println("Ingrese la edad del tripulante "+k+":");
            objTp.setAge(in.next());
            System.out.println("Ingrese el numero de telefono del tripulante "+k+":");
            objTp.setTel(in.next());
            System.out.println("Ingrese la direccion de correo electronico del tripulante "+k+":");
            objTp.setEmail(in.next());
            objTripulante[k] = objTp;
        }
        //RF2
        Map<Integer, String> map = new HashMap<>();
            map.put(1, "Monday");		
            map.put(2, "Tuesday");
            map.put(3, "Wednesday");
            map.put(4, "Thursday");	
            map.put(5, "Friday");
            map.put(6, "Saturday");
            map.put(7, "Sunday");
        //FR3
        indice_ = _filtrarTripulante (objTripulante,n);
        //RF4
        keymap = _elegirDia (map);
        if (indice_<=n && indice_>0){
            //FR5
            System.out.println("Datos del estudiante:\n"+objTripulante[indice_]+"\nDia seleccionad: "+map.get(keymap));  
        }
        //FR6
        Asistencia[] objAs=_regAsistencias(objTripulante, n, map);
        //FR7
        System.out.println("REPORTE DE ASISTENCIAS GENERADO");
        for (int c=1; c<=n; c++){
            try {
                System.out.println("\nIdRegistro: "+objAs[c].getIdRegistro());
                System.out.println("IdTripulante: "+objAs[c].getIdTripulante());
                System.out.println("Dia: "+map.get(objAs[c].getIdDia()));
                System.out.println("Nombre: "+objTripulante[c].getName());
                System.out.println("Apellido: "+objTripulante[c].getLastname());
                System.out.println("Edad: "+objTripulante[c].getAge());
                System.out.println("Telefono: "+objTripulante[c].getTel());
                System.out.println("Correo: "+objTripulante[c].getEmail());
            } catch (Exception e){}
        }
    }
    //RF3
    public static int _filtrarTripulante (Tripulante objTripulante[], int rango){
        Scanner in = new Scanner(System.in);     
        String op="n";
        int indiceEncontrado=0;
        do {
            System.out.println("Se mostraran los datos basicos de un tripulante.");
            System.out.println("Ingrese un numero de tripulante, rango: (1-"+rango+")");
            try {
                indiceEncontrado = in.nextInt();
            } catch(Exception e){
                System.out.println("Registro no encontrado");
                System.out.println("Para reintentar presione 's', de lo contrario presione 'n':");
                try {
                    op = in.next().toLowerCase();
                } catch(Exception r){
                    op = "n";
                }
            }
        } while (!"n".equals(op));
        return indiceEncontrado;
    }
    //FR4
    public static int _elegirDia (Map map){
        Scanner in = new Scanner(System.in);
        System.out.println("Elija un dia de la semana (1-7):");
        String m = in.next();
        Pattern pat = Pattern.compile("^[1-7]$");
        Matcher mat = pat.matcher(m);
        Boolean b = mat.matches();
        while (!b) {
            System.out.println("Indice de dia erroneo, reintente:");
            m = in.next();
            Matcher matp = pat.matcher(m);
            b = matp.matches();
        }
        int diaSelecccionado = Integer.parseInt(m); 
        return diaSelecccionado;
    }
    //FR6
    public static Asistencia[] _regAsistencias(Tripulante objTripulante[], int n, Map map){
        Scanner in = new Scanner (System.in);
        int i = 1, keymap;
        Asistencia[] objAsistencia = new Asistencia[n+1];
        System.out.println("Se registraran las asistencias.");
        do {
            try {
                System.out.println("Tripulante "+i+" identificado con documento: "+objTripulante[i].getDoc());
                System.out.println("Presione 'z' para confirmar la asistencia u otra letra para inasistencia");

                if ("z".equals(in.next())){
                    keymap = _elegirDia(map);
                    Asistencia objA = new Asistencia(i, keymap, objTripulante[i].getDoc());
                    objAsistencia[i] = objA;
                }
                if (i<n){
                    System.out.println("Desea continuar registrando asistencias? (S/N)");
                }else{
                    break;
                }
                if ("s".equals(in.next().toLowerCase())){
                    i++;
                } else {
                    break;
                }
            } catch (Exception e){
                System.out.println("Ingreso invalido");
            }           
        } while (true);
        return objAsistencia;
    }  
}
