

package test;


import domain.Cashier;


public class App1 {
    int a=1;
    String b="Gio";
    public static void main(String[] args) { //psvm+tab
        
        Cashier cashier1= new Cashier("Name", "IdUser", "IdRetiro", "Ndoc", "IdEmployee", 0, 0); 
                                       //Name, IdUser, IdRetiro, Ndoc, IdEmployee, 0, 0

        System.out.println("empleado: " + cashier1); //soutv+tab
        
    }
}
