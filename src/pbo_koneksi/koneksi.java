/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class koneksi {
    
    public static Connection getConnection() throws SQLException
    {
        String url = "jdbc:mysql://localhost/db_pinjambuku";
        return DriverManager.getConnection(url, "root", "");
    }

    public static Connection getConnection(String jdbcmysqllocalhostdb_penjambuku, String root, String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}



