package clases;

/**
 *
 * @author ISMAEL
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
        static Connection con;
        //conexion local
    public static Connection getInstance() {
        try{
            if(con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost/ins_aaa", "root", "");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return con;
    }  
}
