package design;

public abstract class AbstractHourlyEmployee implements Employee{
    private int employeeId;
    private String name;
    private Departments deptName;
    public int hours;
    private double hourlyRate;
    private  enum Departments{ HR, PRODUCTION,TESTING}
    
    public AbstractHourlyEmployee(){}
        
    public AbstractHourlyEmployee(String name, int employeeId, int hours, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.deptName = null;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

      //employeeId() will return employee id.
    public int employeeId(){
    return this.employeeId;
    }

    //employeeName() will return employee name
    public String employeeName(){
        return this.name;

    }
    public void setHourlyRate(double hourlyRate)

    {
        this.hourlyRate = hourlyRate;
    }




    //assignDepartment() will assign employee to departments
    public void assignDepartment()
    {
        if(this.employeeId > 1 && this.employeeId<=100)
     this.deptName  = Departments.HR;
        if(this.employeeId > 100 && this.employeeId<=350)
            this.deptName  = Departments.PRODUCTION;
        if(this.employeeId > 350 && this.employeeId<=500)
            this.deptName  = Departments.TESTING;
    }

    //calculate employee salary
    public int calculateSalary()
    {
     return (int)(this.hours*this.hourlyRate);
    }

    //employee benefit
    public void benefitLayout()
    {
        System.out.println("will come back later");
    }
    public abstract void assignEmail(String email);

}
