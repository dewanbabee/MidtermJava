package design;

public abstract class AbstractEmployee implements Employee{
    int employeeId;
    String firstName;
    String lastName;
    Departments deptName;
    int hours;
    double hourlyRate;

   public enum Departments{ HR, PRODUCTION,TESTING}


    //employeeId() will return employee id.
    public int employeeId(){
    return this.employeeId;
    }

    //employeeName() will return employee name
    public String employeeName(){
        return this.firstName+ " "+ this.lastName;

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
    public abstract void getDayOff();

}
