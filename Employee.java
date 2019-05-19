public class Employee{
    
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
 /*   
    Employee(){//No Argument constructor
    }
    Employee(String employeeName,int employeeId, double salary){//Parameter Constructor
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.salary=salary;
    }
   */
   // getters
    public int getEmployeeId(){
        return employeeId;    
    }
    public String getEmployeeName(){
        return employeeName;    
    }
    public double getSalary(){
        return salary;    
    }
    public double getNetSalary(){
        return netSalary;    
    }
    //setters
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setNetSalary(double netSalary){
        this.netSalary=netSalary;
    }
    //calculateNetSalary method
    public void calculateNetSalary(int pfpercentage){
        this.netSalary=salary*(100-pfpercentage)*0.01;
    }
}
