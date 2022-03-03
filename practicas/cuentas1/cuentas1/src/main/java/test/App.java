

package test;

import domain.Cashier;
import domain.InvestmentAccount;
import domain.Investor;
import domain.Receptionist;
import domain.SavingsAccount;
import domain.Supervisor;
import javax.swing.JOptionPane;




public class App {

    public static void main(String[] args) { //psvm+tab
        String Name_="", NoAccount_="", IdRetiro_="", Ndoc_="", IdEmployee_="", invpass_="", spass_="";  
        Integer Seniority_=0, seleccion, w;
        Double pedido;

        //con esta aplicacion se creara una cuenta
        JOptionPane.showMessageDialog(null,"Se creara una cuenta");
        int a = JOptionPane.showOptionDialog(
            null,
            "Seleccione tipo de cuenta", 
            "Selector de opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] {"Cuenta de ahorros", "Cuenta de inversiones"},   // null para YES, NO y CANCEL
            "opcion 1");

        if (a != -1)
            System.out.println("seleccionada opcion " + (a + 1));
        
        //double Balance, double InterestFactor, String NAccount, int Antique
        
        Double Balance_=Double.parseDouble(JOptionPane.showInputDialog("Digite el saldo de la cuenta: "));
        SavingsAccount obsAccount= new SavingsAccount(); //necesatio para llamar el método no estatico getStartingAmount()
        InvestmentAccount obiAccount= new InvestmentAccount();
        switch (a){
                case 0: 
                    while (Balance_ <= obsAccount.getStartingAmount())                    
                        Balance_=Double.parseDouble(JOptionPane.showInputDialog("Digite un saldo de  cuenta superior a: "+obsAccount.getStartingAmount()));
                    break;
                case 1: 
                    while (Balance_<= obiAccount.getStartingAmount())
                        Balance_=Double.parseDouble(JOptionPane.showInputDialog("Digite un saldo de  cuenta superior a: "+obiAccount.getStartingAmount()));
                    break;
        }
        Double InterestFactor_=Double.parseDouble(JOptionPane.showInputDialog("Digite el factor de ganancia de interes anual de la cuenta: "));
        String NAccount_=JOptionPane.showInputDialog("Digite el número de la cuenta: ");
        Integer Antique_=Integer.parseInt(JOptionPane.showInputDialog("Digite la antiguedad de la cuenta en años: "));
        SavingsAccount saccount1= new SavingsAccount(Balance_, InterestFactor_, NAccount_, Antique_);
        InvestmentAccount iaccount1= new InvestmentAccount(Balance_, InterestFactor_, NAccount_, Antique_, spass_);
        switch (a){
            case 0: 
                    saccount1.setBalance(Balance_);
                    saccount1.setInterestFactor(InterestFactor_);
                    saccount1.setNAccount(NAccount_);
                    saccount1.setAntique(Antique_);
                    System.out.println("Cuenta de Ahorros: " + saccount1); 
                break;
            case 1: 
                    spass_=JOptionPane.showInputDialog("Digite clave de casa inversionista: ");
                    iaccount1.setBalance(Balance_);
                    iaccount1.setInterestFactor(InterestFactor_);
                    iaccount1.setNAccount(NAccount_);
                    iaccount1.setAntique(Antique_);
                    iaccount1.setSpass(spass_);
                    System.out.println("Cuenta de inversiones: " + iaccount1); 
                break;
        }
        
        //creacion de un empleado
            JOptionPane.showMessageDialog(null,"Se creara un empleado");
            seleccion = JOptionPane.showOptionDialog(
            null,
            "Seleccione su cargo", 
            "Selector de opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Cajero", "Recepcionista", "Supervisor","inversionista"},   // null para YES, NO y CANCEL
            "opcion 1");

        if (seleccion != -1){
            System.out.println("seleccionada opcion " + (seleccion + 1));
        }
        Cashier cashier1= new Cashier(Name_, NoAccount_, IdRetiro_, Ndoc_, IdEmployee_, Seniority_); 
        Receptionist receptionist1= new Receptionist(Name_, NoAccount_, IdRetiro_, Ndoc_, IdEmployee_, Seniority_); 
        Supervisor supervisor1= new Supervisor(Name_, NoAccount_, IdRetiro_, Ndoc_, IdEmployee_, Seniority_); 
        Investor investor1= new Investor(Name_, NoAccount_, IdRetiro_, Ndoc_, invpass_);
        if (seleccion != 3){
            Name_=JOptionPane.showInputDialog("Digite el nombre: ");
            NoAccount_=JOptionPane.showInputDialog("Digite el numero de la cuenta del usuario: ");
            IdRetiro_=JOptionPane.showInputDialog("Digite la identificación para retiros: ");
            Ndoc_=JOptionPane.showInputDialog("Digite el número de documento: ");
            IdEmployee_=JOptionPane.showInputDialog("Digite su identificación de empleado: ");
            Seniority_=Integer.parseInt(JOptionPane.showInputDialog("Digite la antiguedad de empleado en años: "));
            switch (seleccion){
                case 0: 
                    cashier1.setName(Name_);
                    cashier1.setNoAccount(NoAccount_);
                    cashier1.setIdRetiro(IdRetiro_);
                    cashier1.setNDoc(Ndoc_);
                    cashier1.setIdEmployee(IdEmployee_);
                    cashier1.setSeniority(Seniority_);                  
                    System.out.println("Cajero: " + cashier1); 
                    break;
                case 1: 
                    receptionist1.setName(Name_);
                    receptionist1.setNoAccount(NoAccount_);
                    receptionist1.setIdRetiro(IdRetiro_);
                    receptionist1.setNDoc(Ndoc_);
                    receptionist1.setIdEmployee(IdEmployee_);
                    receptionist1.setSeniority(Seniority_);
                    System.out.println("Recepcionista: " + receptionist1); 
                    break;
                case 2: 
                    supervisor1.setName(Name_);
                    supervisor1.setNoAccount(NoAccount_);
                    supervisor1.setIdRetiro(IdRetiro_);
                    supervisor1.setNDoc(Ndoc_);
                    supervisor1.setIdEmployee(IdEmployee_);
                    supervisor1.setSeniority(Seniority_); 
                    System.out.println("Supervisor: " + supervisor1);
                    break;
            }   
        } 
        else if (seleccion == 3){            
                //(String Name, String NoAccount, String IdRetiro, String NDoc, String invpass)
                Name_=JOptionPane.showInputDialog("Digite el nombre: ");
                NoAccount_=JOptionPane.showInputDialog("Digite el numero de la cuenta: ");
                IdRetiro_=JOptionPane.showInputDialog("Digite la identificación para retiros: ");
                Ndoc_=JOptionPane.showInputDialog("Digite el número de documento: ");
                invpass_=JOptionPane.showInputDialog("Digite su clave de casa inversora: ");
                investor1.setName(Name_);
                investor1.setNoAccount(NoAccount_);
                investor1.setIdRetiro(IdRetiro_);
                investor1.setNDoc(Ndoc_);
                investor1.setInvpass(invpass_);
                System.out.println("Supervisor: " + investor1);      
        }
            //transaccion
            
            JOptionPane.showMessageDialog(null,"Se realizara una transacción");
            int c = JOptionPane.showOptionDialog(
            null,
            "Seleccione ", 
            "Selector de opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Retiro", "Deposito", },   
            "opcion 1");

            if (c != -1)
                System.out.println("seleccionada opcion " + (c + 1));
            w=(seleccion != 3 && c==1)?1:0;
            switch (c){
                case 0: //retiros
                    switch (w){
                        case 1:
                            JOptionPane.showMessageDialog(null,"Empleado no tiene permiso de acceso a la cuenta de inversionista");
                            break;
                        case 0:
                            switch (a){
                                case 0: //cuenta de ahorros
                                        switch (seleccion){
                                            case 0://cajero
                                                String g=JOptionPane.showInputDialog("Digite la clave de retiro");
                                                while (!(cashier1.getIdRetiro() .equals(g))){
                                                    g=JOptionPane.showInputDialog("Id de retiro incorrecto, digite de nuevo: ");
                                                }
                                                String f=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(saccount1.getNAccount() .equals(f))){
                                                    f=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double d=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));

                                                while (saccount1.getBalance()-d<saccount1.getMinimunAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    d=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()-d);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                            case 1: //recepcionista
                                                String k=JOptionPane.showInputDialog("Digite la clave de retiro");
                                                while (!(receptionist1.getIdRetiro() .equals(k))){
                                                    k=JOptionPane.showInputDialog("Id de retiro incorrecto, digite de nuevo: ");
                                                }
                                                k=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(saccount1.getNAccount() .equals(k))){
                                                    k=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double l=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));

                                                while (saccount1.getBalance()-l<saccount1.getMinimunAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    l=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()-l);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                            case 2: //supervisor
                                                String m=JOptionPane.showInputDialog("Digite la clave de retiro");
                                                while (!(receptionist1.getIdRetiro() .equals(m))){
                                                    m=JOptionPane.showInputDialog("Id de retiro incorrecto, digite de nuevo: ");
                                                }
                                                m=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(saccount1.getNAccount() .equals(m))){
                                                    m=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double n=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));

                                                while (saccount1.getBalance()-n<saccount1.getMinimunAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    n=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()-n);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                            case 3: //inversionista
                                                String h=JOptionPane.showInputDialog("Digite la clave de retiro");
                                                while (!(investor1.getIdRetiro() .equals(h))){
                                                    h=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                String i=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(investor1.getNoAccount() .equals(i))){
                                                    i=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double j=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));

                                                while (saccount1.getBalance()-j<saccount1.getMinimunAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    j=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()-j);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                        }  
                                case 1: //cuenta de inversion
                                        String o=JOptionPane.showInputDialog("Digite la clave de retiro");
                                        while (!(investor1.getIdRetiro() .equals(o))){
                                            o=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                        }
                                        o=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                        while (!(investor1.getNoAccount() .equals(o))){
                                            o=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                        }
                                        Double p=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));

                                        while (iaccount1.getBalance()-p<iaccount1.getMinimunAmount()){
                                            JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                            p=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));
                                        }
                                        iaccount1.setBalance(iaccount1.getBalance()-p);
                                        System.out.println("\nNuevo saldo: "+iaccount1.getBalance());
                                        break;
                            }
                    break;
            }     
                case 1: //depositos
                    switch (w){
                        case 1:
                            JOptionPane.showMessageDialog(null,"Empleado no tiene permiso de acceso a la cuenta de inversionista");
                            break;
                        case 0:
                            switch (a){
                                case 0: //cuenta de ahorros
                                        switch (seleccion){
                                            case 0://cajero
                                                JOptionPane.showInputDialog("Digite su identificacion");
                                                String f=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(saccount1.getNAccount() .equals(f))){
                                                    f=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double d=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));

                                                while (saccount1.getBalance()+d<saccount1.getStartingAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    d=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del retiro"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()+d);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                            case 1: //recepcionista
                                                JOptionPane.showInputDialog("Digite su identificacion");
                                                String k=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(saccount1.getNAccount() .equals(k))){
                                                    k=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double l=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));

                                                while (saccount1.getBalance()+l<saccount1.getStartingAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    l=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()+l);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                            case 2: //supervisor
                                                JOptionPane.showInputDialog("Digite su identificacion");
                                                String m=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(saccount1.getNAccount() .equals(m))){
                                                    m=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double n=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));

                                                while (saccount1.getBalance()+n<saccount1.getStartingAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    n=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()+n);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                            case 3: //inversionista
                                                String h=JOptionPane.showInputDialog("Digite su identificacion");
                                                String i=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                                while (!(investor1.getNoAccount() .equals(i))){
                                                    i=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                                }
                                                Double j=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));

                                                while (saccount1.getBalance()+j<saccount1.getStartingAmount()){
                                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                                    j=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));
                                                }
                                                saccount1.setBalance(saccount1.getBalance()+j);
                                                System.out.println("\nNuevo saldo: "+saccount1.getBalance());
                                                break;
                                        }  
                                case 1: //cuenta de inversion
                                        JOptionPane.showInputDialog("Digite su identificacion");
                                        String o=JOptionPane.showInputDialog("Digite el numero de la cuenta");
                                        while (!(investor1.getNoAccount() .equals(o))){
                                            o=JOptionPane.showInputDialog("No. de cuenta incorrecto, digite de nuevo: ");
                                        }
                                        Double p=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));

                                        while (iaccount1.getBalance()+p<iaccount1.getStartingAmount()){
                                            JOptionPane.showMessageDialog(null,"Fondos insuficientes, pida un menor valor");
                                            p=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del deposito"));
                                        }
                                        iaccount1.setBalance(iaccount1.getBalance()+p);
                                        System.out.println("\nNuevo saldo: "+iaccount1.getBalance());

                                        break;
                            }
                        
                break;
                        }               
                    }
    }
}
