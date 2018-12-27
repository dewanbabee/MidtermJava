package math.problems;


import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;

import static databases.ConnectToSqlDB.statement;


public class PrimeNumber {
	static LinkedList<Long> linkedlist=new LinkedList<Long>();

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
        Connection conn = null;
		try{
			 conn = ConnectToSqlDB.connectToSqlDatabase();
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

		long lowerbound =2;
		//long higherbound = 1000000L;
		long higherbound = 500;


		prime(lowerbound,higherbound);
	//create a Statement from the connection
		try {
			Statement statement = conn.createStatement();
			Iterator i = linkedlist.iterator();
			while(i.hasNext())
			// insert the data
			statement.executeUpdate("INSERT INTO PRIME VALUES("+i.next()+")");
		}
		catch (SQLException e)
		{
			System.out.println("Statement Problem"+e);
		}
		try {
			conn.close();
		}
		catch (SQLException e)
		{
			System.out.println(" Database Closing Problem"+e);
		}





	}
	public static void prime(long l,long h){
		boolean flag = false;
        if(l<=1) flag = false;
         if(l==2)
		 {
		 	linkedlist.add(Long.valueOf(2));
			 System.out.println(l);
		 	l=3;
		 }

		for (long i = 1; i <=h ; i++) {
			for (long j = 2; j < i;j++)
			{
				if (i % j == 0) {
					flag = false;
					break;

				}
				else  flag = true;

			}
			if(flag== true) {
				System.out.println(i);
				PrimeNumber.linkedlist.add(Long.valueOf(i));
			}


		}

	}

}
