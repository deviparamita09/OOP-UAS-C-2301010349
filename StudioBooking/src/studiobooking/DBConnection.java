/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiobooking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author deviparamita
 * tgl = 28 Juni 2025
 */
public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/studio_booking"; // ganti dengan nama database kamu
        String user = "root";      // default XAMPP
        String password = "";      // default password kosong

        return DriverManager.getConnection(url, user, password);
    }
}
