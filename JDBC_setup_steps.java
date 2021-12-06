import java.sql.*;

public class JDBC_setup_steps {
    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           // loading and register driver for the given data base
           //drivers are different for different databases.
           // this leads to an exception class not found


       }
       catch(ClassNotFoundException obj){
           System.out.println(obj);

        }
       try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "");

           // making a connection btw driver(manager class) and database(url)
           // driver manager is the basic java service to manage the JDBC servers.
           // connection object holds the reference of the connection created, in order to use it to send statement queries.

           Statement s= con.createStatement();

           // for SQl queries

           ResultSet rs= s.executeQuery("SELECT * from emp");

           // to accept the packet of data recieved after the execution of the query sent by s(statement object)

           while (rs.next()){
               System.out.println(rs.getInt("empid"));
               System.out.println(rs.getString(2));
               System.out.println(rs.getInt(3));
               break;
           }
       }
       catch(SQLException sql){
           System.out.println(sql);
       }
    }
}
