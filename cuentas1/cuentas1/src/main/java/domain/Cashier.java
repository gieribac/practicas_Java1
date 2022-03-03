package domain;

public class Cashier extends Employee {

    public double SalaryBA = 24000; //salario base anual de 24000 dolares

   
    public Cashier(String Name, String NoAccount, String IdRetiro, String Ndoc, String IdEmployee,
            int Seniority) {
        super(Name, NoAccount, IdRetiro, Ndoc, IdEmployee, Seniority);
        super.setSalary(SalaryBA*Seniority);
      
        
    }

   
}
