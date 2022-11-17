/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Operations {
    public static boolean isLogin(String userid, String password, String usertype, JFrame frame ){
        try{
            Connection myConn = SQLConnection.getConnection();
            PreparedStatement ps = null;
            ResultSet rs =  null;
            
            String Query = 
                     "Select Userid,  Uname, Urole, Uplace from poultry.users where Userid='" +
                    userid +
                    "' and Upassword='" +
                    password +
                    "' and Urole = '"+
                    usertype+"'";
            ps  = myConn.prepareStatement(Query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
            
                 LoginSession.Uid = rs.getString("Userid");
                 LoginSession.Usertype = rs.getString("Urole");
                 LoginSession.Uname = rs.getString("Uname");
                 LoginSession.Uplace = rs.getString("Uplace");
                 
                 
                 return true;
            }
            
            
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Database Error:"+ e.getMessage());
        
        }
        return false;
    
    }
            
}
