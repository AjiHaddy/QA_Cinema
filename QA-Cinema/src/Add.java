// Loading required libraries
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class A extends HttpServlet{

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
   
      // JDBC driver name and database URL
      static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
      static final String DB_URL="jdbc:mysql://localhost/TEST";

      //  Database credentials
      static final String USER = "root";
      static final String PASS = "password";

      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Database Result";
      
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      
      out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor = \"#f0f0f0\">\n" +
         "<h1 align = \"center\">" + title + "</h1>\n");
      try {
         // Register JDBC driver
         Class.forName("com.mysql.jdbc.Driver");

         // Open a connection
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

         // Execute SQL query
         Statement stmt = conn.createStatement();
         String sql;
         sql = "SELECT id, first, last, age FROM Employees";
         ResultSet rs = stmt.executeQuery(sql);

         // Extract data from result set
         while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");

            //Display values
            out.println("ID: " + id + "<br>");
            out.println(", Age: " + age + "<br>");
            out.println(", First: " + first + "<br>");
            out.println(", Last: " + last + "<br>");
         }
         out.println("</body></html>");

         // Clean-up environment
         rs.close();
         stmt.close();
         conn.close();
      } catch(SQLException se) {
         //Handle errors for JDBC
         se.printStackTrace();
      } catch(Exception e) {
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally {
         //finally block used to close resources
         try {
            if(stmt!=null)
               stmt.close();
         } catch(SQLException se2) {
         } // nothing we can do
         try {
            if(conn!=null)
            conn.close();
         } catch(SQLException se) {
            se.printStackTrace();
         } //end finally try
      } //end try
   }
} 




/*package publisher.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class DataAccessObject {
	private static DataSource dataSource;
	private static Object idLock = new Object();

	public static void setDataSource(DataSource dataSource) {
		DataAccessObject.dataSource = dataSource;
	}

	protected static Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	protected static void close(Statement statement, Connection connection) {
		close(null, statement, connection);
	}

	protected static void close(ResultSet rs, Statement statement, Connection connection) {
		try {
			if (rs != null)
				rs.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

protected static Long getUniqueId() {
ResultSet rs = null;
PreparedStatement statement = null;
Connection connection = null;
try
{
connection = getConnection();
synchronized (idLock)
{
statement = connection.prepareStatement("select next_value from sequence");
rs = statement.executeQuery();
rs.first();
long id = rs.getLong(1);
statement.close();
statement = connection.prepareStatement("update sequence set next_value = ?");
statement.setLong(1, id + 1);
statement.executeUpdate();
statement.close();
return new Long(id);
}
}
catch (SQLException e)
{
throw new RuntimeException(e);
}
finally
{
close(rs, statement, connection);
}
}
}


*/


/*public NewsItem find(Long id) {
ResultSet rs = null;
PreparedStatement statement = null;
Connection connection = null;
try {
connection = getConnection();
String sql = "select * from news_item where id=?";
statement = connection.prepareStatement(sql);
statement.setLong(1, id.longValue());
rs = statement.executeQuery();
if (!rs.next()) {
return null;
}
return read(rs);
}
catch (SQLException e) {
throw new RuntimeException(e);
}
finally {
close(rs, statement, connection);
}
}
*/


/*
 * private NewsItem read(ResultSet rs) throws SQLException {
Long id = new Long(rs.getLong("id"));
String title = rs.getString("title");
String url = rs.getString("url");
NewsItem newsItem = new NewsItem();
newsItem.setId(id);
newsItem.setTitle(title);
newsItem.setUrl(url);

 * 
 */
*/