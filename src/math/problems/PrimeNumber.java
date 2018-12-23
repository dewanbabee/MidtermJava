package math.problems;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
//Create ConnectToSqlDB Object
		//ConnectToSqlDB consql = new ConnectToSqlDB();
		try{
			Connection con = ConnectToSqlDB.connectToSqlDatabase();
		}
			catch(SQLException e){
				System.out.println(e);
			}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}

		int lowerbound =2;
		//long higherbound = 1000000L;
		long higherbound = 5;


		prime(lowerbound,higherbound);

	}
	public static void prime(int l,long h){
		boolean flag = false;

		for (int i = 1; i <=h ; i++) {
			for (int j = 2; j < i;j++)
			{
				if (i % j == 0) {
					flag = false;
					break;

				}
				else  flag = true;

			}
			if(flag== true)
				System.out.println(i);


		}

	}

}
