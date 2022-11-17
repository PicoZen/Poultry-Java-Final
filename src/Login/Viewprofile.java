/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;



import Customer.CHomepage;
import Farmer.FHomepage;
import Merchant.MHomepage;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


  
public class Viewprofile extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement PSt = null;
    Statement St = null;
    ResultSet Rs = null;
    
    
    public Viewprofile() {
        initComponents();
        Seticon();
        Userrole.setText(LoginSession.Usertype);
        UpdateInfo();
    }
    
    
    public void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hen.png")));
    }
    
    public void UpdateInfo() {
        
    String role = Userrole.getText();
    String userplace ;
        
     if(role.equals("Customer")) {
     try {
     
        String oid = LoginSession.Uid;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry", "root", "root");
        String sql = "select * from poultry.customer where Customer_uid = ?"; 
        PSt = con.prepareStatement(sql);
        PSt.setString(1, oid);
        Rs = PSt.executeQuery();
        
        if(Rs.next()) {
         
            Uid.setText(Rs.getString("Customer_uid"));
            Uname.setText(Rs.getString("Customer_uname"));
            Username.setText(Rs.getString("Customer_name"));
            Useraddr.setText(Rs.getString("Customer_addr"));
            Uplace.setText(Rs.getString("Customer_place"));
            Uno.setText(Rs.getString("Customer_mno"));
            Uemail.setText(Rs.getString("Customer_email"));
            
            
            con.close();
           userplace = Uplace.getText();
        }
        
     }
     
     catch(SQLException e) {
       JOptionPane.showMessageDialog(this, e.getMessage());
     }
     }
     
     if(role.equals("Farmer")) {
     try {
     
        String oid = LoginSession.Uid;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry", "root", "root");
        String sql = "select * from poultry.farmer where Farmer_uid = ?"; 
        PSt = con.prepareStatement(sql);
        PSt.setString(1, oid);
        Rs = PSt.executeQuery();
        
        if(Rs.next()) {
         
            Uid.setText(Rs.getString("Farmer_uid"));
            Uname.setText(Rs.getString("Farmer_uname"));
            Username.setText(Rs.getString("Farmer_name"));
            Useraddr.setText(Rs.getString("Farmer_addr"));
            Uplace.setText(Rs.getString("Farmer_place"));
            Uno.setText(Rs.getString("Farmer_mno"));
            Uemail.setText(Rs.getString("Farmer_email"));
            
            
            con.close();
            
        }
        
     }
     
     catch(SQLException e) {
       JOptionPane.showMessageDialog(this, e.getMessage());
     }
     }
     
    if(role.equals("Customer")) {
     try {
     
        String oid = LoginSession.Uid;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry", "root", "root");
        String sql = "select * from poultry.customer where Customer_uid = ?"; 
        PSt = con.prepareStatement(sql);
        PSt.setString(1, oid);
        Rs = PSt.executeQuery();
        
        if(Rs.next()) {
         
            Uid.setText(Rs.getString("Customer_uid"));
            Uname.setText(Rs.getString("Customer_uname"));
            Username.setText(Rs.getString("Customer_name"));
            Useraddr.setText(Rs.getString("Customer_addr"));
            Uplace.setText(Rs.getString("Customer_place"));
            Uno.setText(Rs.getString("Customer_mno"));
            Uemail.setText(Rs.getString("Customer_email"));
            
            
            con.close();
            
        }
     }
     
     catch(SQLException e) {
       JOptionPane.showMessageDialog(this, e.getMessage());
     }
     }
     
     if(role.equals("Merchant")) {
     try {
     
        String oid = LoginSession.Uid;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry", "root", "root");
        String sql = "select * from poultry.merchant where Merchant_uid = ?"; 
        PSt = con.prepareStatement(sql);
        PSt.setString(1, oid);
        Rs = PSt.executeQuery();
        
        if(Rs.next()) {
         
            Uid.setText(Rs.getString("Merchant_uid"));
            Uname.setText(Rs.getString("Merchant_uname"));
            Username.setText(Rs.getString("Merchant_name"));
            Useraddr.setText(Rs.getString("Merchant_addr"));
            Uplace.setText(Rs.getString("Merchant_place"));
            Uno.setText(Rs.getString("Merchant_mno"));
            Uemail.setText(Rs.getString("Merchant_email"));
            con.close();      
        }
     }
     catch(SQLException e) {
       JOptionPane.showMessageDialog(this, e.getMessage());
     }
     }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbg = new javax.swing.JPanel();
        innerbg = new javax.swing.JPanel();
        uiinfo = new javax.swing.JLabel();
        uiuserid = new javax.swing.JLabel();
        uicname = new javax.swing.JLabel();
        cmno = new javax.swing.JLabel();
        uicaddr = new javax.swing.JLabel();
        cplace = new javax.swing.JLabel();
        cmail = new javax.swing.JLabel();
        uicuname = new javax.swing.JLabel();
        crole = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Uid = new javax.swing.JTextField();
        Uname = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();
        Useraddr = new javax.swing.JTextField();
        Uplace = new javax.swing.JTextField();
        Uno = new javax.swing.JTextField();
        Uemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Userrole = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pbg.setBackground(new java.awt.Color(255, 0, 0));
        pbg.setPreferredSize(new java.awt.Dimension(1024, 1024));

        innerbg.setBackground(new java.awt.Color(255, 255, 255));

        uiinfo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        uiinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uiinfo.setText("USER INFORMATION");

        uiuserid.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        uiuserid.setText("USER ID  :");

        uicname.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        uicname.setText("NAME  :");

        cmno.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        cmno.setText("MOBILE NUMBER :");

        uicaddr.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        uicaddr.setText("ADDRESS  :");

        cplace.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        cplace.setText("PLACE  :");

        cmail.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        cmail.setText("EMAIL  :");

        uicuname.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        uicuname.setText("USERNAME  :");

        crole.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        crole.setText("ROLE  :");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/images/home212 (1).png"))); // NOI18N
        jLabel15.setText("jLabel10");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        Uid.setEditable(false);
        Uid.setBackground(new java.awt.Color(255, 255, 255));
        Uid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        Uname.setEditable(false);
        Uname.setBackground(new java.awt.Color(255, 255, 255));
        Uname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        Username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        Useraddr.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        Uplace.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        Uno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Uno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UnoKeyReleased(evt);
            }
        });

        Uemail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Uemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UemailKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/images/kisspng-computer-icons-arrow-download-5af6c1b6d59ae6.4820223115261208868749 (1).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        Userrole.setEditable(false);
        Userrole.setBackground(new java.awt.Color(255, 255, 255));
        Userrole.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/images/H-mart-logos_black.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout innerbgLayout = new javax.swing.GroupLayout(innerbg);
        innerbg.setLayout(innerbgLayout);
        innerbgLayout.setHorizontalGroup(
            innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerbgLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cplace, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmail, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crole, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(uicuname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uicname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uicaddr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(uiuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmno)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerbgLayout.createSequentialGroup()
                        .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerbgLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Uplace, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(Uno)
                                    .addComponent(Uemail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerbgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Uid, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Userrole, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Useraddr, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))
                    .addGroup(innerbgLayout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(uiinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(498, 498, 498)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(innerbgLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        innerbgLayout.setVerticalGroup(
            innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerbgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uiinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerbgLayout.createSequentialGroup()
                        .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerbgLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Uid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(innerbgLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(uiuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerbgLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(uicuname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(crole, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Userrole, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(uicname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uicaddr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Useraddr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(innerbgLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(innerbgLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Uplace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cplace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(innerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Uemail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pbgLayout = new javax.swing.GroupLayout(pbg);
        pbg.setLayout(pbgLayout);
        pbgLayout.setHorizontalGroup(
            pbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pbgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pbgLayout.setVerticalGroup(
            pbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbgLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(innerbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbg, javax.swing.GroupLayout.DEFAULT_SIZE, 1385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String role = LoginSession.Usertype;
        if(role.equals("Customer"))
        {
        new CHomepage().setVisible(true);
        this.dispose();
        }
        if(role.equals("Farmer"))
        {
        new FHomepage().setVisible(true);
        this.dispose();
        }
        if(role.equals("Merchant"))
        {
        new MHomepage().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String role = LoginSession.Usertype;
        if(role.equals("Customer"))
        {
        new CHomepage().setVisible(true);
        this.dispose();
        }
        if(role.equals("Farmer"))
        {
        new FHomepage().setVisible(true);
        this.dispose();
        }
        if(role.equals("Merchant"))
        {
         new MHomepage().setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            String uid = Uid.getText();
            String username = Username.getText() ;
            String addr = Useraddr.getText();
            String place = Uplace.getText();
            String mno = Uno.getText();
            String email = Uemail.getText();
            String role = Userrole.getText();
        if(role.equals("Customer"))
        {
            try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry","root","root");
            String query = "Update customer set Customer_name = ? , Customer_addr = ? , Customer_place = ? , Customer_mno = ?, Customer_email = ? where Customer_uid = ?";
           
            
            PSt = con.prepareStatement(query);
            PSt.setString(1,username);
            PSt.setString(2,addr);
            PSt.setString(3,place);
            PSt.setString(4,mno);
            PSt.setString(5,email);
            PSt.setString(6,uid);
            PSt.executeUpdate();
            
            String qr = "Update users set Uplace = ?, Uphoneno = ?  where Userid = ?";
            PSt = con.prepareStatement(qr);
            PSt.setString(1,place);
            PSt.setString(2,mno);
            PSt.setString(3,uid);
            PSt.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Profile Updated");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
        if(role.equals("Farmer"))
        {
            try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry","root","root");
            String query = "Update farmer set Farmer_name = ? , Farmer_addr = ? , Farmer_place = ? , Farmer_mno = ?, Farmer_email = ? where Farmer_uid = ?";
            PSt = con.prepareStatement(query);
            PSt.setString(1,username);
            PSt.setString(2,addr);
            PSt.setString(3,place);
            PSt.setString(4,mno);
            PSt.setString(5,email);
            PSt.setString(6,uid);
            PSt.executeUpdate();
            
            String qr = "Update users set Uplace = ?, Uphoneno = ?  where Userid = ?";
            PSt = con.prepareStatement(qr);
            PSt.setString(1,place);
            PSt.setString(2,mno);
            PSt.setString(3,uid);
            PSt.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Profile Updated");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
        
        if(role.equals("Merchant"))
        {
            try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poultry","root","root");
            String query = "Update merchant set Merchant_name = ? , Merchant_addr = ? , Merchant_place = ? , Merchant_mno = ?, Merchant_email = ? where Merchant_uid = ?";
            PSt = con.prepareStatement(query);
            PSt.setString(1,username);
            PSt.setString(2,addr);
            PSt.setString(3,place);
            PSt.setString(4,mno);
            PSt.setString(5,email);
            PSt.setString(6,uid);
            PSt.executeUpdate();
            
            String qr = "Update users set Uplace = ?, Uphoneno = ?  where Userid = ?";
            PSt = con.prepareStatement(qr);
            PSt.setString(1,place);
            PSt.setString(2,mno);
            PSt.setString(3,uid);
            PSt.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Profile Updated !");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
        
        JOptionPane.showMessageDialog(this,"Please Login to View Changes");
        LoginPage login = new LoginPage();
        Logout.logout(this, login);
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void UemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UemailKeyReleased
        String email = Uemail.getText();
        if(email.length() == 0){
            Uemail.setBackground(Color.white);
        }
        else if(!(Pattern.matches("[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",Uemail.getText() ))){
            Uemail.setBackground(new Color(255,102,102));
        }
        else{
           Uemail.setBackground(Color.green);
        }
    }//GEN-LAST:event_UemailKeyReleased

    private void UnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnoKeyReleased
        String mobno = Uno.getText();
        if(mobno.length() == 0) {
            Uno.setBackground(Color.white);
        }
        else if(mobno.matches("^[0-9]*$") && mobno.length() == 10){
            Uno.setBackground(Color.green);
        }
        else {
            Uno.setBackground(new Color(255,102,102));
        }
    }//GEN-LAST:event_UnoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Viewprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Uemail;
    private javax.swing.JTextField Uid;
    private javax.swing.JTextField Uname;
    private javax.swing.JTextField Uno;
    private javax.swing.JTextField Uplace;
    private javax.swing.JTextField Useraddr;
    private javax.swing.JTextField Username;
    private javax.swing.JTextField Userrole;
    private javax.swing.JLabel cmail;
    private javax.swing.JLabel cmno;
    private javax.swing.JLabel cplace;
    private javax.swing.JLabel crole;
    private javax.swing.JPanel innerbg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pbg;
    private javax.swing.JLabel uicaddr;
    private javax.swing.JLabel uicname;
    private javax.swing.JLabel uicuname;
    private javax.swing.JLabel uiinfo;
    private javax.swing.JLabel uiuserid;
    // End of variables declaration//GEN-END:variables
}
