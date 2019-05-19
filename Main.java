import java.util.Scanner;
public class Main{
    private static int pfPercentage;
    //****************************************************
    public static Employee getEmployeeDetails(){
        Scanner sc=new Scanner(System.in);      
        System.out.println("Enter Id:");
        int employeeId= sc.nextInt();
        System.out.println("Enter Name:");
        String _employeeName= sc.nextLine();
        String employeeName= sc.nextLine();
        System.out.println("Enter salary:");
        double salary=sc.nextDouble();
        Employee emp = new Employee(); 
        emp.setEmployeeId(employeeId);
        emp.setEmployeeName(employeeName);
        emp.setSalary(salary);
        return emp;
    }
    //****************************************************
    public static void main(String[] args){
        Employee emp = new Employee();
        emp = Main.getEmployeeDetails();
        pfPercentage = Main.getPFPercentage();
        emp.calculateNetSalary(pfPercentage);
        System.out.println("Id : "+emp.getEmployeeId());
        System.out.println("Name : "+emp.getEmployeeName());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("Net Salary : "+emp.getNetSalary());
    }
    //****************************************************
    public static int getPFPercentage(){
        System.out.println("Enter PF percentage:");
        Scanner sc1=new Scanner(System.in);
        int pfPercentage=sc1.nextInt();
        return pfPercentage;
    }    
}
