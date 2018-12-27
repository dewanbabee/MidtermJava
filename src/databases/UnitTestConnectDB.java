package databases;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class UnitTestConnectDB {
    static PrintStream save_out;
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    public static void main(String[] args) {
        save_out = System.out;
        System.setOut(new PrintStream(out));
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
       try{
        ConnectToSqlDB.connectToSqlDatabase();
           assertEquals(out.toString(), "Database is connected\r\n", "Test failed");
       }catch(Exception ex){
           ex.getMessage();
       }
       finally {
           out.reset();
       }
        System.setOut(save_out);
        System.out.println("Test Passed");
    }
}
