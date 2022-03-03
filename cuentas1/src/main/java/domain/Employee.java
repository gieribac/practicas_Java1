package domain;
public class Employee extends Client{
//atributes
    private String IdEmployee; //identificacion del empleado
    private int Seniority;  //años cumplidos de antigûedad del empleado
    private static int VacationsDay; //dias de vacaciones
    private static double Salary; //todo empleado tiene un salario
//contructors       
public Employee(){};
            
    public Employee(String Name,  String IdUser, String IdRetiro, String Ndoc, 
            String IdEmployee, int Seniority, double Salary) {
        super(Name, IdUser, IdRetiro, Ndoc);
        this.IdEmployee = IdEmployee;
        this.Seniority = Seniority;
        this.VacationsDay = Employee.timeVacs(Seniority); 
        this.Salary = Salary;
    }
    
    public static int timeVacs(int Seniority){
        if (Seniority<=1){
        VacationsDay=5;
        } 
        else if (Seniority>1 && Seniority <=10 ){
        VacationsDay=2*Seniority;
        }
        else {
        VacationsDay=20;
        }      
        return Employee.VacationsDay;
    }
    public  int getVacationsDay() {
        return this.VacationsDay;
    }
    public String getIdEmployee() {
        return this.IdEmployee;
    }

    public void setIdEmployee(String IdEmployee) {
        this.IdEmployee = IdEmployee;
    }

    public int getSeniority() {
        return this.Seniority;
    }

    public void setSeniority(int Seniority) {
        this.Seniority = Seniority;
    }

    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(super.getName());
        sb.append("\nNo. de documento: ").append(super.getNDoc());
        sb.append("\nIdentificacion de usuario: ").append(super.getIdUser());
        sb.append("\nIdentificacion de empleado: ").append(IdEmployee);
        sb.append("\nAntiguedad laboral: ").append(Seniority);
        sb.append("\nDías de vacaciones: ").append(VacationsDay);   
        sb.append("\nSaldo de Salario: ").append(Salary);
        return sb.toString();
    }

}
