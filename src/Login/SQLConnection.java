/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author asus
 */
public class SQLConnection {
    public static Connection getConnection() throws Exception {
        String db = "jdbc:mysql://";
        String hostName  = "localhost:3306/";
        String dbName = "poultry";
        
        String dbUrl = db + hostName + dbName;
        
        String hostUsername = "root" ;
        String hostPassword = "root";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn  = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword) ;
        return myConn;
    
    }
}
