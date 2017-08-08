import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Add {

	public static void main(String[] args) throws Exception {
		
		Class.forName("");
		Connection con=DriverManager.getConnection("");
		PreparedStatement statement= con.prepareStatement("select * from Customer");
		ResultSet result=statement.executeQuery();
	
	while(result.next())
		
	{
	System.out.println(result.getString(1)+ " " + result.getString(2));
	}

}
	}
