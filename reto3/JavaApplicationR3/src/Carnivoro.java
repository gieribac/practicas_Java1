
import java.util.Scanner;

public class Carnivoro extends Animal {

    private String especie;

    private String raza;

    public Carnivoro() {
        super();
    }

    public void MonstrarDato() {
        System.out.println("\nDatos animal carnivoro");
        System.out.println("Categoria: "+this.getCategoriaAnimal()+" \nEspecie: "+this.getEspecie()+" \nRaza: "+this.getRaza());
    }

        public void PedirDatoCarnivoro(Carnivoro objCarnivoro) {  
        Scanner in=new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DEL ANIMAL CARNIVORO");
        System.out.print("Ingrese la categoria: ");
        objCarnivoro.setCategoriaAnimal(in.next());
        System.out.print("Ingrese la especie: ");
        objCarnivoro.setEspecie(in.next());
        System.out.print("Ingrese la raza: ");
        objCarnivoro.setRaza(in.next());
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
