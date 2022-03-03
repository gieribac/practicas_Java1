package domain;

public class Cashier extends Employee {

    public double SalaryBA = 24000; //salario base anual de 24000 dolares
    public Cashier(String Name, String IdUser, String IdRetiro, String Ndoc, String IdEmployee, int Seniority, double Salary) {
        super(Name, IdUser, IdRetiro, Ndoc, IdEmployee, Seniority, Salary);
        super.setSalary(this.SalaryBA*super.getSeniority());
    }




   
}
