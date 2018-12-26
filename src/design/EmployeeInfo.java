package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractHourlyEmployee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;

	public enum performance {
		BEST,GOOD, AVEGRAGE, NORMAL
	}
    private int salary;
	private String email;
	public  String joinDate;  //DD/MM/YYYY

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {
		super();
	}

	public EmployeeInfo(int employeeId) {
		super("NoNameAvaiable", employeeId, 0, 0.0);
		this.email = "not assigned";
		this.salary= 0;
	}

	public EmployeeInfo(String name, int employeeId) {
		super(name, employeeId, 0, 0.0);
		this.email = "not assigned";
		this.joinDate = "notAssigned";
		this.salary = 0;
	}
	public EmployeeInfo(String name, int employeeId, String joinDate) {
		super(name, employeeId, 0, 0.0);
		this.email = "not assigned";
		this.joinDate = joinDate;
		this.salary =0;
	}

	public EmployeeInfo(String name, int employeeId, String joinDate, int salary) {
		super(name, employeeId, 0, 0.0);
		this.email = "not assigned";
		this.joinDate = joinDate;
		this.salary =salary;
	}
	public String getEmail()
	{
		return this.email;
	}
	//abstruct method implementation
	public void assignEmail(String email) {
		this.email = email;

	}
    public String getJoinDate()
	{
		return this.joinDate;
	}
	public void setJoinDate(String joinDate)
	{
		 this.joinDate = joinDate;
	}

    public void setSalary(int salary)
	{
		this.salary = salary;
	}
	//overriden employee salary method
	public int calculateSalary()
	{
		super.hours = 0;
		super.setHourlyRate(0.0);
        return this.salary;

	}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int salary,performance p){
		double total=0;
		if(p.equals(performance.BEST)&& salary>=80000)
			total = salary*0.1;
		else if(p.equals(performance.AVEGRAGE)&& salary>=80000)
			total = salary*0.08;
		else if(p.equals(performance.NORMAL)&& salary>=80000)
			total = salary*0.05;
		else total = 0;
		return (int)total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(int salary){
		int total=0;
		Scanner sc  = new Scanner(System.in);
//		System.out.println("Please enter if you want to calculate Pension, y for Yes, n for No ");
//
//		String  yesNo = sc.nextLine();
		//if(yesNo.equals("n")) return 0;
		System.out.println("Please enter start date in format (example: May,2015): ");

		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates

		String[] tdate =convertedTodaysDate.split("/");
		String[] jdate = convertedJoiningDate.split("/");
		int totalYear = Integer.valueOf(tdate[1])-Integer.valueOf(jdate[1]);
		if(Integer.valueOf(jdate[0])> Integer.valueOf(tdate[0]))
			totalYear--;


		//Calculate pension
         if(totalYear>5)
         	total = (int)(total + salary*.02);
         else if(totalYear>3)
			 total = (int)(total + salary*.015);
		 else if(totalYear>2)
			 total = (int)(total + salary*.010);
		 else if(totalYear>1)
			 total = (int)(total + salary*.005);
		 else total = 0;

		return total;
	}



	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth){

				Months months = Months.valueOf(givenMonth);


			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
