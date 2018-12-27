package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo.companyName="EEDAS";

		EmployeeInfo emp1 = new EmployeeInfo("Halima Dewan",100,"1/12/2010");
		EmployeeInfo emp2 = new EmployeeInfo("David Wimbly",500,"4/6/2017");
		EmployeeInfo emp3 = new EmployeeInfo(350);


		System.out.println("**************    "+EmployeeInfo.companyName+"     *****************");

		emp1.assignEmail("dewanbabee@eedas.com");
	    emp1.setSalary(88000);
	    emp1.assignDepartment();

		System.out.println("Deatail of Employee: "+emp1.employeeName()+ "  ID: "+emp1.employeeId());
		System.out.println("Department :"+emp1.getDeptName());
		System.out.println("Email: "+emp1.getEmail());

		System.out.println("Employee "+emp1.employeeName()+" salary is : "+emp1.calculateSalary());
		int bonus = EmployeeInfo.calculateEmployeeBonus(80000, EmployeeInfo.performance.BEST);
		int pension = EmployeeInfo.calculateEmployeePension(emp1.calculateSalary());
		System.out.println("Yearly Bonus:"+bonus);
		System.out.println("Pension:"+pension);
		System.out.println("\n");

		emp2.assignEmail("dwimbly@eedas.com");
		emp2.setSalary(100000);
		emp2.assignDepartment();
		System.out.println("Deatail of Employee: "+emp2.employeeName()+ "  ID: "+emp2.employeeId());
		System.out.println("Department :"+emp2.getDeptName());
		System.out.println("Email: "+emp2.getEmail());
		System.out.println("Employee "+emp2.employeeName()+" salary is : "+emp2.calculateSalary());
		bonus = EmployeeInfo.calculateEmployeeBonus(emp2.calculateSalary(), EmployeeInfo.performance.BEST);
		//int pension = EmployeeInfo.calculateEmployeePension(emp2.calculateSalary());
		System.out.println("Yearly Bonus:"+bonus);
		//System.out.println("Pension:"+pension);

		System.out.println("\n");

		emp3.setEmpolyeeName("Kristine Jay");
		emp3.assignEmail("kjay@eedas.com");
		emp3.setSalary(75000);
		emp3.assignDepartment();
		System.out.println("Deatail of Employee: "+emp3.employeeName()+ "  ID: "+emp3.employeeId());
		System.out.println("Department :"+emp3.getDeptName());
		System.out.println("Email: "+emp3.getEmail());
		System.out.println("Employee "+emp3.employeeName()+" salary is : "+emp3.calculateSalary());
		bonus = EmployeeInfo.calculateEmployeeBonus(emp3.calculateSalary(), EmployeeInfo.performance.GOOD);
		//int pension = EmployeeInfo.calculateEmployeePension(mp2.calculateSalary());
		System.out.println("Yearly Bonus:"+bonus);
		//System.out.println("Pension:"+pension);
		System.out.println("\n");





		}



	}


