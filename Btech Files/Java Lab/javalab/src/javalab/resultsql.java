import java.sql.*;
public class SelectAll 
{
    public static void main(String args[])
    {
            try
        {
             Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","harshit");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from student");
             while (rs.next())
             {
               System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
             }
             
             con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("problem with connection");
        }
    }
}
