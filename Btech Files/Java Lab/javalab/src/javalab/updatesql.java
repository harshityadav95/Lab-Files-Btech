package exp2;
import java.sql.*;
public class Updatedb 
{
    public static void main(String args[])
    {
        int rn;
        String name;
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","harshit");
PreparedStatement pstmt=con.prepareStatement("update sinfo set mobile=94639464 where roll_no=23");
             pstmt.executeUpdate();
             System.out.println("mobile number updated successfully");
             pstmt.close();
             con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("problem with connection");
        }
    }
    }
