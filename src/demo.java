import java.sql.*;

public class demo{
    public static void main(String[] args) {

        String uname = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String pass = "ahmed@jdbc";
        String query = "SELECT * FROM public.cars";

        try {
            Connection con = DriverManager.getConnection(url,uname,pass);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String qResult = rs.getString(1);
            System.out.println(qResult);

            con.close();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
