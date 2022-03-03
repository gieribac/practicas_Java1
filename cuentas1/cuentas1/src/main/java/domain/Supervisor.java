package domain;

public class Supervisor extends Employee {

   public double SalaryBA = 50000; //salario base anual de 50000 dolares

     public Supervisor(String Name, String NoAccount, String IdRetiro, String Ndoc, String IdEmployee,
            int Seniority) {
        super(Name, NoAccount, IdRetiro, Ndoc, IdEmployee, Seniority);
        super.setSalary(SalaryBA*Seniority);
      
        
    }

}
