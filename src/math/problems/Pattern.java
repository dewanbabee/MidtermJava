package math.problems;
import databases.ConnectToSqlDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

//		Connection conn = null;
//		try{
//			conn = ConnectToSqlDB.connectToSqlDatabase();
//		}
//		catch(SQLException e){
//			System.out.println(e);
//		}
//		catch(ClassNotFoundException e){
//			System.out.println(e);
//		}
//		catch(IOException e){
//			System.out.println(e);
//		}
//
//		int i= 0;
//		for(i=100;i>=0;i--) {
//			if (i / 10 == 9 || i / 10 == 10)
//				System.out.println(i);
//
//			if ( && i / 10 == 8 )
//				System.out.println(i - 2);
//		}
//


		//create a Statement from the connection
//		try {
//			Statement statement = conn.createStatement();
//			Iterator i = linkedlist.iterator();
//			while(i.hasNext())
//				// insert the data
//				statement.executeUpdate("INSERT INTO PRIME VALUES("+i.next()+")");
//		}
//		catch (SQLException e)
//		{
//			System.out.println("Statement Problem"+e);
//		}
//		try {
//			conn.close();
//		}
//		catch (SQLException e)
//		{
//			System.out.println(" Database Colsing Problem"+e);
//		}

	}
}
