package domain;

public class Receptionist extends Employee {

    public double SalaryBA = 18000; //salario base anual de 18000 dolares
    
     public Receptionist(String Name, String NoAccount, String IdRetiro, String Ndoc, String IdEmployee,
            int Seniority) {
        super(Name, NoAccount, IdRetiro, Ndoc, IdEmployee, Seniority);
        super.setSalary(SalaryBA*Seniority);
      
        
    }

}
