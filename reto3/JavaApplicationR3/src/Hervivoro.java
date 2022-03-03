
import java.util.Scanner;

public class Hervivoro extends Animal {

    private int lugarHabit;

    private int peso;

    public Hervivoro() {
        super();
    }
    
    public void MonstrarDato() {
        System.out.println("\nDatos animal hervivoro");
        System.out.println("Categoria: "+this.getCategoriaAnimal()+" \nNo. Lugar que habita: "+this.getLugarHabit()+" \nPeso: "+this.getPeso());
    }
    public void PedirDatoHervivoro(Hervivoro objHervivoro) {  
        Scanner in=new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DEL ANIMAL HERVIVORO");
        System.out.print("Ingrese la categoria: ");
        objHervivoro.setCategoriaAnimal(in.next());
        System.out.print("Ingrese el numero del lugar que habita: ");
        objHervivoro.setLugarHabit(in.nextInt());
        System.out.print("Ingrese el peso: ");
        objHervivoro.setPeso(in.nextInt());
    }
    
    public int getLugarHabit() {
        return lugarHabit;
    }

    public void setLugarHabit(int lugarHabit) {
        this.lugarHabit = lugarHabit;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
