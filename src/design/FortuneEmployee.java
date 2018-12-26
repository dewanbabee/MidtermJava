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
		AbstractHourlyEmployee emp4 = new AbstractHourlyEmployee("Whitney Clarke",250,50,80.0) {
			@Override
			public void assignEmail(String email) {
				email="wclarke@eedas.com";
			}
		};



		emp1.assignEmail("dewanbabee@eedas.com");
		 emp1.setSalary(88000);
		System.out.println("Employee "+emp1.employeeName()+" salary is : "+emp1.calculateSalary());
		int bonus = EmployeeInfo.calculateEmployeeBonus(80000, EmployeeInfo.performance.BEST);
		//int pension = EmployeeInfo.calculateEmployeePension(80000);
		System.out.println("Bonus:"+bonus);
		//System.out.println("Pension:"+pension);

		}



	}


