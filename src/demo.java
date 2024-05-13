import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demo{
    public static void main(String[] args) {

        String uname = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String pass = "ahmed@jdbc";

        try {
            Connection con = DriverManager.getConnection(url,uname,pass);


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
