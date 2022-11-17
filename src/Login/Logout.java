/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class Logout {
    public static void logout(JFrame context, LoginPage loginScreen){
    
        LoginSession.isLoggedIn = false;
        context.setVisible(true);
        loginScreen.setVisible(true);
        
    }
}
