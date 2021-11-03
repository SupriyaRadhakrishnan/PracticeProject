 import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) throws Exception{
	
		String url = "jdbc:mysql://localhost:3306/student_db";
		String uname="root";
		String pwd ="java2020";
		String query = "select fname from alien where aid = 103";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        System.out.println(rs.getString(1));
        st.close();
        con.close();
        
	}

}
